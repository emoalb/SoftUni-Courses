import java.util.Scanner;

public class _04_Number_0...100_to_text {
    public static void main(String[] args) {

        final String[] tensNames = {
                "",
                "ten",
                "twenty",
                "thirty",
                "forty",
                "fifty",
                "sixty",
                "seventy",
                "eighty",
                "ninety"
        };
         String[] numNames = {
                "",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen"
        };
        Scanner console = new Scanner(System.in);
int number = Integer.parseInt(console.nextLine());
int funk;

        int tents;
        int hund;
        if ((number>0)&&(number<100)) {
funk=number;

              tents  = funk%10;
            funk = funk/10;
        hund = funk%10;
            if (number<20) {
                System.out.printf("%s", numNames[number]);

            }
            if (number>=20) {
                if (tents != 0) {
                    System.out.printf("%s %s", tensNames[hund], numNames[tents]);
                } else {
                    System.out.printf("%s", tensNames[hund]);

                }

            }

}else if (number==0)
        {
            System.out.println("zero");

        }
        else if (number==100)
        {
            System.out.println("one hundred");

        }else {
    System.out.printf("invalid number\n");

}
    }
}