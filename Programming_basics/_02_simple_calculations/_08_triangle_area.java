import java.util.Scanner;


public class _08_triangle_area {
    public static void main( String[] args)
    {
        Scanner console = new Scanner(System.in);

      double a = Double.parseDouble(console.nextLine());
      double h = Double.parseDouble(console.nextLine());

        double area = a*h/2;
        System.out.printf("Triangle area = %.2f\n",area);


    }
}