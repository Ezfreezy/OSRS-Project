package scripts.JKGCowKiller.Tasks;

import org.tribot.api.util.abc.ABCUtil;

import scripts.JkgAPI.Framework.Task;

public class Eating implements Task {

	ABCUtil abc = new ABCUtil();

	private ABCUtil abc_util;
	
	int eat_at = ((ABCUtil) this.abc_util).generateEatAtHP();
	
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
		
		if (getHPPercent() <= this.eat_at) {
			eatFood();
			this.eat_at = ((ABCUtil) this.abc_util).generateEatAtHP();
	}
}

	private void eatFood() {
		// TODO Auto-generated method stub
		
	}

	private int getHPPercent() {
		// TODO Auto-generated method stub
		return 0;
	}
}