package be.intecbrussel;

import java.util.Objects;

public class Witch extends MagicMonster {

    private String name;

    public Witch() {

    }

    public Witch(int i) {

    }

    public static void Witch() {

    }

    public void Witch(int hitPoints) {

    }


    public Witch(int hitPoints, int magicPoints) {
        super.setMagicPoints(magicPoints);
        super.setHitPoints(hitPoints);

    }

    public Witch(Witch witch) {
        this(witch.getHitPoints(),
 witch.getMagicPoints());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Witch witch = (Witch) o;
        return Objects.equals(name, witch.name);
    }

    @Override
    public String toString() {
        return "Witch{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    // methods
    @Override
    public void setHitPoints(int hitPoints) {
        super.setHitPoints(hitPoints);
    }

    @Override
    public void setMagicPoints(int magicPoints) {
        super.setMagicPoints(magicPoints);
    }

    @Override
    public void fireballAttack() {
        System.out.println("fwooosh!!");
    }





}
