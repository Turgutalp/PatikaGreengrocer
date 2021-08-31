import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("*********************************************\n");
        System.out.println("Welcome to PatikaDev GreenGrocery Store\n");
        System.out.println("*********************************************\n");

        System.out.println("Pears : 2,14 TL\n" +
                "\n" +
                "\n" +
                "Apple : 3,67 TL\n" +
                "\n" +
                "\n" +
                "Tomatoes : 1,11 TL\n" +
                "\n" +
                "\n" +
                "Banana: 0,95 TL\n" +
                "\n" +
                "\n" +
                "EggPlant : 5,00 TL\n");


        System.out.println("How many kilograms of Pears ? : ");
        int p = sc.nextInt();
        System.out.println("How many kilograms of Apple ? : ");
        int a = sc.nextInt();
        System.out.println("How many kilograms of Tomatoes ? : ");
        int t = sc.nextInt();
        System.out.println("How many kilograms of Banana ? : ");
        int b = sc.nextInt();
        System.out.println("How many kilograms of EggPlant ? : ");
        int e = sc.nextInt();


        double totalAmont = (p*2.14) + (a*3.67) + (t*1.11) + (b*0.95) + (e*5.00) ;

        System.out.println("Total Amount: " + totalAmont + " TL1");


    }
}
