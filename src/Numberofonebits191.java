import java.util.Scanner;

public class Numberofonebits191 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }

    public int hammingWeight(int n) {
        int count =0;
        while(n>0){
            int bit = n&1;
            if (bit == 1){
                count++;
            }
            n=n>>1;
        }

        return count;
    }
}
