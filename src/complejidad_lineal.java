import java.util.Random;

public class complejidad_lineal {
    public static void buscar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void main(String[] args) {
        int tamanoArray = 100000; // Tamaño específico del array
        int[] miArray = new int[tamanoArray]; // Crear un array del tamaño especificado

        Random rand = new Random();

        // Llenar el array con números aleatorios
        for (int i = 0; i < tamanoArray; i++) {
            miArray[i] = rand.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }

        long startTime = System.nanoTime(); // Tiempo inicial

        // Llamar a la función buscar
        buscar(miArray);

        long endTime = System.nanoTime(); // Tiempo final

        long tiempoDeEjecucion = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + tiempoDeEjecucion + " nanosegundos");
    }
}
