public class exponencial {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int n = 30; // The index of the Fibonacci number to calculate
        System.out.println(fibonacci(n));

        long endTime = System.nanoTime();
        long durationSeconds = (endTime - startTime);

        System.out.println("Time taken: " + durationSeconds + " nanoseconds");
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
