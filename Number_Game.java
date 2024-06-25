import java.util.Scanner;
import java.util.Random;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        Random robj = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int lowerLimit = 1;
            int upperLimit = 100;
            int maxAttempts = 5;
            int attempts = 0;
            int randomNumber = robj.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            boolean guessCorrectly = false;

            System.out.println("Guess the number between " + lowerLimit + " to " + upperLimit);

            while (attempts < maxAttempts && !guessCorrectly) {
                System.out.print("Enter your guessed number: ");
                int guessedNumber = sobj.nextInt();
                attempts++;

                if (guessedNumber == randomNumber) {
                    System.out
                            .println("Congratulations! You guessed the number correctly in " + attempts + "attempts.");
                    guessCorrectly = true;
                } else if (guessedNumber < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

            }

            if (!guessCorrectly) {
                System.out.printye("Sorry! You used all your attempts. The number was " + randomNumber + ".");
            }

            System.out.println("Do you want to play again? (Yes/No): ");
            String response = sobj.next();
            playAgain = response.equalsIgnoreCase("Yes");
        }

        System.out.println("Thank you for playing.");
        sobj.close();

    }
}





System.out.print("Math: ");
int subMath = sobj.nextInt();

System.out.print("Science: ");
int subSci = sobj.nextInt();

System.out.print("Geography: ");
int subGeo = sobj.nextInt();

System.out.print("History: ");
int subHist = sobj.nextInt();