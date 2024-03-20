public class complejidad_lineal {

    public static int buscar(int[] array, int valor) {
        for (int i=0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();



        long endTime = System.currentTimeMillis();
        long durationSeconds = (endTime - startTime);

        System.out.println("Time taken: " + durationSeconds + " miliseconds");
    }
}
