import java.util.Arrays;
import java.util.Random;

class logaritmico {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Generar un arreglo de números aleatorios
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000); // Rango de números aleatorios
        }
        return array;
    }

    public static void main(String args[]) {
        // Tamaños de los arreglos
        int[] sizes = {100000};

        // Realizar pruebas para cada tamaño de arreglo
        for (int size : sizes) {
            // Generar arreglo aleatorio
            int[] array = generateRandomArray(size);

            // Elemento a buscar
            int x = array[size - 1]; // Buscamos el último elemento para asegurarnos de que esté presente

            logaritmico ob = new logaritmico();

            // Imprimir arreglo antes de la búsqueda
            System.out.println("Arreglo antes de la búsqueda para " + size + " elementos:");

            // Medir el tiempo de búsqueda
            long startTime = System.nanoTime();
            int result = ob.binarySearch(array, 0, size - 1, x);
            long endTime = System.nanoTime();
            long duration = endTime - startTime; // Duración en nanosegundos

            if (result == -1)
                System.out.println("Elemento " + x + " no está presente en el arreglo de tamaño " + size);
            else
                System.out.println("Elemento " + x + " está presente en el arreglo de tamaño " + size + " en el índice " + result);

            // Imprimir arreglo después de la búsqueda
            System.out.println("Arreglo después de la búsqueda:");

            System.out.println("Tiempo de búsqueda para " + size + " elementos: " + duration + " ns");
            System.out.println();
        }
    }
}
