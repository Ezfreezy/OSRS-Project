package StrongholdOfSecurity;

import org.tribot.script.Script;

import scripts.JkgAPI.Framework.Task;
import scripts.JkgAPI.Framework.TaskSet;

public class StrongholdOfSecurity extends Script {
	boolean run = true;
	String status = "";
	TaskSet taskSet = new TaskSet();
	
	@Override
	public void run() {
		taskSet.addAll();
		while (run) {
			sleep(60);
			Task task = taskSet.getValidTask();
			if (task != null) {
				status = task.toString();
				task.execute();
			}
		}
	}
}
