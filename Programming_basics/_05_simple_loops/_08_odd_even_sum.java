import java.util.Scanner;

/**
 * Created by Zorak on 8/2/2017.
 */
public class OddEvenSum {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int[] nums = new int[n + 1];
        int odd = 0;
        int even = 0;

        for (int i = 1;  i<=n; i++) {
            nums[i] = Integer.parseInt(console.nextLine());

if (i%2==0) {
    even=even+nums[i];
}else {
    odd = odd+ nums[i];


}
        }
if (even==odd) {
    System.out.printf("Yes Sum = %d\n",even);

}else {
    System.out.printf("No Diff = %d\n",Math.abs(even-odd));
}



    }
}
