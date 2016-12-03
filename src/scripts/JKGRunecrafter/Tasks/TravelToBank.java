package scripts.JKGRunecrafter.Tasks;

import org.tribot.api2007.ext.Filters;

import scripts.JKGRunecrafter.Altars.AbstractAltar;
import scripts.JkgAPI.Framework.Task;
import scripts.JkgAPI.Game.Antiban;
import scripts.JkgAPI.Game.Inventory;
import scripts.JkgAPI.Game.Movement;
import scripts.JkgAPI.Game.Variables;

public class TravelToBank implements Task {
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
	}
}
