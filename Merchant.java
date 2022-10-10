import java.util.Scanner;

public class Merchant {
    public static void goods(Player player) {
        System.out.println("Welcome to my shop!");
        navigation(player);

        Scanner scan = new Scanner(System.in);
        String goods = scan.nextLine();
        boolean t = true;
        while (t == true) {
            switch (goods) {
                case "1": {
                    if (player.gold >= 100) {player.health += 200;
                        player.gold -=100;
                    System.out.println(player); t=false;}
                    else {System.out.println("Not enough gold!"); t=false;}
                    break;
                }

                case "2": {
                    t=false;
                    break;
                }
                default:
                    System.out.println("Incorrect input!");
                    goods = scan.nextLine();
            }

        }
    }

    private static void navigation(Player player) {
        System.out.println("1. Buy a health potion (+200hp) for 100 gold");
        System.out.println("2. Return");
        System.out.println(player.name + " health:" + player.health +"hp");
        System.out.println("You have: " + player.gold + "gold");
        System.out.println("Make your choice!");
    }
}
