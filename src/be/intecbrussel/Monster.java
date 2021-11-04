package be.intecbrussel;

import java.util.Objects;

public abstract class Monster {

    private static int hitPoints=8;
    private static int maxHP;
    private final int maxMP;


    public Monster(int maxHP, int maxMP) {
        this.maxMP = 10;
        this.maxHP = 100;
    }

    public Monster(int maxMP) {
        this.maxMP = maxMP;
    }

    public static int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        Monster.hitPoints = hitPoints;
    }

    public static int getMaxHP() {
        return maxHP;
    }

    public static void setMaxHP(int maxHP) {
        Monster.maxHP = maxHP;
    }

    public void heal(int h) { } // eksikler var duzelt

    public static void takeDamage(int d) {
        return;
    }

    protected void setName(String name) {
    }

    protected void setRagePoints(int ragePoints) {
    }

    protected void setholeNumber(int holeNumber) {
    }

    public abstract void fireballAttack();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return maxMP == monster.maxMP;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "maxMP=" + maxMP +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxMP);
    }
}
