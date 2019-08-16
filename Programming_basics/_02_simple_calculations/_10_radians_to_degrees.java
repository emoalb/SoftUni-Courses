import java.util.Scanner;


public class _10_radians_to_degrees {

    public static void main( String[] args) {
        Scanner console = new Scanner(System.in);

        double radians = Double.parseDouble(console.nextLine());
        double degrees = Math.toDegrees(radians);
        System.out.printf("%.1f",degrees);
    }
}
