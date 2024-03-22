import java.util.Random;

public class exponencial {

    public static void main(String[] args) {
        // Generar un arreglo de 10 elementos aleatorios
        int[] array = generateRandomArray(100000);

        long startTime = System.nanoTime(); // Registro de tiempo inicial

        // Calcular la potencia exponencial de cada elemento
        for (int i = 0; i < array.length; i++) {
            int base = array[i];
            int exponent = 2; // Exponente, puedes cambiarlo según necesites
            exponential(base, exponent);
        }

        long endTime = System.nanoTime(); // Registro de tiempo final
        long duration = endTime - startTime; // Calcular duración en nano segundos
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }

    // Función para generar un arreglo de tamaño "size" con números aleatorios entre 1 y 10
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10) + 1; // Números aleatorios entre 1 y 10
        }
        return array;
    }

    // Función recursiva para calcular la potencia
    public static long exponential(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * exponential(base, exponent - 1);
    }
}
