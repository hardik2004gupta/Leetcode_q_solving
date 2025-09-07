import java.util.Scanner;

public class ReverseBits190 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }

    public int reverseBits(int n) {
        int ans=0;

        for(int i=0;i<32;i++){
            ans = ans << 1;
            int bit = n&1;
            ans = ans | bit;
            n = n >> 1;
        }

        return ans;
    }
}
