import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Zorak on 8/2/2017.
 */
public class OddEvenFunky {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        NumberFormat nf = new DecimalFormat("#########.#########");
        double nums[] = new double[n+1];
    double evennums[] =new double[n/2 +1];
    double oddnums[] =new double[n/2 +1];

        double oddSum =0;
        double oddMin =1000000000.0;
        double oddMax =-1000000000.0;
        double evenSum =0;
        double evenMin =1000000000.0;
        double evenMax =-1000000000.0;
    int a=0;
    int b=0;
        for (int i=1;i<=n;i++) {

        nums[i]=Double.parseDouble(console.nextLine());
        if  (i%2==0) {
            evennums[a]=nums[i];
            a++;

        }else if(i%2!=0) {
            oddnums[b]=nums[i];
            b++;

        }

    }
    for(int i=0;i<=b-1;i++){

       oddSum=oddSum+oddnums[i];
       if (oddnums[i]>=oddMax) {
           oddMax=oddnums[i];
       }
        if (oddnums[i]<=oddMin) {
            oddMin =oddnums[i];
        }
    }
        for(int i=0;i<=a-1;i++){
            evenSum=evenSum+evennums[i];
            if (evennums[i]>=evenMax) {
                evenMax=evennums[i];
            }
            if (evennums[i]<=evenMin) {
                evenMin =evennums[i];
            }
        }
        System.out.printf("OddSum=%s,\n",nf.format(oddSum));
      if (oddMin==1000000000.0) {
          System.out.printf("OddMin=No,\n");
      }else {System.out.printf("OddMin=%s,\n",nf.format(oddMin));
      }
        if (oddMax==-1000000000.0) {
            System.out.printf("OddMax=No,\n");
        }else {
            System.out.printf("OddMax=%s,\n",nf.format(oddMax));
        }
            System.out.printf("EvenSum=%s,\n",nf.format( evenSum));

        if (evenMin==1000000000.0) {
            System.out.printf("EvenMin=No,\n");
        } else {
            System.out.printf("EvenMin=%s,\n",nf.format( evenMin));
        }

        if (evenMax==-1000000000.0) {
            System.out.printf("EvenMax=No\n");
        } else { System.out.printf("EvenMax=%s\n",nf.format(evenMax));
        }

    }


}