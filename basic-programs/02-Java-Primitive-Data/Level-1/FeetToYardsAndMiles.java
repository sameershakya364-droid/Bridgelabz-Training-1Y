import java.util.Scanner;

class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distanceInFeet;

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}
