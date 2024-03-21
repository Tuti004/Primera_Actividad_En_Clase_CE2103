public class exponencial {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int n = 100; // The index of the Fibonacci number to calculate
        System.out.println("Fibonacci number at index " + n + ": " + fibonacci(n));

        long endTime = System.currentTimeMillis();
        long durationSeconds = (endTime - startTime);

        System.out.println("Time taken: " + durationSeconds + " miliseconds");
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
