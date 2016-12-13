package scripts.JkgAPI.Core;

import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api2007.PathFinding;
import org.tribot.api2007.ext.Doors;
import org.tribot.api2007.types.RSTile;

public class Door {

	public static void openDoor(RSTile door, RSTile tile) {

		if (Doors.isDoorAt(door, false)) {
			do {
				if (Doors.handleDoorAt(door, true))
					Timing.waitCondition(JKGConditions.canReach(tile), General.random(2000, 3000));
			} while (!PathFinding.canReach(tile, false));
		}
	}

}
