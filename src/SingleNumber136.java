import java.util.Scanner;

public class SingleNumber136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {4,2,2,1,1};
        singleNumber(n);
    }
    public static int singleNumber(int[] nums) {
        int num=0;
        for (int i = 0; i <= nums.length-1; i++) {
            num=num^nums[i];
        }
        return num;
    }
}
