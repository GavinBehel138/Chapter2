import java.util.Scanner;

public class Eggs {

    public static void main(String[] args){
        int eggsOrdered;
        int remainingEggs;
        int dozenEggs;
        int totalEggsR;
        int totalDozen;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of eggs needed to do the job >>> ");
        eggsOrdered = keyboard.nextInt();

        remainingEggs = eggsOrdered % 12;
        dozenEggs = eggsOrdered / 12;
        totalEggsR =  remainingEggs * 7;
        totalDozen = totalEggsR * 156;

        System.out.println("The number of eggs ordered is " + eggsOrdered +
                " and the numbers of eggs remaining is " + remainingEggs);
    }
}
