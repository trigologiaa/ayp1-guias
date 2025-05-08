package garr.unidimensionales;

public class Estacionamiento {

    private boolean[] lugares;
    private int[] contarUsos;

    public Estacionamiento(int lugaresDisponibles) {
        lugares = new boolean[lugaresDisponibles];
        contarUsos = new int[lugaresDisponibles];
    }

    public void ocuparLugar(int lugar) {
        if (lugar >= 0 && lugar < lugares.length && !lugares[lugar]) {
            lugares[lugar] = true;
            contarUsos[lugar]++;
        }
    }

    public void desocuparLugar(int lugar) {
        if (lugar >= 0 && lugar < lugares.length && lugares[lugar]) {
            lugares[lugar] = false;
            contarUsos[lugar]++;
        }

    }

    public double porcentajeDeLugaresOcupados() {
        double contador = 0;
        for (int i = 0; i < lugares.length; i++) {
            if (lugares[i]) {
                contador++;
            }
        }
        double porcentaje = (contador / lugares.length) * 100;
        return porcentaje;
    }

    public int contarMasUsosQue(int cantidad) {
        int contador = 0;
        for (int i = 0; i < contarUsos.length; i++) {
            if (contarUsos[i] > cantidad) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento(5);

        estacionamiento.ocuparLugar(0);
        estacionamiento.ocuparLugar(1);
        estacionamiento.ocuparLugar(2);
        estacionamiento.desocuparLugar(1);
        estacionamiento.ocuparLugar(1);
        estacionamiento.desocuparLugar(0);
        estacionamiento.desocuparLugar(2);
        estacionamiento.ocuparLugar(0);
        estacionamiento.ocuparLugar(2);

        System.out.printf("Porcentaje de lugares ocupados: %.2f%%\n", estacionamiento.porcentajeDeLugaresOcupados());
        System.out.println("Lugares usados más de 1 vez: " + estacionamiento.contarMasUsosQue(1));
    }

}
