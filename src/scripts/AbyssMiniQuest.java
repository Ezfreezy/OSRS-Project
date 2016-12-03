package scripts;

import org.tribot.api.Clicking;
import org.tribot.api.DynamicClicking;
import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api2007.Interfaces;
import org.tribot.api2007.Inventory;
import org.tribot.api2007.NPCChat;
import org.tribot.api2007.Objects;
import org.tribot.api2007.PathFinding;
import org.tribot.api2007.WebWalking;
import org.tribot.api2007.ext.Doors;
import org.tribot.api2007.ext.Filters;
import org.tribot.api2007.types.RSItem;
import org.tribot.api2007.types.RSObject;
import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;

import scripts.JkgAPI.Core.Conditions;
import scripts.JkgAPI.Core.TalkNpc;

@ScriptManifest(authors = { "Jkg58" }, category = "Quests", name = "Abyss Mini Quest")
public class AbyssMiniQuest extends Script {

	@Override
	public void run() {
		//startQuest();
		//walkToMage();
		//talkToMage();
		//walkToAubury();
		//walkToSedridor();
		//walkToCromperty();
		//walkToMage2();
		//talkToMage2();
		//readBook();
		//finishQuest();

	}

	public void startQuest() {

		TalkNpc.talkToNpc("Mage of Zamorak");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
	}

	public void walkToMage() {

		RSItem[] v_tele = Inventory.find(Filters.Items.nameEquals("Varrock teleport"));

		if (v_tele.length > 0)
			;
		Clicking.click(v_tele);

		if (WebWalking.walkTo(Area1.getRandomTile()))
			Timing.waitCondition(Conditions.areaContains(Area1), General.random(6000, 9000));

		if (Doors.isDoorAt(door1, false)) {
			do {
				if (Doors.handleDoorAt(door1, true))
					Timing.waitCondition(Conditions.areaContains(Area2), General.random(2000, 3000));
			} while (!PathFinding.canReach(church, false));
		}
	}

	public void talkToMage() {

		TalkNpc.talkToNpc("Mage of Zamorak");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		NPCChat.selectOption("Where do you get your runes from?", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		NPCChat.selectOption("Yes", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}

	public void walkToAubury() { // rightclick & teleport

		if (WebWalking.walkTo(Area2.getRandomTile()))
			Timing.waitCondition(Conditions.areaContains(Area2), General.random(6000, 9000));

		if (Doors.isDoorAt(door2, false)) {
			do {
				if (Doors.handleDoorAt(door2, true))
					Timing.waitCondition(Conditions.areaContains(Area3), General.random(2000, 3000));
			} while (!PathFinding.canReach(rcShop, false));
		}
	}

	// amulet of glory teleport to draynor //
	// other methods treegnomehold magegyanille

	public void walkToSedridor() { // go through next door, down stairs then to
									// wizard

		if (WebWalking.walkTo(Area1.getRandomTile()))
			Timing.waitCondition(Conditions.areaContains(Area1), General.random(6000, 9000));

		if (Doors.isDoorAt(door1, false)) {
			Doors.handleDoorAt(door1, true);
			Timing.waitCondition(Conditions.canReach(towertile), General.random(3000, 4000));
		}

		RSObject[] doors = Objects.findNearest(10,
				Filters.Objects.nameContains("Door").combine(Filters.Objects.actionsContains("Open"), true));
		for (RSObject a : doors) {
			if (a.getPosition().equals(door2)) {
				do {
					if (DynamicClicking.clickRSObject(a, "Open")) {
						Timing.waitCondition(Conditions.canReach(towertile2), General.random(5000, 6000));
					}
				} while (PathFinding.canReach(towertile2, false));
			}
		}

		if (WebWalking.walkTo(Area333.getRandomTile()))
			Timing.waitCondition(Conditions.areaContains(Area333), General.random(6000, 9000));

		RSObject[] ladder = Objects.findNearest(5, Filters.Objects.nameEquals("Ladder"));

		if (DynamicClicking.clickRSObject(ladder[0], "Climb-down")) {
			Timing.waitCondition(Conditions.canReach(towertile3), General.random(5000, 6000));
		}
		while (PathFinding.canReach(towertile3, false))
			;
		General.sleep(2000, 3000);

		if (WebWalking.walkTo(Area33.getRandomTile()))
			Timing.waitCondition(Conditions.areaContains(Area33), General.random(6000, 9000));

	} // rightclick and teleport

	public void walkToCromperty() {
		// tele tab to ardougne //walk to wizard and teleport
	}

	public void walkToMage2() {

		RSItem[] v_tele = Inventory.find(Filters.Items.nameEquals("Varrock teleport"));

		if (v_tele.length > 0)
			;
		Clicking.click(v_tele);

		if (WebWalking.walkTo(Area1.getRandomTile()))
			Timing.waitCondition(Conditions.areaContains(Area1), General.random(6000, 9000));

		if (Doors.isDoorAt(door1, false)) {
			do {
				if (Doors.handleDoorAt(door1, true))
					Timing.waitCondition(Conditions.areaContains(Area2), General.random(2000, 3000));
			} while (!PathFinding.canReach(church, false));
		}
	}

	public void talkToMage2() {

		TalkNpc.talkToNpc("Mage of Zamorak");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);

		TalkNpc.talkToNpc("Mage of Zamorak");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}

	public void readBook() {

		RSItem[] book = Inventory.find(Filters.Items.nameEquals("Abyssal Research Notes"));

		if (book.length > 0)

			Clicking.click(book);
		General.sleep(2000);

		Interfaces.get(49, 85).click("Next Page");
		General.sleep(500, 1000);
		Interfaces.get(49, 85).click("Next Page");
		General.sleep(500, 1000);
		Interfaces.get(49, 85).click("Next Page");
		General.sleep(500, 1000);
		Interfaces.get(49, 85).click("Next Page");
		General.sleep(2000, 3000);
		Interfaces.get(49, 113).click("Ok");
		General.sleep(2000, 3000);

	}

	public void finishQuest() {

		TalkNpc.talkToNpc("Mage of Zamorak");
		NPCChat.selectOption("So what is this 'abyss' stuff?", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);

		TalkNpc.talkToNpc("Mage of Zamorak");
		NPCChat.selectOption("Is this abyss dangerous?", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);

		TalkNpc.talkToNpc("Mage of Zamorak");
		NPCChat.selectOption("Can you teleport me there now?", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}

}
