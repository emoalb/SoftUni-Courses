import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class Figure {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double px =  Double.parseDouble(console.nextLine());
        double py = Double.parseDouble(console.nextLine());
        if ((px==x1||px==x2 )&&
                py>=y1 && py<=y2) {
            System.out.println("Border");



        }else
        if ((py==y1||py==y2 )&&
                px>=x1 && px<=x2) {
            System.out.println("Border");
        }else  System.out.println("Inside / Outside");
    }
}
