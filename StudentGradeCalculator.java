import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSubjects = 0;
        float totalMarks = 0.0f;
        float averagePercentage = 0.0f;
        System.out.print("Enter number of subjects:");
        numOfSubjects = sc.nextInt();
        System.out.print("Enter marks obtained in each subject:");
        for (int i = 0; i < numOfSubjects; i++) {
            totalMarks =totalMarks+ sc.nextFloat();
        }
        averagePercentage = totalMarks / numOfSubjects;
        System.out.printf("Total Marks: %.2f\n", totalMarks);
        System.out.printf("Average Percentage: %.2f %%\n", averagePercentage);
        if (averagePercentage >= 90) {
            System.out.println("Grade: A+");
        } else if (averagePercentage >= 80) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 70) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 60) {
            System.out.println("Grade: C");
        } else if (averagePercentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        sc.close();
    }
}

