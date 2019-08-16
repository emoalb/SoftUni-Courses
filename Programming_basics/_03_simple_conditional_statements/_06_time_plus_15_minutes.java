import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _06_time_plus_15_minutes {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());
        int newMin = minutes + 15;
        if (newMin > 59) {
            hours++;
            if(hours==24){
                hours=0;
            }
            newMin = newMin - 60;
            if (newMin<10) {
                System.out.printf("%d:0%d\n", hours, newMin);
            }else
            {
                System.out.printf("%d:%d\n", hours, newMin);
            }
        } else {
            if (newMin<10) {
                System.out.printf("%d:0%d\n", hours, newMin);
            }else
            {
                System.out.printf("%d:%d\n", hours, newMin);
            }
        }

    }

}