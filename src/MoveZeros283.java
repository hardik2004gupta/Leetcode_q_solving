import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int lastNonZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastNonZero] = nums[i];
                lastNonZero++;
            }
        }
        for(int i = lastNonZero; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
