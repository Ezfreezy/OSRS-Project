package practice.PracticeWC.Tasks;

import org.tribot.api2007.Objects;
import org.tribot.api2007.types.RSObject;
import org.tribot.script.Script;
import org.tribot.api.input.Mouse;
import org.tribot.api.util.abc.ABCUtil;

public class CutWood extends Script {
	
	ABCUtil abc =  new ABCUtil();
	private Object abc_util;
	boolean should_hover = false;
	boolean open_menu = false;
	private boolean is_hovering;

	@Override
	public void run() {
		Chop();

	}

	public void Chop() {
		RSObject[] tree = Objects.findNearest(10, "Tree");

		if (tree[0].click("Chop down")) {
			this.should_hover = ((ABCUtil) this.abc_util).shouldHover();
			 this.open_menu = ((ABCUtil) this.abc_util).shouldOpenMenu(); // Generate other conditions for actions	handleChopping();
			}
			if (((ABCUtil) this.abc_util).shouldMoveMouse())
				((ABCUtil) this.abc_util).moveMouse();

			final RSObject[] objects = getPossibleTargets();
			if (objects == null || objects.length < 1) 
			return;

			final RSObject next_target = (RSObject) ((ABCUtil) this.abc_util).selectNextTarget(objects);
			
			if (!findNextTarget()) { // If we are here, then there does not exist a next target/resource yet
				 if (((ABCUtil) this.abc_util).shouldMoveToAnticipated()) { // Check if we should move to the anticipated location...	
				  performReactionTimeWait(); // Sleep for the generated reaction time		
				  moveToAnticipated(); // Move to the anticipated location	
				 }
		}
	}
}

	private void moveToAnticipated() {
		// TODO Auto-generated method stub
		
	}

	private void performReactionTimeWait() {
		// TODO Auto-generated method stub
		
	}

	private boolean findNextTarget() {
		// TODO Auto-generated method stub
		return false;
	}

	private RSObject[] getPossibleTargets() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void dfg() {
		Object isChopping;
		handleChoppingwhile(isChopping); {
			 if (Mouse.isInBounds() && this.is_hovering) {
			  findNextTarget();
			  if (this.open_menu)
			   openMenuForNextTarget();
			 }
	}
}

	private void openMenuForNextTarget() {
		// TODO Auto-generated method stub
		
	}
	}
