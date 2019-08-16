import java.util.Scanner;

public class _06_circle_area_and_perimeter {
    public static void main( String[] args)
    {
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());
        double area = Math.PI*r*r;
        double perimeter = Math.PI*r*2;

        System.out.printf("Area = %f\n",area);
        System.out.printf("Perimeter = %f\n",perimeter);


    }
}