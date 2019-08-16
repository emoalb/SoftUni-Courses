import java.util.Scanner;


public class _02_inches_to_centimeters {

    public static void main( String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.printf("inches:");
       double inches = Double.parseDouble(console.nextLine());
        double centimeters = inches*2.54;
        System.out.printf("Square = %f\n",centimeters);


    }
}