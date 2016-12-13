package scripts.JKGRunecrafter.Altars;

import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

public class EarthAltar extends AbstractAltar {

	private final RSArea bankArea = new RSArea(new RSTile(3250, 3422, 0), new RSTile(3254, 3420, 0));
	private final RSArea altarArea = new RSArea(new RSTile(2637, 4860, 0), new RSTile(2690, 4810, 0));
	private final RSTile altarLocation = new RSTile(3305, 3473, 0);

	@Override
	public int index() {
		return 2;
	}

	@Override
	public RSTile getAltarLocation() {
		return altarLocation;
	}

	@Override
	public RSArea getBankArea() {
		return bankArea; // varrock west
	}

	@Override
	public String getRuneName() {
		return "Earth";
	}

	@Override
	public String getTiaraName() {
		return "Earth tiara";
	}

	@Override
	public String getTalismanName() {
		return "Earth talisman";
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
