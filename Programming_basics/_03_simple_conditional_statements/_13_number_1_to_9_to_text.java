import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _13_number_1_to_9_to_text {
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);

        String[] numNames = {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "number too big"
        };
int choise=Integer.parseInt(console.nextLine());
if (choise<10) {
    System.out.printf("%s\n", numNames[choise]);
}else {
    System.out.printf("%s\n", numNames[10]); 
}
    }
    }