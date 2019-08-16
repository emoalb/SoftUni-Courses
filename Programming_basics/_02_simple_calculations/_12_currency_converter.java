import java.util.Scanner;


public class _12_currency_converter {
    public static void main ( String [] args) {
        Scanner console = new Scanner(System.in);
        double amount = Double.parseDouble(console.nextLine());
        String cur1 = console.nextLine();
        String cur2 = console.nextLine();
        double output = 0;

        if (cur1.equals("BGN") ) {
            switch (cur2) {
                case "EUR":
                    output = amount / 1.95583;
                    break;
                case "USD":
                    output = amount / 1.79549;
                    break;
                case "GBP":
                    output = amount / 2.53405;
                    break;
                case "BGN":
                    output = amount;
                    break;


            }
        }
        if (cur1.equals("EUR")) {
            switch (cur2) {
                case "EUR":
                    output = amount;
                    break;
                case "USD":
                    output = amount *1.95583 /1.79549;
                    break;
                case "GBP":
                    output = amount* 1.95583/ 2.53405;
                    break;
                case "BGN":
                    output = amount*1.95583;
                    break;


            }
        }
        if (cur1.equals("USD")) {
            switch (cur2) {
                case "EUR":
                    output = amount*1.79549/1.95583;
                    break;
                case "USD":
                    output = amount ;
                    break;
                case "GBP":
                    output = amount*1.79549 /2.53405;
                    break;
                case "BGN":
                    output = amount*1.79549;
                    break;


            }
        }
        if (cur1.equals("GBP")) {
            switch (cur2) {
                case "EUR":
                    output = amount*2.53405/1.95583;
                    break;
                case "USD":
                    output = amount*2.53405/ 1.79549 ;
                    break;
                case "GBP":
                    output = amount;
                    break;
                case "BGN":
                    output = amount*2.53405 ;
                    break;

                        


            }
        }
        System.out.printf("%.2f %s",output,cur2);
    }

}