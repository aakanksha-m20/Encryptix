import java.util.Scanner;
import java.io.*;

public class Student_gradeCalculator {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        int numSubjects = 4;
        System.out.println("Subject list:\nMathematics : 1\nScience : 2\nGeography : 3\nHistory : 4");

        int[] marks = new int[numSubjects];

        System.out.println("Enter the marks obtained by student out of 100.");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sobj.nextInt();
        }

        sobj.close();

        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalMarks += marks[i];
        }

        System.out.println("Total marks out of 400 : " + totalMarks);

        int averagePercent = Calculate_Average(marks);
        char Grade = assignGrade(averagePercent);

        System.out.println("The average percentage is: " + averagePercent + "%");
        System.out.println("The grade is: " + Grade);
    }

    public static int Calculate_Average(int[] subMarks) {
        int sum = 0;
        int numSubjects = subMarks.length;

        for (int mark : subMarks) {
            sum += mark;
        }

        int totalMarks = numSubjects * 100;
        int average_Percentage = (sum * 100) / totalMarks;

        return average_Percentage;
    }

    public static char assignGrade(int percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
