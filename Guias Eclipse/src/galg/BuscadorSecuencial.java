package galg;

/**
 * Buscador que utiliza el algoritmo de búsqueda secuencial.
 */
public class BuscadorSecuencial {

    /**
     * post: devuelve la posición de vector en la que se localizó la primera
     * ocurrencia del elemento buscado.
     * Si no lo encuentra devuelve -1.
     */
    public int buscar(int[] vector, int buscado) {
        if (vector == null) {
            throw new Error("El arreglo no puede ser nulo.");
        }
        for (int i = 0; i < vector.length; i++) {
            if (buscado == vector[i]) {
                return i;
            }
        }
        return -1;
    }
}
