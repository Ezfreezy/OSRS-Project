package scripts;

import org.tribot.api.General;
import org.tribot.api2007.NPCChat;
import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;

import scripts.JkgAPI.Core.TalkNpc;

@ScriptManifest(authors = { "Jkg58" }, category = "Quests", name = "What Lies Below")
public class WhatLiesBelow extends Script {

	@Override
	public void run() {

		//startQuest();
		//walkToBandits();
		//killBandits();
		//walkToBurgiss();
		//talkToBurgiss();
		//walkToSurok();
		//talkToSurok();
		//walkToAnna();
		//talkToAnna();
		//walkToAltar();
		//walkToSurok2();
		//talkToSurok2();
		//walkToBurgiss2();
		//talkToBurgiss2();
		//walkToZaff();
		//talkToZaff();
		//walkToSurok3();
		//talkToSurok3();
		//killKing();
		//talkToSurok4();
		//walkToZaff2();
		//talkToZaff2();
		//walkToBurgiss3();
		//finishQuest();
	}

	public void startQuest() {

		TalkNpc.talkToNpc("Rat Burgiss");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		NPCChat.selectOption("Oh dear. Well, I hope you get to Varrock okay!", true);
		General.sleep(500, 1000);

		TalkNpc.talkToNpc("Rat Burgiss");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		NPCChat.selectOption("Shall I get them for you?", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		NPCChat.selectOption("Of course! Tell me what you need me to do.", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);

		// check quest
	}

	public void walkToBandits() {

	}

	public void killBandits() {
		// pick up 5 pages
		// use on backpack

	}

	public void walkToBurgiss() {

	}

	public void talkToBurgiss() {

		TalkNpc.talkToNpc("Rat Burgiss");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
//look at page
	}

	public void walkToSurok() {

	}

	public void talkToSurok() {

		TalkNpc.talkToNpc("Surok Magis");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		NPCChat.selectOption("No thanks. I have things to do for now!", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		NPCChat.selectOption("Go on then!", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
	
	public void walkToAnna() {

	}

	public void talkToAnna() {

		TalkNpc.talkToNpc("Surok Magis");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		NPCChat.selectOption("Okay, I'd better go.", true);
		General.sleep(500, 1000);
		
		//excavate statue
		
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
	
	public void walkToAltar() {
		//through hole, through tunnel to portal then navigate bridges, wand on altar
		
	}
	
	public void walkToSurok2() {

	}

	public void talkToSurok2() {

		TalkNpc.talkToNpc("Surok Magis");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		NPCChat.selectOption("I have the things you wanted!", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
	
	public void walkToBurgiss2() {

	}

	public void talkToBurgiss2() {

		TalkNpc.talkToNpc("Rat Burgiss");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		NPCChat.selectOption("Yes! I have a letter for you.", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
	
	public void walkToZaff() {

	}

	public void talkToZaff() {

		TalkNpc.talkToNpc("Zaff");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		NPCChat.selectOption("Rat Burgiss sent me!", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		//wear ring
	}
	
	public void walkToSurok3() {

	}

	public void talkToSurok3() {

		TalkNpc.talkToNpc("Surok Magis");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		NPCChat.selectOption("Bring it on!", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
	
	public void killKing() {
     //operate ring when 0 hp
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
		//click surok
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
	
	public void talkToSurok4() {
		
		TalkNpc.talkToNpc("Surok Magis");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
	
	public void walkToZaff2() {

	}

	public void talkToZaff2() {

		TalkNpc.talkToNpc("Zaff");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		NPCChat.selectOption("We did it! We beat Surok!", true);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
	
	public void walkToBurgiss3() {

	}
	
	public void finishQuest() {
		
		TalkNpc.talkToNpc("Rat Burgiss");
		NPCChat.clickContinue(false);
		General.sleep(500, 1000);
		TalkNpc.continueLoop();
		General.sleep(500, 1000);
	}
}
