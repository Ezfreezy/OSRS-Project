package scripts.JKGRunecrafter.Altars;

import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;
import scripts.JKGRunecrafter.Altars.AbstractAltar;

public class WaterAltar extends AbstractAltar {

	private final RSArea bankArea = new RSArea(new RSTile(3092, 3245, 0), new RSTile(3095, 3241, 0));
	private final RSArea altarArea = new RSArea(new RSTile(2702, 4850, 0), new RSTile(2726, 4820, 0));
	private final RSTile altarLocation = new RSTile(3184, 3164, 0);

	@Override
	public int index() {
		return 4;
	}

	@Override
	public RSTile getAltarLocation() {
		return altarLocation;
	}

	@Override
	public RSArea getBankArea() {
		return bankArea; // draynor
	}

	@Override
	public String getRuneName() {
		return "Water";
	}

	@Override
	public String getTiaraName() {
		return "Water tiara";
	}

	@Override
	public String getTalismanName() {
		return "Water talisman";
	}

	@Override
	public RSArea getAltarArea() {
		return altarArea;
	}

	@Override
	public boolean requirePureEssence() {
		return false;
	}
}