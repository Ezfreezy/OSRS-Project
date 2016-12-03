package scripts.JKGRunecrafter.Tasks;

import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api2007.Player;

import scripts.JKGRunecrafter.Conditions;
import scripts.JKGRunecrafter.Altars.AbstractAltar;
import scripts.JkgAPI.Framework.Task;
import scripts.JkgAPI.Game.Variables;
import scripts.JkgAPI.Game.Helpers.ObjectsHelper;

public class ExitAltar implements Task {
	@Override
	public int priority() {
		return 8;
	}

	@Override
	public boolean validate() {
		return false;
	}

	@Override
	public void execute() {
	}
}
