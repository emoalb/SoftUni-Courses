import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class Comision {
    public static  void main(String [] args )

    {
        Scanner console = new Scanner(System.in);

        String city = console.nextLine();
        double ammount  = Double.parseDouble(console.nextLine());
        double com = -1;

        switch ( city.toLowerCase())
        {
            case "sofia":
if (ammount>=0&&ammount<=500)
{
    com= ammount*0.05;

} else if (ammount>500&&ammount<=1000)
                {
                    com= ammount*0.07;

                }else if (ammount>1000&&ammount<=10000)
{
    com= ammount*0.08;

}else if (ammount>10000)
{
    com= ammount*0.12;

}
                break;
            case "varna":
                if (ammount>=0&&ammount<=500)
                {
                    com= ammount*0.045;

                } else if (ammount>500&&ammount<=1000)
                {
                    com= ammount*0.075;

                }else if (ammount>1000&&ammount<=10000)
                {
                    com= ammount*0.10;

                }else if (ammount>10000)
                {
                    com= ammount*0.13;

                }
                break;
            case "plovdiv":
                if (ammount>=0&&ammount<=500)
                {
                    com= ammount*0.055;

                } else if (ammount>500&&ammount<=1000)
                {
                    com= ammount*0.08;

                }else if (ammount>1000&&ammount<=10000)
                {
                    com= ammount*0.12;

                }else if (ammount>10000)
                {
                    com= ammount*0.145;

                }
                break;



        }
if(com<0) {
            System.out.println("error");
}else {
    System.out.printf("%.2f",com);
}

    }
}
