import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class FruitShop {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine();
String day = console.nextLine();
double quantity = Double.parseDouble(console.nextLine());
double price = 0;

if (day.toLowerCase().equals("monday")||day.toLowerCase().equals("tuesday")||day.toLowerCase().equals("wednesday")||day.toLowerCase().equals("thursday")||day.toLowerCase().equals("friday")) {
    switch (fruit.toLowerCase()) {
        case "banana":
            price = 2.50;

            break;
        case "apple":
            price = 1.20;

            break;
        case "orange":
            price = 0.85;

            break;
        case "grapefruit":
            price = 1.45;

            break;
        case "kiwi":
            price = 2.70;

            break;
        case "pineapple":
            price = 5.50;

            break;
        case "grapes":
            price = 3.85;


            break;


    }
} else if (day.toLowerCase().equals("saturday")||day.toLowerCase().equals("sunday")) {
    switch (fruit.toLowerCase()) {
        case "banana":
            price = 2.70;

            break;
        case "apple":
            price = 1.25;

            break;
        case "orange":
            price = 0.90;

            break;
        case "grapefruit":
            price = 1.60;

            break;
        case "kiwi":
            price = 3;

            break;
        case "pineapple":
            price = 5.60;

            break;
        case "grapes":
            price = 4.20;


            break;


    }
}
        if (price!=0){
            System.out.printf("%.2f",price*quantity);
        }else
            System.out.println("error");
    }

    }

