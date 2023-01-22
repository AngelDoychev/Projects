package FirstStepsInCoding.Fundamentals;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = 0;
        while (true) {
            number = random.nextInt(4);
            if (number != 0) {
                break;
            }
        }
        System.out.println("Rock.");
        Thread.sleep(700);
        System.out.println("Paper.");
        Thread.sleep(700);
        System.out.println("Scissors.");
        Thread.sleep(700);
        System.out.println("Shoot!!!");
        String input = scanner.nextLine();
        switch (number) {
            case 1:
                System.out.println("Your opponent picked rock!");
                break;
            case 2:
                System.out.println("Your opponent picked paper!");
                break;
            case 3:
                System.out.println("Your opponent picked scissors!");
                break;
        }
        switch (input) {
            case "rock":
                if (number == 1) {
                    System.out.println("The game has reached a draw!");
                } else if (number == 2) {
                    System.out.println("You loose!");
                } else if (number == 3) {
                    System.out.println("Congratulations, you win!");
                }
                break;
            case "paper":
                if (number == 1) {
                    System.out.println("Congratulations, you win!");
                } else if (number == 2) {
                    System.out.println("The game has reached a draw!");
                } else if (number == 3) {
                    System.out.println("You loose!");
                }
                break;
            case "scissors":
                if (number == 1) {
                    System.out.println("You loose!");
                } else if (number == 2) {
                    System.out.println("Congratulations, you win!");
                } else if (number == 3) {
                    System.out.println("The game has reached a draw!");
                }
                break;
        }
    }
}