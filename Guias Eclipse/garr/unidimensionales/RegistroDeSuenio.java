package garr.unidimensionales;

public class RegistroDeSuenio {

    private int[] horasDormidas;
    private boolean[] interrupciones;

    public RegistroDeSuenio(int dias) {
        horasDormidas = new int[dias];
        interrupciones = new boolean[dias];
    }

    public void registrarHorasDormidas(int dia, int horas, boolean huboInterrupciones) {
        if (dia >= 0 && dia < horasDormidas.length) {
            horasDormidas[dia] = horas;
            interrupciones[dia] = huboInterrupciones;
        }
    }

    public int promedioDeHorasDormidas() {
        int horasDeSueñoPromedio = 0;
        for (int i = 0; i < horasDormidas.length; i++) {
            horasDeSueñoPromedio += horasDormidas[i];
        }
        return horasDeSueñoPromedio / horasDormidas.length;
    }

    public int horasMayorPromedio() {
        int horasDeSueñoPromedio = 0;
        int horasMayoresAPromedio = 0;
        for (int i = 0; i < horasDormidas.length; i++) {
            if (horasDeSueñoPromedio < horasDormidas[i]) {
                horasMayoresAPromedio++;
            }
        }
        return horasMayoresAPromedio;
    }

    public int diasDeSueñoIninterrumpidos(int horaInicial, int horaFinal) {
        int diasIninterrumpidos = 0;
        for (int i = 0; i < horasDormidas.length; i++) {
            if (!interrupciones[i] && horasDormidas[i] >= horaInicial && horasDormidas[i] <= horaFinal) {
                diasIninterrumpidos++;
            }
        }
        return diasIninterrumpidos;
    }

    public static void main(String[] args) {
        RegistroDeSuenio registro = new RegistroDeSuenio(7);

        registro.registrarHorasDormidas(0, 7, false);
        registro.registrarHorasDormidas(1, 6, true);
        registro.registrarHorasDormidas(2, 8, false);
        registro.registrarHorasDormidas(3, 5, true);
        registro.registrarHorasDormidas(4, 9, false);
        registro.registrarHorasDormidas(5, 7, false);
        registro.registrarHorasDormidas(6, 6, true);

        System.out.println("Promedio de horas dormidas: " + registro.promedioDeHorasDormidas());

        System.out.println("Días que se durmió más que el promedio: " + registro.horasMayorPromedio());

        System.out.println("Días sin interrupciones entre 7 y 8 horas: " + registro.diasDeSueñoIninterrumpidos(7, 8));
    }
}