import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class Weel {
    public static void main (String [] args)
    {
        Scanner con = new Scanner(System.in);

        int day  = Integer.parseInt(con.nextLine());
        String[] days  = new String[] {
                "",
            "Monday",
            "Tuesday",
            "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"

        };
        if (day>0&&day<8)
        {
            System.out.printf("%s\n",days[day]);

        }else{
            System.out.println("Error");
        }


    }
}