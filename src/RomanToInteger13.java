public class RomanToInteger13 {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {

        int result = 0;

        for(int i=0; i<s.length(); i++){
            int num = valueOf(s.charAt(i));

            if(i+1<s.length() && num<valueOf(s.charAt(i+1))){
                result -= num;
            }
            else{
                result += num;
            }
        }

        return result;
    }
    public int valueOf(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
