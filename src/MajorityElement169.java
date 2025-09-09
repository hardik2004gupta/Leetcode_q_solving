import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
