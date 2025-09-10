public class JumpGame55 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        int maxi = 0;
        for(int j=0;j<nums.length;j++){
            if(j>maxi){
                return false;
            }
            maxi = Math.max(maxi,j+nums[j]);
        }
        return true;
    }
}
