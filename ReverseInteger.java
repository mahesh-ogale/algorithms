public class ReverseInteger {

    public static void main(String[] args) {
        int x = -2147483647;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result * 10L > Integer.MAX_VALUE || result * 10L < Integer.MIN_VALUE) {
                result = 0;
                break;
            }
            result = result * 10 + x % 10;
            x = x/10;
        }
        return result;
    }
}
