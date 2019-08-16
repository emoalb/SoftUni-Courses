import java.util.Scanner;

/**
 * Created by Zorak on 7/25/2017.
 */
public class _02_small_shop {
public static void main(String [] args)
{
    Scanner console = new Scanner(System.in) ;

  String product = console.nextLine();
  String city = console.nextLine();
 double quantity = Double.parseDouble(console.nextLine());
double price = 0;
product=product.toLowerCase();

   switch (product) {
       case "coffee" :
 if (city.toLowerCase().equals("sofia")){

     //Coffee in Sofia
     price = 0.50;
 } else if (city.toLowerCase().equals("plovdiv"))
 {
     //Coffee in Plovdiv
     price = 0.40;
 }else if (city.toLowerCase().equals("varna"))
 {
     //Coffee in Varna
     price = 0.45;

 }

           break;
       case "water" :
           if (city.toLowerCase().equals("sofia")){
               //Water in Sofia
               price = 0.80;

           } else if (city.toLowerCase().equals("plovdiv"))
           {
               //Water in Plovdiv
               price = 0.70;

           }else if (city.toLowerCase().equals("varna"))
           {
               //Water in Varna
               price = 0.70;


           }
           break;
       case "beer" :
           if (city.toLowerCase().equals("sofia")){
               //Beer in Sofia
               price = 1.20;

           } else if (city.toLowerCase().equals("plovdiv"))
           {
               //Beer in Plovdiv
               price = 1.15;

           }else if (city.toLowerCase().equals("varna"))
           {
               //Beer in Varna
               price = 1.10;


           }
           break;
       case "sweets" :
           if (city.toLowerCase().equals("sofia")){
               //Sweets in Sofia
               price = 1.45;

           } else if (city.toLowerCase().equals("plovdiv"))
           {
               //Sweets in Plovdiv
               price = 1.30;

           }else if (city.toLowerCase().equals("varna"))
           {
               //Sweets in Varna
               price = 1.35;


           }
           break;
       case "peanuts" :
           if (city.toLowerCase().equals("sofia")){
               //Peanuts in Sofia
               price = 1.60;

           } else if (city.toLowerCase().equals("plovdiv"))
           {
               //Peanuts in Plovdiv
               price = 1.50;

           }else if (city.toLowerCase().equals("varna"))
           {
               //Sweets in Varna
               price = 1.55;


           }
           break;
   }

System.out.printf("%f",quantity*price);
}
}