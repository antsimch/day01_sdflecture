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

        int age = 38;

        System.out.printf("%s is %d years old\n", name, age);

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

    }
}
