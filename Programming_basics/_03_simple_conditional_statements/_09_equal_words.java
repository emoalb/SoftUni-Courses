import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _09_equal_words {

        public static void main (String [] args) {
            Scanner console = new Scanner (System.in);

          String first = console.nextLine();
          String second = console.nextLine();
          first= first.toLowerCase();
          second=second.toLowerCase();
          if (first.equals(second)){
              System.out.println("yes");
          }else

          {
              System.out.println("no");
          }
        }


}