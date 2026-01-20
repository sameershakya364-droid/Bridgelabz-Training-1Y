import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base: ");
        base = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of triangle is " + area);
    }
}
