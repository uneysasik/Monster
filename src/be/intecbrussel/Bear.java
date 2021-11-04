package be.intecbrussel;

import java.util.Objects;

public class Bear extends MightMonster {

    private static final int maxMP = 10;

        private int holeNumber=0;

       public void Bear(String name) {
           super.setName(name);
       }

        public int gethitPoints() {
            int hitPoints = 8;
            return hitPoints;
        }

       public void Bear(int hitPoints, int ragePoints) {
           super.setRagePoints(ragePoints);
           super.setHitPoints(hitPoints);

       }

       public void Bear(int holeNumber, int hitPoints, int ragePoints) {
           super.setRagePoints(5);
           super.setHitPoints(50);
           super.setholeNumber(holeNumber);


     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bear bear = (Bear) o;
        return holeNumber == bear.holeNumber;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "holeNumber=" + holeNumber +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), holeNumber);
    }

    @Override
    public void ClawAttack() {
       System.out.println("rooaar!!");
    }

    @Override
    public void fireballAttack() {

    }
}

