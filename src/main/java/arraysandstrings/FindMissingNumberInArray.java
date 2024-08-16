package arraysandstrings;

public class FindMissingNumberInArray {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        //mathematical approach
        int sum = n * (n + 1) / 2; //sum of table without missing number
        for (int j : arr) {
            sum -= j;
        }
        return sum;
    }
}
