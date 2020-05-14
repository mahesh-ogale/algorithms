import java.util.Arrays;
import java.util.Comparator;

public class ReorderLogFiles {

    public static void main(String[] args) {
//        String[] logs = new String[] {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero", "test1 abc", "test1 abc"};

//        String[] logs = new String[] {"g1 act car","a8 act zoo"};

        String[] logs = new String[] {"test2 abc", "test1 abc"};

//        String[] logs = {"qm uiliabj", "tj u t h r"};

        Comparator<String> logFileComparator = (String logLine1, String logLine2) -> {

            String[] logLine1Words = logLine1.split(" ");
            String[] logLine2Words = logLine2.split(" ");

            String logLine1Id = logLine1Words[0];
            String logLine2Id = logLine2Words[0];

            for (int i = 1; i < Math.min(logLine1Words.length, logLine2Words.length); i++) {

                for (int j = 0; j < Math.min(logLine1Words[i].length(), logLine2Words[i].length()); j++) {
                    char logLine1Char = logLine1Words[i].charAt(j);
                    char logLine2Char = logLine2Words[i].charAt(j);

                    if (logLine1Char >= '0' && logLine1Char <= '9' && logLine2Char >= '0' && logLine2Char <= '9') {
                        return 0;
                    }
                    if (logLine2Char >= '0' && logLine2Char <= '9') {
                        return -1;
                    }
                    if (logLine1Char >= '0' && logLine1Char <= '9') {
                        return 1;
                    }
                    int result = logLine1Words[i].compareTo(logLine2Words[i]);
                    if (result == 0) {
                        continue;
                    } else {
                        return result;
                    }
                }
            }
            return logLine1Id.compareTo(logLine2Id);
        };

        Arrays.sort(logs, logFileComparator);

        for (int i = 0; i < logs.length; i++) {
            System.out.println(logs[i]);
        }


    }


}
