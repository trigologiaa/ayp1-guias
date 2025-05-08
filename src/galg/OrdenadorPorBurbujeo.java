package galg;

/**
 * Ordenador que utiliza el algoritmo de ordenamiento por Selección.
 */
public class OrdenadorPorBurbujeo {

    /**
     * post: reorganiza los elementos de vector de acuerdo al orden lineal <
     * definido para los números enteros.
     * 1 2 3 4 5 6 7 8 9
     * 9 8 7 6 5 4 3 2 1
     */

    public void ordenar(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int a = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = a;
                }
            }
        }
    }
}
