package scripts.JKGRunecrafter.Tasks;

import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api2007.Banking;
import org.tribot.api2007.Equipment;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSItem;

import scripts.JKGRunecrafter.Conditions;
import scripts.JKGRunecrafter.Altars.AbstractAltar;
import scripts.JkgAPI.Framework.Task;
import scripts.JkgAPI.Game.Condition;
import scripts.JkgAPI.Game.Inventory;
import scripts.JkgAPI.Game.Movement;
import scripts.JkgAPI.Game.Variables;
import scripts.JkgAPI.Game.Helpers.BankingHelper;

public class FetchTiaraOrTalisman implements Task {
	@Override
	public int priority() {
		return 10;
	}

	@Override
	public boolean validate() {
		return false;
	}

	@Override
	public void execute() {
	}
}
