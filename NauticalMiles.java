import java.util.Scanner;

public class NauticalMiles {

    public static void main(String [] args) {
        int numberOfKilometersInputed;
        int numberOfKilometersInAMile = 1852;
        int remainderOfKilometers;
        int numberOfKilometers;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of kilometers needed to do the job >>> ");
        numberOfKilometersInputed = keyboard.nextInt();

        numberOfKilometers = numberOfKilometersInputed / numberOfKilometersInAMile;
        remainderOfKilometers = numberOfKilometersInputed % numberOfKilometersInAMile;

        System.out.println("The number of miles ordered is " + numberOfKilometers +
                " and the numbers of kilometers remaining is " + remainderOfKilometers);
    }
}
