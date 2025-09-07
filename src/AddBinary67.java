import java.util.Scanner;

public class AddBinary67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = String.valueOf(sc.nextInt());
        String b = String.valueOf(sc.nextInt());
        System.out.println(addBinary(a,b));

    }

    public static String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();

    }
}
