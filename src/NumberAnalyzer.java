public class NumberAnalyzer {
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
    public static int countEven(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void displayArray(int[] numbers) {
        if (numbers == null) {
            System.out.println("Array is null");
            return;
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}