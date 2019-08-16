import java.util.Scanner;

/**
 * Created by Zorak on 8/2/2017.
 */
public class FunkySum {

    public static void main(String [] args) {
       Scanner console = new Scanner(System.in);

        int n =Integer.parseInt(console.nextLine());
        int[] nums = new int [n+1];
        int maxnum=0;
        int sumnum=0;
int largest = nums[0];
        for (int i=1 ; i<=n;i++) {
            nums[i]=Integer.parseInt(console.nextLine());
            if (nums[i]>largest) {
                largest=nums[i];
                maxnum=i;
            }

        }
       for (int i=1;i<=n;i++){
            if (i!=maxnum) {

                sumnum = sumnum+nums[i];
            }

       }
       if (sumnum==nums[maxnum]) {
           System.out.printf("Yes Sum = %d",sumnum);
       }else {
           System.out.printf("No Diff = %d",Math.abs(sumnum-nums[maxnum]));
       }

    }



}