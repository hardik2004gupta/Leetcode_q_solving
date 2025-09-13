import java.util.Scanner;

public class LengthofLastWord58 {
    public static void main(String args[]) {

    }
    public int lengthOfLastWord(String s) {

        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            count++;
            if(s.charAt(i-1)==' '){
                break;
            }
        }

        return count;
    }
}
