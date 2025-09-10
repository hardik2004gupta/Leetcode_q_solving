import java.util.Arrays;
import java.util.Collections;

public class HIndex274 {
    public static void main(String[] args) {

    }
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans=0;
        int idx=0;
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i]>=idx){
                ans = citations[i];
            }
            idx++;
        }
        return ans;
    }
}
