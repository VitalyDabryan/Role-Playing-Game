public class Battle {
    public static void Atack(Person player, Person monster) {

        Runnable runnable = () -> {
            boolean isHerodead = false;
            int turn = 1;
            int fight;
            int health = player.health;
            int damage;

            while (isHerodead == false) {
                System.out.println("Turn " + turn + ": ");
                System.out.println(player.name + " atack!");

                damage = fightPlayer(player);
                System.out.println("Player damage:" + damage);
                fight = monster.health - damage;
                if (fight > 0) monster.health -= damage;
                else {
                    System.out.println("Player " + player.name + " WIN!!!");
                    player.health = health + 100;
                    player.gold += monster.gold;
                    player.power += 5;
                    player.dexterity += 5;
                    System.out.println("New player parametres: " + player);
                    isHerodead = true;
                    break;
                }
                System.out.println(player);

                fight = player.health - damage;
                if (fight > 0 && isHerodead == false) {
                    System.out.println("Monster atack!");
                    damage = fightMonster(monster);
                    System.out.println("Monster damage:" + damage);
                    player.health -= damage;
                }
                else {
                    System.out.println("Goblin  WIN!!!");
                    player.health = health;
                    isHerodead = true;
                }
                System.out.println(monster);
                turn++;
            }
        };
            Thread thread = new Thread(runnable);
            thread.start();

    }


    private static int fightMonster(Person monster) {
        double hit = Math.random() * monster.dexterity;
        int damage;
        if (hit <= 5) {
            damage = 0;
            System.out.println("Miss!!!");
        } else {
            damage = (int) hit * monster.power / 10;
        }

        return damage;
    }

    private static int fightPlayer(Person player) {
        double hit = Math.random() * player.dexterity;
        int damage;
        if (hit <= 5) {
            damage = 0;
            System.out.println("Miss!!!");
        } else {
            damage = (int) hit * player.power / 10;
        }

        return damage;
    }
}
