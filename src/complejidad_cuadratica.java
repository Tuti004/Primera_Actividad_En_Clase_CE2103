import java.util.Arrays;
import java.util.Random;

public class complejidad_cuadratica {

    // Implementación del algoritmo de Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // intercambio de elementos
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Tamaños de los arreglos
        int[] sizes = {10, 100, 1000, 10000, 100000};

        for (int size : sizes) {
            // Generación de un arreglo aleatorio
            int[] arr = new int[size];
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(1000); // Números aleatorios hasta 999
            }

            // Copia del arreglo original para medir el tiempo de ordenamiento
            int[] arrCopy = Arrays.copyOf(arr, arr.length);

            // Medición del tiempo de ordenamiento
            long startTime = System.nanoTime();
            bubbleSort(arrCopy);
            long endTime = System.nanoTime();

            // Verificación de que el arreglo está ordenado correctamente
            boolean sorted = isSorted(arrCopy);

            // Imprimir el arreglo desordenado
            System.out.println("Arreglo desordenado de tamaño " + size + ": " + Arrays.toString(arr));

            // Imprimir el arreglo ordenado
            System.out.println("Arreglo ordenado de tamaño " + size + ": " + Arrays.toString(arrCopy));

            System.out.println("Tiempo de ordenamiento: " + (endTime - startTime) + " nanosegundos");
        }
    }

    // Función para verificar si un arreglo está ordenado
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
