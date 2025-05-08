package garr.unidimensionales;

import java.util.Arrays;

/**
 * Clase representa el pronósticos de temperaturas para la próxima semana.
 */
public class PronosticoSemanal {

    private double[] temperaturas;

    /**
     * post: deja inicializadas las temperaturas del pronóstico en 25 ºC.
     */
    public PronosticoSemanal() {

        temperaturas = new double[7];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = 25.0;
        }
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7,
     * siendo 1 lunes y 7 domingo.
     * post: devuelve la temperatura pronosticada para el día indicado.
     */
    public double obtenerTemperatura(int dia) {
        if (dia < 1 || dia > 7) {
            throw new Error("dia debe ser entre 1 y 7");
        } else {
            return temperaturas[dia - 1];
        }
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7,
     * siendo 1 lunes y 7 domingo.
     * post: cambia la temperatura pronosticada para el día indicado.
     */
    public void pronosticarTemperatura(int dia, double temperatura) {
        if (dia < 1 || dia > 7) {
            throw new Error("dia debe ser entre 1 y 7");
        } else {
            temperaturas[dia - 1] = temperatura;
        }
    }

    /**
     * post: devuelve el promedio de las temperaturas pronosticadas.
     */
    public double calcularPromedioDeTemperaturas() {
        int promedio = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            promedio += temperaturas[i];
        }
        return promedio;
    }

    /**
     * post: devuelve la máxima temperatura pronosticada.
     */
    public double buscarMaximaTemperatura() {
        double maximo = temperaturas[0];
        for (int i = 0; i < temperaturas.length; i++) {
            double candidato = temperaturas[i];
            if (candidato > maximo) {
                maximo = candidato;
            }
        }

        return maximo;
    }

    /**
     * post: devuelve el día de máxima temperatura pronosticada.
     * (Para intrépidos: En caso de repetirse, devolver todos.)
     */
    public int[] buscarDiaDeMaximaTemperatura() {
        double maximo = temperaturas[0];
        double candidato = 0.0;
        for (int i = 0; i < temperaturas.length; i++) {
            candidato = temperaturas[i];
            if (candidato > maximo) {
                maximo = candidato;
            }
        }
        int contarMaximos = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            candidato = temperaturas[i];
            if (candidato == maximo) {
                contarMaximos++;
            }
        }
        int[] maximosDias = new int[contarMaximos];

        int cantidadDeDiasMaximos = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            candidato = temperaturas[i];
            if (candidato == maximo) {
                maximosDias[cantidadDeDiasMaximos++] = i + 1;
            }
        }
        return maximosDias;
    }

    /**
     * post: devuelve la mínima temperatura pronosticada.
     */
    public double buscarMinimaTemperatura() {
        double minimo = temperaturas[0];
        for (int i = 0; i < temperaturas.length; i++) {
            double candidato = temperaturas[i];
            if (candidato < minimo) {
                minimo = candidato;
            }
        }

        return minimo;
    }

    public static void main(String[] args) {
        PronosticoSemanal test = new PronosticoSemanal();

        test.pronosticarTemperatura(1, 20.0);
        test.pronosticarTemperatura(2, 35.0);
        test.pronosticarTemperatura(3, 17.0);
        test.pronosticarTemperatura(4, 35.0);
        test.pronosticarTemperatura(5, 27.0);
        test.pronosticarTemperatura(6, 10.0);
        test.pronosticarTemperatura(7, 35.0);

        System.out.println("La temperatura es " + test.obtenerTemperatura(1));
        System.out.println("El promedio es " + test.calcularPromedioDeTemperaturas());
        System.out.println("La maxima temperatura es " + test.buscarMaximaTemperatura());
        System.out.println("La minima temperatura es " + test.buscarMinimaTemperatura());
        System.out
                .println("Los Dias De Maxima temperatura son " + Arrays.toString(test.buscarDiaDeMaximaTemperatura()));

    }
}
