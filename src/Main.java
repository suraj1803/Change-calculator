import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Your Total Amount: ");
        Scanner scanner = new Scanner(System.in);
        int Total = scanner.nextInt();
        int TwoThousands = Total / 2000;
        int whatsLeft = Total % 2000;

        int FiveHundred = whatsLeft /  500;
        whatsLeft = whatsLeft % 500;

        int TwoHundred = whatsLeft / 200;
        whatsLeft = whatsLeft % 200;

        int OneHundred = whatsLeft / 100;
        whatsLeft = whatsLeft % 100;

        int Fifty = whatsLeft / 50;
        whatsLeft = whatsLeft % 50;

        int Twenty = whatsLeft / 20;
        whatsLeft = whatsLeft % 20;

        int Ten = whatsLeft / 10;
        whatsLeft = whatsLeft % 10;

        int Five = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        int One = whatsLeft;

        System.out.println("From " + Total + " you get --");
        if (TwoThousands > 0)
            System.out.println("TwoThousands - " + TwoThousands);
        if (FiveHundred > 0)
            System.out.println("FiveHundreds - " + FiveHundred);
        if (TwoHundred > 0)
            System.out.println("TwoHundreds -  " + TwoHundred);
        if (OneHundred > 0)
            System.out.println("OneHundreds -  " + OneHundred);
        if (Fifty > 0)
            System.out.println("Fifties -      " + Fifty);
        if (Twenty > 0)
            System.out.println("Twenties -     " + Twenty);
        if (Ten > 0)
            System.out.println("Tens -         " + Ten);
        if (Five > 0)
            System.out.println("Five -         " + Five);
        if (One > 0)
            System.out.println("One -          " + One);

    }
}