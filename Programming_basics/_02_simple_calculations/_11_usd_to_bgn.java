import java.util.Scanner;

public class _11_usd_to_bgn {

    public static void main( String[] args) {
        Scanner console = new Scanner(System.in);

        double usd = Double.parseDouble(console.nextLine());
        double bgn = 1.79549*usd;
        System.out.printf("%.2f BGN",bgn);
    }
}
