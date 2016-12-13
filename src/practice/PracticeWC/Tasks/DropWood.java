package practice.PracticeWC.Tasks;

public class DropWood {

	final OpenBankPreference pref = this.abc_util.generateOpenBankPreference();
	switch (pref) {
	 case BANKER:
	  openBankBanker();
	  break;

	 case BOOTH:
	  openBankBooth();
	  break;

	 default:
	  throw new RuntimeException("Unhandled open bank preference.");
	}
}
