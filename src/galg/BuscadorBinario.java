package galg;

/**
 * Buscador que utiliza el algoritmo de búsqueda binaria.
 */
public class BuscadorBinario {

    /**
     * post: devuelve la posición de vector en la que se localizó la primera
     * ocurrencia del elemento buscado.
     * Si no lo encuentra devuelve -1.
     * {1, 2, 14, 25, 26, 50, 65, 74, 85, 98, 102, 125 }
     * Buscar 2
     */
    public int buscar(int[] vector, int buscado) {

        int inicio = 0;
        int fin = vector.length - 1;

        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;
            if (vector[mitad] == buscado) {
                return mitad;
            } else if (vector[mitad] > buscado) {
                fin = mitad - 1;
            } else if (vector[mitad] < buscado) {
                inicio = mitad + 1;
            }
        }
        return -1;
    }

}
