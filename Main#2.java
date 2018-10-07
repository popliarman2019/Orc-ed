import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Name your charactar: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("You are a mage.");
        System.out.print("Choose your skills. (Note: Each skill must have at least 10 points and the sum of your three traits cannot exceed 50 points)\nChoose your strength: ");
        int strength = sc.nextInt();
        System.out.print("Choose your Agility: ");
        int agility = sc.nextInt();
        System.out.print("Choose your Intelligence: ");
        int intelligence = sc.nextInt();

        Random rand = new Random();
        double multiplier = rand.nextDouble() + 0.5;
        double hit = multiplier * intelligence * 11;
        System.out.print("You are facing a level 10 Orc with 100 Hit Points. \nType 'Play' to play turn 1.");
        sc.next();
        double hp1 = 1000-hit;
        System.out.println("The Orc has " + hp1 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 2.");
        sc.next();
        double hp2 = hp1-hit;
        System.out.println("The Orc has " + hp2 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 3.");
        sc.next();
        double hp3 = hp2 - hit;
        System.out.println("The Orc has " + hp3 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 4.");
        sc.next();
        double hp4 = hp3-hit;
        System.out.println("The Orc has " + hp4 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 5.");
        sc.next();
        double hp5 = hp4-hit;
        System.out.println("The Orc has " + hp5 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 6.");
        sc.next();
        double hp6 = hp5-hit;
        System.out.println("The Orc has " + hp6 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 7.");
        sc.next();
        double hp7 = hp6-hit;
        System.out.println("The Orc has " + hp7 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 8.");
        sc.next();
        double hp8 = hp7-hit;
        System.out.println("The Orc has " + hp8 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 9.");
        sc.next();
        double hp9 = hp8-hit;
        System.out.println("The Orc has " + hp9 + "hit points left");

        multiplier = rand.nextDouble() + 0.5;
        hit = multiplier * intelligence * 11;
        System.out.print("Type 'play' to play turn 10.");
        sc.next();
        double hp10 = hp9-hit;
        System.out.println("Thanks for playing. Final Orc HP is " + hp10 + ".\nIf the number is negative, you have beaten the Orc");

    }
}
