import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    static Map<Integer, Integer> numberOfWaysCache = new HashMap<>();

    enum Test {
        ONE("1"),
        TWO("2"),
        THREE("3");

        private final String test;

        Test(String connectionStatus){
            this.test = connectionStatus;
        }
    }


    public static void main(String[] args) {
//        System.out.println("Number of ways to climb = " + steps(45));

        Test val = Test.THREE;

        System.out.println(Test.THREE == val);


    }

    static int steps(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int oneStepResult = 0;

        if (numberOfWaysCache.get(n - 1) != null) {
            oneStepResult = numberOfWaysCache.get(new Long(n - 1));
        } else {
            oneStepResult = steps(n - 1);
            numberOfWaysCache.put(n - 1, oneStepResult);
        }

        int twoStepResult = 0;

        if (numberOfWaysCache.get(n - 2) != null) {
            twoStepResult = numberOfWaysCache.get(n - 2);
        } else {
            twoStepResult = steps(n - 2);
            numberOfWaysCache.put(n - 2, twoStepResult);
        }

        return oneStepResult + twoStepResult;
    }
}
