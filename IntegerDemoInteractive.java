import java.util.Scanner;

public class IntegerDemoInteractive
{
    public static void main(String[] args)
    {
        int anInt = 12;
        byte aByte = 12;
        short aShort = 12;
        long aLong = 12;

        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();
    }
}
