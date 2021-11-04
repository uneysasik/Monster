package be.intecbrussel;

public class MonsterApp {
    @Override
    public String toString() {
        return "MonsterApp{}";
    }

    public static void main(String[] args) {

        Bear myBear = new Bear();
        Witch myWitch = new Witch();

        myBear.ClawAttack();
        myWitch.fireballAttack();

        MagicMonster myMagicMonster = new MagicMonster();

        MightMonster myMightMonster = new MightMonster() {
            @Override
            public void fireballAttack() {

            }

            @Override
            public void ClawAttack() {

            }
        };


            };
        };
