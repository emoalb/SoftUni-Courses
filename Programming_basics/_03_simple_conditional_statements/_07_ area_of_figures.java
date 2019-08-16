import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _07_ area_of_figures {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);
        String choise = console.nextLine();
        switch (choise)
        {
            case "square":
double a=Double.parseDouble(console.nextLine());
System.out.printf("%.3f\n",(a*a));
                break;

            case "rectangle":
                double b=Double.parseDouble(console.nextLine());
                double c=Double.parseDouble(console.nextLine());
                System.out.printf("%.3f\n",(b*c));
                break;
            case "circle":
                double r=Double.parseDouble(console.nextLine());
                System.out.printf("%.3f\n",(Math.PI*(r*r)));
                break;

            case "triangle":
                double d=Double.parseDouble(console.nextLine());
                double e=Double.parseDouble(console.nextLine());
                System.out.printf("%.3f\n",((d*e)/2));
                break;

        }

    }
}