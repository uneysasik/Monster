package be.intecbrussel;

public abstract class MightMonster extends Monster {

    private static final int maxMP = 50;
    private static int ragePoints = 5;
    private static int maxRP;

    public void mightMonster(int maxHP, int maxRP) {
        maxHP=50;
        maxRP=5;
    }
    public MightMonster(int maxHP) {
        super(maxHP, maxMP);
    }
    public MightMonster() {
        super(maxMP);
    }
    public static int getRagePoints() {
        return ragePoints;
    }
    public static void setragePoints(int ragePoints) {
        be.intecbrussel.MightMonster.ragePoints = ragePoints;
    }

    @Override
    public String toString() {
        return "MightMonster{}";
    }

    public void restoreMP(int h) {
    }
    public static void useRp(int d) {
    }
    public abstract void ClawAttack();
}
