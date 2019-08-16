import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _15_bonus_score {
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
        double bonus =0;
        double result =0;

int input=Integer.parseInt(console.nextLine());
if ((input%2)==0){
    bonus++;

}else if ((input%5)==0){
    bonus=bonus+2;


}
if (input<=100){
    bonus=bonus+5;
}else if (input>100&&input<=1000){
    bonus=bonus+(0.2*input);
}else if (input>1000){
    bonus=bonus+(0.1*input);
}

result = input+bonus;
System.out.printf("%.1f\n",bonus);
        System.out.printf("%.1f\n",result);
    }

}