package garr.multidimensionales;

public class MapaDeHumedad {
    private double humedad[][];

    public MapaDeHumedad(int metrosX, int metrosY) {
        if (((metrosX) <= 0) || ((metrosY) <= 0)) {
            throw new Error("No se pueden tener metros cuadrados negativos y/o nulos");
        }
        this.humedad = new double[metrosX][metrosY];
        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                this.humedad[i][j] = 0.0;
            }
        }
    }

    public void muestraHumedad(double humedad, int metrosX, int metrosY) {
        if (metrosX < 0 || metrosX >= this.humedad.length ||
                metrosY < 0 || metrosY >= this.humedad[0].length ||
                humedad < 0.0 || humedad > 100.0) {
            throw new Error(
                    "La medicion se pasa de los limites establecidos por el terreno, o la medicion es erronea (0.0% a 100.0%)");
        }

        this.humedad[metrosX][metrosY] = humedad;
    }

    public double promedioHumedad() {
        double promedio = 0;
        int contador = 0;
        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                contador++;
                promedio += humedad[i][j];
            }
        }

        if (contador != 0) {
            promedio = promedio / contador;
        }

        return promedio;
    }

    /*
     * Pre:
     * (Configurar == True) = Maximo
     * (Configurar == False) = Minimo
     */
    public double maximoOMinimo(boolean configurar) {
        double candidato = this.humedad[0][0];
        if (configurar) {
            for (int i = 0; i < humedad.length; i++) {
                for (int j = 0; j < humedad[i].length; j++) {
                    if (humedad[i][j] > candidato) {
                        candidato = humedad[i][j];
                    }
                }
            }
        } else {
            for (int i = 0; i < humedad.length; i++) {
                for (int j = 0; j < humedad[i].length; j++) {
                    if (humedad[i][j] < candidato) {
                        candidato = humedad[i][j];
                    }
                }

            }
        }
        return candidato;
    }

    public double promedioContorno() {
        double promedio = 0;
        int contador = 0;
        for (int j = 0; j < humedad.length; j++) {
            promedio += humedad[0][j];
            promedio += humedad[humedad.length - 1][j];
            contador += 2;
        }
        for (int i = 1; i < humedad.length - 1; i++) {
            promedio += humedad[i][0];
            promedio += humedad[i][humedad[0].length - 1];
            contador += 2;
        }

        return promedio / contador;
    }

    public int contarMuestrasEnRango(double desde, double hasta) {
        int contador = 0;
        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                if ((humedad[i][j] >= desde && humedad[i][j] <= hasta)) {
                    contador++;
                }

            }
        }

        return contador;
    }

    public void reemplazarPorPromedioContiguos(int f, int c) {

    }

}
