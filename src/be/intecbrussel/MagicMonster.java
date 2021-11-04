package be.intecbrussel;

public class MagicMonster extends Monster{

    private static int magicPoints=0;
    private static int maxMP;

    public void magicMonster(int maxHP) {

    }
    public MagicMonster(int maxHP) {
        super(maxHP, maxMP);
    }

    public MagicMonster() {
        super(maxMP);
    }

    public static int getMagicPoints() {
        return magicPoints;
    }


    public void setHitPoints(int hitPoints) {
    }

    public void restoreMP(int h) { }

    public static void useMp(int d) { }

    public void setMagicPoints(int magicPoints) {
    }

    @Override
    public String toString() {
        return "MagicMonster{}";
    }


    @Override
    public void fireballAttack() {

    }
};

