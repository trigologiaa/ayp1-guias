package garr.multidimensionales;

public class CuboMagico {
    public static boolean verificar(int[][] cubo) {
        int suma = 0;
        for (int j = 0; j < cubo.length; j++) {
            suma += cubo[0][j];
        }
        for (int i = 0; i < cubo.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < cubo.length; j++) {
                sumaFila += cubo[i][j];
            }
            if (suma != sumaFila) {
                return false;
            }
        }

        for (int j = 0; j < cubo.length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < cubo.length; i++) {
                sumaColumna += cubo[i][j];
            }

            if (suma != sumaColumna) {
                return false;
            }
        }

        int sumaDiagonal = 0;
        for (int i = 0; i < cubo.length; i++) {
            sumaDiagonal += cubo[i][i];
        }
        if (suma != sumaDiagonal) {
            return false;

        }

        int sumaDiagonal1 = 0;
        for (int i = 0; i < cubo.length; i++) {
            sumaDiagonal1 += cubo[i][cubo.length - 1 - i];
        }
        if (suma != sumaDiagonal1) {
            return false;
        }

        return true;

    }
}
