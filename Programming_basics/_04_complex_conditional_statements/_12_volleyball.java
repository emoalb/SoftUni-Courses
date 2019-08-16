import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class Weel {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);

        String type = con.nextLine();
        int holidays = Integer.parseInt(con.nextLine());
        int naSelo = Integer.parseInt(con.nextLine());
        double dniSofia = (48- naSelo) * 3.0/4;
        double res2 = holidays * 2.0/3;
        double res3 = dniSofia + naSelo + res2;
        double res4 = 0;
double result =0;

        if (type.toLowerCase().equals("leap")) {
            res4 = 0.15 * res3;
        } else if (type.toLowerCase().equals("normal")) {
            res4 =0;

        }
             result= Math.floor(res3+res4);
        System.out.printf("%.0f",result);
    }
}