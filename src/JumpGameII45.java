public class JumpGameII45 {
    public static void main(String[] args) {
    }
    public int jump(int[] nums) {
        int jumps=0;
        int currfarthest=0;
        int currend=0;
        for(int i=0; i<nums.length; i++){
            currfarthest=Math.max(currfarthest,i+nums[i]);
            if(i==currend){
                jumps++;
                currend = currfarthest;
            }
        }
        return jumps;
    }
}
