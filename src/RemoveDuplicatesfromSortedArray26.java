import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,4,4};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
    public static int[] removeDuplicates(int[] nums) {

        int indx = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[indx] = nums[i];
                indx++;
            }
        }

        return nums;
    }
}
