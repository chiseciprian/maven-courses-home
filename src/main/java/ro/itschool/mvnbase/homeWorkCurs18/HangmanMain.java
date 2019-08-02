package ro.itschool.mvnbase.homeWorkCurs18;

import java.util.Random;
import java.util.Scanner;

public class HangmanMain {
    public static void main(String[] args) throws BadCharInputException, BadIntergerInput {
        final Random random = new Random();
        String word = Dictionary.words[random.nextInt(Dictionary.words.length)];

        Hangman hangman = new Hangman(word);
        Character c;

        do {
            System.out.println("Enter a letter");
            c = inputVerication();

            if (hangman.guess(c)) {
                System.out.println("Great job");
                System.out.println(hangman.getFound());
            } else {
                System.out.println("Try again");
                System.out.println(hangman.getFound());
            }
        } while (hangman.finished() == false);

        System.out.println("The word is :" + word);
    }

    private static Character inputVerication() throws BadCharInputException, BadIntergerInput {
        Scanner scanner = new Scanner(System.in);
        Character c;
        String input = scanner.next();
        if (isNumeric(input)) {
            throw new BadIntergerInput();
        } else if (input.length() > 1) {
            throw new BadCharInputException();
        } else {
            c = input.charAt(0);
        }
        return c;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

}
