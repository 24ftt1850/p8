import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomIndex = rand.nextInt(10);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        int[] secret = Arrays.copyOfRange(numbers, 0, 4);
        int chances = 10;
        boolean win = false;

        while (chances > 0) {
            int score = 0;
            System.out.print("\nGuess 4 numbers (no duplicates): ");
            int[] guess = new int[4];

            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                if (guess[i] == secret[i]) {
                    score++;
                }
            }

            chances--;
            System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");

            if (score == 4) {
                System.out.println("\nYou got all the numbers correct! You win!");
                win = true;
                break;
            }
        }

        if (!win) {
            System.out.print("\nThe actual number is ");
            for (int i = 0; i < 4; i++) {
                System.out.print(secret[i] + " ");
            }
            System.out.println("You Lose.");
        }

    }
}
