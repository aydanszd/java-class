public class MemoryTest {

    public static void changeFirstElement(int[] numbers) {
        if (numbers != null && numbers.length > 0) {
            numbers[0] = 100;
        }
    }

    public static int[] createNewArray(int[] numbers) {
        if (numbers == null) {
            return null;
        }
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i];
        }
        return result;
    }

    public static void displayArray(int[] numbers) {
        if (numbers == null) {
            System.out.println("Massiv is null");
            return;
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}