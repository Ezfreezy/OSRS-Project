package scripts.JKGRunecrafter.Tasks;

import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api2007.Game;
import org.tribot.api2007.Player;
import org.tribot.api2007.ext.Filters;
import org.tribot.api2007.types.RSItem;

import scripts.JKGRunecrafter.Conditions;
import scripts.JKGRunecrafter.Altars.AbstractAltar;
import scripts.JkgAPI.Framework.Task;
import scripts.JkgAPI.Game.Antiban;
import scripts.JkgAPI.Game.Inventory;
import scripts.JkgAPI.Game.Variables;
import scripts.JkgAPI.Game.Helpers.ObjectsHelper;

public class EnterAltar implements Task {
	@Override
	public int priority() {
		return 5;
	}

	@Override
	public boolean validate() {
		return false;
	}

	@Override
	public void execute() {
	}
}
