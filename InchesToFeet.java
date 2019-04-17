import java.util.Scanner;

public class InchesToFeet {

    public static void main(String[] args) {
        int numberOfInchesInputed;
        int numberOfInchesInAFoot = 68;
        int remainderOfInches;
        int numberOfInches;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of inches needed to do the job >>> ");
        numberOfInchesInputed = keyboard.nextInt();

        numberOfInches = numberOfInchesInputed / numberOfInchesInAFoot;
        remainderOfInches = numberOfInchesInputed % numberOfInchesInAFoot;

        System.out.println("The number of miles ordered is " + numberOfInches +
                " and the numbers of kilometers remaining is " + remainderOfInches);
    }
}
