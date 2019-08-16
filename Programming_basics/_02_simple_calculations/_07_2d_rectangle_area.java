import java.util.Scanner;

public class _07_2d_rectangle_area {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double side1 = Math.abs( x1 - x2);
        double side2 = Math.abs(y2 - y1);
        double area = side1 * side2;
        double perimeter = 2 * side1 + 2 * side2;
        System.out.printf("%f\n",area);
        System.out.printf("%f\n",perimeter);
    }
}