package galg;

/**
 * Ordenador que utiliza el algoritmo de ordenamiento por Inserción.
 */
public class OrdenadorPorInsercion {

    /**
     * post: reorganiza los elementos de vector de acuerdo al orden lineal <
     * definido para los números enteros.
     */
    public void ordenar(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            int clave = vector[i];
            int j = i - 1;

            while (j >= 0 && vector[j] > clave) {
                vector[j + 1] = vector[j];
                j--;
            }

            vector[j + 1] = clave;
        }
    }
}
