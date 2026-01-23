import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;
        System.out.println("Average Marks: " + average);

        if (average >= 80) {
            System.out.println("Grade: A, Remarks: Excellent");
        } else if (average >= 70) {
            System.out.println("Grade: B, Remarks: Very Good");
        } else if (average >= 60) {
            System.out.println("Grade: C, Remarks: Good");
        } else if (average >= 50) {
            System.out.println("Grade: D, Remarks: Average");
        } else if (average >= 40) {
            System.out.println("Grade: E, Remarks: Needs Improvement");
        } else {
            System.out.println("Grade: R, Remarks: Remedial Standards");
        }
        input.close();
    }
}