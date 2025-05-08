package garr.unidimensionales;

public class HistorialDeHumedad {

    private double[] humedad;

    public HistorialDeHumedad(int mediciones) {
        humedad = new double[mediciones];
        for (int i = 0; i < humedad.length; i++) {
            humedad[i] = 0.0;
        }
    }

    public void almacenarHumedad(int muestra, double valor) {
        humedad[muestra] = valor;
    }

    public double humedadPromedio() {
        double promedio = 0;
        for (int i = 0; i < humedad.length; i++) {
            promedio += humedad[i];
        }
        return promedio / humedad.length;
    }

    /*
     * si configurar es verdadero busca maximo
     * de lo contrario, busca minimo
     */
    public double minMaxHumedad(boolean configurar) {
        double candidato = humedad[0];
        for (int i = 0; i < humedad.length; i++) {
            double actual = humedad[i];
            if (configurar) {
                if (actual > candidato) {
                    candidato = actual;
                }
            } else {
                if (actual < candidato) {
                    candidato = actual;
                }
            }
        }
        return candidato;
    }

}
