public class kthSymbolGrammer {

    public static void main(String[] args) {
        System.out.println(kthGrammar(4,8));
    }

    static public int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }
        if (N == 2 && K == 1) {
            return 0;
        }
        if (N == 2 && K == 2) {
            return 1;
        }
        int prevK = K/2;
        if (K % 2 != 0) {
            prevK = prevK + 1;
        }
        int result = kthGrammar(N-1, prevK);

        return K % 2 != 0 ? result : result == 1 ? 0 : 1;
    }

//    static public int kthGrammar(int N, int K) {
//        String result = nthRow(N);
//        System.out.println(result);
//        return result.charAt(K-1) == 48 ? 0 : 1;
//    }
//
//    static private String nthRow(int N) {
//        if (N == 1) {
//            return "0";
//        }
//        String temp = nthRow(N-1);
//        StringBuffer result = new StringBuffer();
//        for (int i = 0; i < temp.length(); i++) {
//            if (temp.charAt(i) == '0') {
//                result.append("01");
//            } else {
//                result.append("10");
//            }
//        }
//        return result.toString();
//    }
}
