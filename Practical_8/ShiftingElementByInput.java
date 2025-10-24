import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers are there? ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.print("Enter the " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter number of left shift: ");
        int shift = input.nextInt();

        for (int s = 0; s < shift; s++) {
            int first = numbers[0];
            for (int i = 0; i < n - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[n - 1] = first;
        }

        System.out.print("\nThe shifted arrangement is:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

