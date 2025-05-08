package galg;

public class VerificadorDeOrden {

    /**
     * post: indica si los elemento del vector están o no ordenados
     * de manera ascendente.
     */
    public boolean estaOrdenadoAscendentemente(int[] vector) {
        boolean estaOrdenado = true;
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                estaOrdenado = false;
            }
        }
        return estaOrdenado;
    }

    /**
     * post: indica si los elemento del vector están o no ordenados
     * de manera descendente.
     */
    public boolean estaOrdenadoDescendentemente(int[] vector) {
        boolean estaOrdenado = true;
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] < vector[i + 1]) {
                estaOrdenado = false;
            }
        }
        return estaOrdenado;
    }

}
