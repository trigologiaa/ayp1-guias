package galg;

/**
 * Ordenador que utiliza el algoritmo de ordenamiento por Selección.
 */
public class OrdenadorPorSeleccion {

    /**
     * post: reorganiza los elementos de vector de acuerdo al orden lineal <
     * definido para los números enteros.
     * 10 9 8 7 6 5 4 3 2 1
     */
    public void ordenar(int[] vector) {

        for (int i = 0; i < vector.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int a = vector[i];
                vector[i] = vector[min];
                vector[min] = a;
            }

        }

    }
}
