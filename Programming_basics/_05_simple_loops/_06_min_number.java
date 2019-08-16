import java.util.Scanner;

public class MaxNumber {
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int[] nums = new int[n+1];
        int min;
        nums[1] = Integer.parseInt(console.nextLine());
        min=nums[1];
        for (int i=2;i<=n;i++) {
            nums[i] = Integer.parseInt(console.nextLine());
            if (nums[i]<=nums[i-1]) {
                min=nums[i];
            }

        }
System.out.printf("%d",min);

    }



}