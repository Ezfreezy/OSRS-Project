package scripts.JKGCowKiller.Tasks;

import org.tribot.api2007.Game;
import org.tribot.api2007.Options;
import org.tribot.api.util.abc.ABCUtil;

import scripts.JkgAPI.Framework.Task;

public class TravelToField extends ABCUtil implements Task {
	
	ABCUtil abc =  new ABCUtil();
	private Object abc_util;
	int run_at = this.abc_util.generateRunActivation();
	
	@Override
	public int priority() {
		return 0;
	}

	@Override
	public boolean validate() {
		return false;
	}

	@Override
	public void execute() {
		if (!Game.isRunOn() && Game.getRunEnergy() >= this.run_at) {
			 Options.setRunOn(true);
			 this.run_at = this.abc_util.generateRunActivation();
			}
	}
}