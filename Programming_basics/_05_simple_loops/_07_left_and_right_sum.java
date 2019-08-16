import java.util.Scanner;

/**
 * Created by Zorak on 8/2/2017.
 */
public class LRSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int[] nums = new int[2*n + 1];
        int left=0;
        int right=0;

        for (int i = 1; i <= 2*n; i++) {

            nums[i] = Integer.parseInt(console.nextLine());


        }
        for (int i=1;i<=n;i++)
        {
            left = left + nums[i];

        }
    for (int i= n+1 ;i<=2*n;i++){

            right = right+nums[i];
    }
    if (Math.abs(left-right)==0) {
        System.out.printf("Yes, sum = %d\n",right);

    }else {
        System.out.printf("No, diff = %d\n",Math.abs(left-right));

    }
    }
}