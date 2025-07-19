import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        String adjective1 = "";
        String adjective2 = "";
        String adjective3 = "";
        String adjective4 = "";

        String noun1 = "";

        String pronoun1 = "";

        String verb1 = ""; // Not used yet, but you can add it later!

        // Story Prompt
        System.out.println("Today I went to a _____ zoo.");
        System.out.println("In an exhibit, I saw a _____.");
        System.out.println("_____ was _____ and _____!");
        System.out.println("I was _____!");

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Hint 1: Enter an adjective (to describe the zoo): ");
        adjective1 = sc.nextLine();

        System.out.print("Hint 2: Enter a noun (an animal): ");
        noun1 = sc.nextLine();

        System.out.print("Hint 3: Enter a pronoun (he/she/it): ");
        pronoun1 = sc.nextLine();

        System.out.print("Hint 4a: Enter an adjective (to describe the animal): ");
        adjective2 = sc.nextLine();

        System.out.print("Hint 4b: Enter another adjective (to describe the animal): ");
        adjective3 = sc.nextLine();

        System.out.print("Hint 5: Enter an adjective (to describe your feeling): ");
        adjective4 = sc.nextLine();

        // Final story output
        System.out.println();
        System.out.println("Your Mad Libs Story:");
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(pronoun1 + " was " + adjective2 + " and " + adjective3 + "!");
        System.out.println("I was " + adjective4 + "!");

        sc.close();
    }
}