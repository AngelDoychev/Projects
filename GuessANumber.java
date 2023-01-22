package FirstStepsInCoding.Fundamentals.Projects;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = 0;
        while (true) {
            number = random.nextInt(101);
            if (number != 0) {
                break;
            }
        }
        System.out.println("The computer has generated a random number between 1-100.\n Can you guess it?");
        Thread.sleep(500);
        System.out.println("Please input your guess:");
        int input = Integer.parseInt(scanner.nextLine());
        while (true) {
            System.out.println("Calculating response!");
            System.out.println(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            if (input < number) {
                System.out.println("The number you entered is too low.");
            }
            if (input > number) {
                System.out.println("The number you entered is too high.");
            }
            if (input == number) {
                System.out.println("You guessed it!");
                break;
            }
            input = Integer.parseInt(scanner.nextLine());
        }
    }
}
