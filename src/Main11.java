public class Main11 {
    public static void main(String[] args) {
        int seed = 0;

        for (int i = seed; hasNext(i); i = f(i)) {
            // Perform some operations here
            System.out.println(i);
        }
    }

    private static boolean hasNext(int i) {
        // Check if there is a next element based on a certain condition
        // Return true if there is a next element, false otherwise
        // Implement the logic accordingly
        return i < 10;
    }

    private static int f(int i) {
        // Calculate the next value based on the current value
        // Implement the logic accordingly
        return i + 2;
    }
}
