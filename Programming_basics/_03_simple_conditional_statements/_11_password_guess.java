import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _11_password_guess {

        public static void main (String [] args) {
            Scanner console = new Scanner (System.in);

          String first = console.nextLine();
          String second ="s3cr3t!P@ssw0rd";
            if (first.equals(second)){
              System.out.println("Welcome");
          }else

          {
              System.out.println("Wrong password!");
          }
        }


}