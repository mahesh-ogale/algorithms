public class SizeOfBinaryTreeWithArray {

    public static void main(String[] args) {
//        System.out.println(sizeOfTree(new long[]{3,6,2,9,-1,10}));

        System.out.println(sizeOfTree(new long[]{3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1}));
    }

    private static String sizeOfTree(long[] numbers) {
        if (numbers == null || numbers.length == 1) {
            return "";
        }
        long left = sum(numbers, 1);
        long right = sum(numbers, 2);
        return (left == right) ? "" : (left > right ? "Left" : "Right");
    }

    private static long sum(long[] numbers, int index) {
        if (index >= numbers.length || numbers[index] == -1) {
            return 0;
        }
        return numbers[index] + sum(numbers, 2 * index + 1) + sum(numbers, 2 * index + 2);
    }
}
