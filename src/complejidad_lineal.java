public class complejidad_lineal {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int n = 20; // Tamaño de la matriz
        int[][] matriz = new int[n][n]; // Creamos una matriz de tamaño n x n

        // Llenamos la matriz con valores
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = i * n + j + 1; // Valores del 1 al n^2
            }
        }

        long endTime = System.nanoTime();
        long durationSeconds = (endTime - startTime);

        System.out.println("Time taken: " + durationSeconds + " nanoseconds");
    }
}
