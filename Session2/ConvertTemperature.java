import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F;
        double C;
        int choice;

        do {
            System.out.println(" Menu. ");
            System.out.println(" 1. F to C ");
            System.out.println(" 2. C to F");
            System.out.println(" 0. Exit ");
            System.out.println(" Enter your choice");
            choice = input.nextInt();


            switch (choice){
                case 1:
                    System.out.println(" Enter F : ");
                    F = input.nextDouble();
                    System.out.println(" F to C : " + fToC(F));
                    break;
                case 2:
                    System.out.println(" Enter C : ");
                    C = input.nextDouble();
                    System.out.println(" C to F : " + cToF(C));
                    break;
                case 0:
                    System.exit(0);
            }
        } while ( choice != 0 );
    }

    public static double cToF( double C) {
        double F = (9.0 / 5) * C + 32;
        return F;
    }

    public static double fToC( double F){
        double C = (5.0 / 9) * (F - 32);
        return C;
    }


}
