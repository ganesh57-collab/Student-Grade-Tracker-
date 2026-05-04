import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        int n;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Check for zero students
        if (n == 0) {
            System.out.println("No students data entered.");
            return;
        }

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int m = sc.nextInt();
            sc.nextLine(); // clear buffer

            names.add(name);
            marks.add(m);
        }

        // Calculating average, highest, lowest
        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int i = 0; i < marks.size(); i++) {
            int value = marks.get(i);

            total = total + value;

            if (value > highest) {
                highest = value;
            }

            if (value < lowest) {
                lowest = value;
            }
        }

        double average = (double) total / n;

        // Display report
        System.out.println("\n------ Student Report ------");

        for (int i = 0; i < n; i++) {
            System.out.println(names.get(i) + " : " + marks.get(i));
        }

        System.out.println("\nAverage Marks = " + average);
        System.out.println("Highest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);

        sc.close();
    }
}