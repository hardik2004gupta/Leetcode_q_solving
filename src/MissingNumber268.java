import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber268 {
    public static void main(String args[]){

    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int sum2 =0;
        for(int i = 0; i < n; i++){
            sum2 += nums[i];
        }
        return sum - sum2;
    }
}
