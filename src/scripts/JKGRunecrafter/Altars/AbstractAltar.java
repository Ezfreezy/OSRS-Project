package scripts.JKGRunecrafter.Altars;

import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

public abstract class AbstractAltar {

	public abstract int index();

	public abstract RSTile getAltarLocation();

	public abstract RSArea getBankArea();

	public abstract RSArea getAltarArea();

	public abstract String getRuneName();

	public abstract String getTiaraName();

	public abstract String getTalismanName();

	public abstract boolean requirePureEssence();

}
