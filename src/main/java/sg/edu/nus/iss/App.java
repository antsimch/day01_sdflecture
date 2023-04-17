package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Console console = System.console();

        String name = console.readLine("What is your name? ");

        if (name.length() > 0) {
            System.out.printf("Nice to meet you, %s\n", name);
        } else {
            System.out.println("You have not told me your name");
        }

        // int age = 38;
        int myAge = 0;
        String inputAge = console.readLine("What is your age? ");

        myAge = Integer.parseInt(inputAge);

        if ((myAge >= 0) && (myAge <= 2)) {
            System.out.println("You are a baby");
        } else if ((myAge > 2) && (myAge <= 4)) {
            System.out.println("You are a toddler");
        } else if ((myAge > 4) && (myAge <= 12)) {
            System.out.println("You are a child");
        } else if ((myAge > 12) && (myAge < 19)) {
            System.out.println("You are a teen");
        } else {
            System.out.println("You are an adult");
        }
        

        System.out.printf("%s is %d years old\n", name, myAge);

        String input = console.readLine("What is your hobby? ");
        input = input.trim();

        // if (input.equals("swim")) {
        //     System.out.println("The nearest swimming pool is Clementi");
        // } else if (input.equals("jog")) {
        //     System.out.println("The nearest park is West Coast Park");
        // } else if (input.equals("cycle")) {
        //     System.out.println("You could cycle along the PCN");
        // } else {
        //     System.out.println("Seems like you are a boring person without hobby");
        // }

        switch(input) {
            case("swim"):
                System.out.println("The nearest swimming pool is Clementi");
                break;
            case("jog"):
                System.out.println("The nearest park is West Coast Park");
                break;
            case("cycle"):
                System.out.println("You could cycle along the PCN");
                break;
            default:
                System.out.println("Seems like you are a boring person without hobby");
                break;
        }
        
        int i = 0;

        String inputPhrase = console.readLine("Type a phrase: ");

        while (i < inputPhrase.length()) {
            System.out.println(inputPhrase.substring(0,i));
            i++;
        }

    }
}
