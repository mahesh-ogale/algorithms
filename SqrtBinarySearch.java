import java.math.BigInteger;

public class SqrtBinarySearch {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));

//        BigInteger t = new BigInteger("536848900 * 536848900");

//        float a = 536848900 * 536848900;
//
//        System.out.println(1073697800l * 1073697800l > Integer.MAX_VALUE);

//        int a = 288206741431210000;

        System.out.println(Integer.MAX_VALUE);

    }

    public static int mySqrt(int x) {
        int l = 1;
        int r = x/2;
        long mid;

        while( l <= r){
            mid = ((long)l+(long)r)/2;

            if( mid * mid == x) return (int)mid;
            else if ( mid* mid > x)
                r = (int)mid-1;
            else
                l = (int)mid+1;
        }
        return r;
    }



//    public static int floorSqrt(Integer x)
//    {
//        // Base Cases
//        if (x == 0 || x == 1)
//            return x;
//
//        // Do Binary Search for floor(sqrt(x))
//        int start = 1, end = x/2, ans=0;
//        while (start <= end)
//        {
//            Integer mid = (start + end) / 2;
//
//            BigInteger mids = BigInteger.valueOf(mid).multiply(BigInteger.valueOf(mid));
//
//            if (mids.compareTo(BigInteger.valueOf(x)) == 0)
//                return mid;
//
//            // Since we need floor, we update answer when mid*mid is
//            // smaller than x, and move closer to sqrt(x)
//            if (mids.compareTo(BigInteger.valueOf(x)) < 0)
//            {
//                start = mid + 1;
//                ans = mid;
//            }
//            else   // If mid*mid is greater than x
//                end = mid-1;
//        }
//        return ans;
//    }

    public static int floorSqrt1(Integer x)
    {
        // Base Cases
        if (x == 0 || x == 1)
            return x;

        // Do Binary Search for floor(sqrt(x))
        int start = 1, end = x/2, ans=0;
        while (start <= end)
        {
            long mid = (start + end) / 2;

            if (mid * mid == x)
                return (int)mid;

            else if (mid * mid > x)
            {
                end = (int)mid - 1;
            }
            else   // If mid*mid is greater than x
                start = (int)mid+1;
        }
        return end;
    }
}
