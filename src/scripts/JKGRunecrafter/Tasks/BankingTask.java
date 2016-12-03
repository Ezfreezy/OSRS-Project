package scripts.JKGRunecrafter.Tasks;

import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api2007.Banking;
import org.tribot.api2007.Equipment;
import org.tribot.api2007.Player;
import org.tribot.api2007.ext.Filters;
import org.tribot.api2007.types.RSItem;
import scripts.JKGRunecrafter.Altars.AbstractAltar;
import scripts.JkgAPI.Framework.Task;
import scripts.JkgAPI.Game.Antiban;
import scripts.JkgAPI.Game.Condition;
import scripts.JkgAPI.Game.Helpers.BankingHelper;
import scripts.JkgAPI.Game.Inventory;
import scripts.JkgAPI.Game.Variables;

public class BankingTask implements Task {
	@Override
	public int priority() {
		return 7;
	}

	@Override
	public boolean validate() {
		
		return false;
	}

	@Override
	public void execute() {
	}
}
