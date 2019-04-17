import java.util.Scanner;

public class QuartsToGallonsInteractive {

    public static void main(String [] args) {
        int numberOfQuartsInputed;
        int numberOfQuartsInAGallon = 4;
        int remainderOfQuarts;
        int numberOfGallons;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of quarts needed to do the job >>> ");
        numberOfQuartsInputed = keyboard.nextInt();

        numberOfGallons = numberOfQuartsInputed / numberOfQuartsInAGallon;
        remainderOfQuarts = numberOfQuartsInputed % numberOfQuartsInAGallon;

        System.out.println("The number of gallons ordered is " + numberOfGallons +
                " and the numbers of quarts remaining is " + remainderOfQuarts);

    }
}

