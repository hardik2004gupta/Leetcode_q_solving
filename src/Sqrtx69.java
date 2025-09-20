public class Sqrtx69 {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        for (int i = 0; i <= x/2; i++) {
            if (i * i > x) {
                return i-1;
            } else if (i * i ==x) {
                return i;
            }
        }
        return 0;
    }
}
