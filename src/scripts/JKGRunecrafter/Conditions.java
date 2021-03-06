package scripts.JKGRunecrafter;

import org.tribot.api.General;
import org.tribot.api.types.generic.Condition;
import org.tribot.api2007.Equipment;
import org.tribot.api2007.Player;
import scripts.JKGRunecrafter.Altars.AbstractAltar;
import scripts.JkgAPI.Game.Inventory;

public class Conditions {

    public static Condition UntilTiaraEquipped(AbstractAltar altar) {
        return new Condition() {
            public boolean active() {
                General.sleep(50);
                return Equipment.isEquipped(altar.getTiaraName());
            }
        };
    }

    public static Condition UntilHasTiaraInInventory(AbstractAltar altar) {
        return new Condition() {
            public boolean active() {
                General.sleep(50);
                return Inventory.hasItem(altar.getTiaraName());
            }
        };
    }

    public static Condition UntilHasTalismanInInventory(AbstractAltar altar) {
        return new Condition() {
            public boolean active() {
                General.sleep(50);
                return Inventory.hasItem(altar.getTalismanName());
            }
        };
    }

    public static Condition UntilInAltar(AbstractAltar altar) {
        return new Condition() {
            public boolean active() {
                General.sleep(50);
                return altar.getAltarArea().contains(Player.getPosition());
            }
        };
    }

    public static Condition UntilNotInAltar(AbstractAltar altar) {
        return new Condition() {
            public boolean active() {
                General.sleep(50);
                return !altar.getAltarArea().contains(Player.getPosition());
            }
        };
    }

}