import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class _04_fruit_ot_vegetable {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

String input = console.nextLine();
if (input.toLowerCase().equals("banana")||input.toLowerCase().equals("apple")||input.toLowerCase().equals("kiwi")||input.toLowerCase().equals("cherry")||input.toLowerCase().equals("lemon")||input.toLowerCase().equals("grapes"))
{
    System.out.println("fruit");
}else if (input.toLowerCase().equals("tomato")||input.toLowerCase().equals("cucumber")||input.toLowerCase().equals("pepper")||input.toLowerCase().equals("carrot")){



            System.out.println("vegetable");
        } else {
    System.out.printf("unknown");
        }


    }
}
