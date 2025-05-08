package garr.multidimensionales;

public class AnalizadorDeMatrices {

    /**
     * post: devuelve la cantidad de elementos de ‘matriz’ que
     * tenga al menos un valor 0.
     */
    public int contarCeros(double[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * post: devuelve la cantidad de elementos de ‘matriz’ cuyo valor
     * esté en el rango [‘desde’, ‘hasta’].
     */
    public int contarElementosEnElRango(double[][] matriz, double desde, double hasta) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= desde && matriz[i][j] <= hasta) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * pre: ‘matriz’ es regular.
     * post: devuelve la cantidad de columnas de ‘matriz’ que tenga
     * al menos un valor 0.
     */
    public int contarColumnasConCeros(double[][] matriz) {
        int contador = 0;
        int columna = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length > columna) {
                columna = matriz[i].length;
            }
        }

        for (int j = 0; j < columna; j++) {
            boolean tieneCero = false;
            for (int i = 0; i < matriz.length; i++) {
                if (j < matriz[i].length && matriz[i][j] == 0) {
                    tieneCero = true;
                }
            }
            if (tieneCero) {
                contador++;
            }
        }
        return contador;
    }

    public int contarFilasConCeros(double[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            boolean tieneCero = false;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    tieneCero = true;
                }
            }
            if (tieneCero) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * post: devuelve un arreglo (con tantos elementos como filas tiene
     * 'matriz') que tiene en cada posición el promedio de una fila del
     * arreglo 'matriz'.
     */
    public double[] promediarFilas(double[][] matriz) {
        double[] promedio = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            double suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            if (matriz[i].length > 0) {
                promedio[i] = suma / matriz[i].length;
            } else {
                promedio[i] = 0;
            }
        }
        return promedio;
    }

}
