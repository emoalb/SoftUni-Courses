import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class Weel {
    public static void main (String [] args)
    {
        Scanner con = new Scanner(System.in);

       String type = con.nextLine();
       int colums = Integer.parseInt(con.nextLine());
       int rows = Integer.parseInt(con.nextLine());
       int result = rows*colums;

               double revenue = -1;

       switch (type.toLowerCase())
       {
           case "premiere":
               revenue=result*12;
               break;
           case "normal":
               revenue=result*7.5;
               break;
           case "discount":
               revenue=result*5;

               break;


       }
       System.out.printf("%.2f leva\n",revenue);



    }
}