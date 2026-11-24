public class Counter {
    private int count;
    private static int totalObjects;
    {
        totalObjects++;
    }

    public void increment() { count += 1; }

    public void decrement() { count -= 1; }

    public void reset() { count = 0; }

    public int getCount() { return count; }

    public static int getTotalObjects() { return totalObjects; }
}