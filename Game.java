import java.io.IOException;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        int health, dexterity, experience, gold, power;
        health = (int) (Math.random() * 2000); // Здоровье
        dexterity = (int) (Math.random()*100); // Ловкость
        experience = (int) (Math.random()*100);  // Опыт
        power = (int) (Math.random()*100);
        gold = (int) (Math.random()*200);
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Player player = new Player(name,health, dexterity, experience, gold, power);
        System.out.println("A hero with parameters " + player + " has been created!");
        Person monster = new Person() {
        };

        double choise = Math.random();
        if (choise < 0.5) {
                monster = new Goblin("Goblin", 700, 50, 40, 100, 90);}

        else { monster =  new Skeleton("Skeleton", 700, 45, 45, 200, 80);            }

        navigation();
        String select = scan.nextLine();

        boolean t = true;
        while (t == true) {
            switch (select) {
                case "1": {
                    Merchant.goods(player); navigation(); select = scan.nextLine(); break;
                }

                case "2": {
                    Battle.Atack(player, monster); navigation();  select = scan.nextLine(); break;
                }

                case "3": {
                    t=false;
                    System.out.println("Game over!");
                    break;
                }
                default:
                    System.out.println("Incorrect input!");
                    select = scan.nextLine(); break;
            }
        }
    }
    private static void navigation() {
        System.out.println("Where do you want to go?");
        System.out.println("1. To the Merchant");
        System.out.println("2. Into the dark forest");
        System.out.println("3. Exit");
    }
}
