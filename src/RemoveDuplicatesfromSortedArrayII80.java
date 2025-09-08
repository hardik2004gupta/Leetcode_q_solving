import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII80 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,4,4};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
    public static int[] removeDuplicates(int[] nums) {
        int indx = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[indx-2] != nums[i]){
                nums[indx] = nums[i];
                indx++;
            }
        }

        return nums;
    }
}
