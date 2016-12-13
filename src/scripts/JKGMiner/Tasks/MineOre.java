package scripts.JKGMiner.Tasks;

import scripts.JkgAPI.Framework.Task;

public class MineOre implements Task {

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
		// Here we start mining a rock
		long check_time = Timing.currentTimeMillis() + General.random(20000, 30000);
		while (isMining()) {
		 if (notWinningManyResources() && Timing.currentTimeMillis() >= check_time) { // Check if we should switch resources
		  if (this.abc_util.shouldSwitchResources(getCompetitionCount()) {
		    switchResources(); //Switch resources			return;
		   }
		   check_time = Timing.currentTimeMillis() + General.random(20000, 30000); // Generate a new check time	
		  }
		 }
	}
}
