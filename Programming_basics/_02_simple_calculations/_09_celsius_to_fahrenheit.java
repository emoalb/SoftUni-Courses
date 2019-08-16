import java.util.Scanner;


public class _09_celsius_to_fahrenheit {
    public static void main( String[] args) {
        Scanner console = new Scanner(System.in);

        double celsius = Double.parseDouble(console.nextLine());
        double fahrenhait = 9*celsius/5 + 32;
        System.out.printf("%.2f",fahrenhait);
    }

}