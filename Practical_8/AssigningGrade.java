import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = input.nextInt();

        int[] scores = new int[num];
        char[] grades = new char[num];

        System.out.println("Enter the " + num + " scores");
        for (int i = 0; i < num; i++) {
            scores[i] = input.nextInt();
        }

        int best = scores[0];
        for (int i = 1; i < num; i++) {
            if (scores[i] > best)
                best = scores[i];
        }

        for (int i = 0; i < num; i++) {
            if (scores[i] >= best - 10)
                grades[i] = 'A';
            else if (scores[i] >= best - 20)
                grades[i] = 'B';
            else if (scores[i] >= best - 30)
                grades[i] = 'C';
            else if (scores[i] >= best - 40)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        for (int i = 0; i < num; i++) {
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grades[i]);
        }

        input.close();
    }
}
