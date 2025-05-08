package genc;

public class Nota {

    int nota;

    /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
    public Nota(int valorInicial) {
        if (valorInicial < 0 || valorInicial > 10) {
            throw new Error("Nota debe ser entre 0 y 10");
        }
        nota = valorInicial;
    }

    /**
     * post: devuelve el valor numérico de la Nota,
     * comprendido entre 0 y 10.
     */
    public int obtenerValor() {
        return nota;
    }

    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
        return nota >= 4;
    }

    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
        return nota < 4;
    }

    /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo
     * por nuevoValor, siempre y cuando nuevoValor sea superior al
     * valor numérico actual de la Nota.
     */
    public void recuperar(int nuevoValor) {
        if (nuevoValor < nota || nuevoValor > 10) {
            throw new Error("Nota debe ser entre 0 y 10 o No alcanza");
        }
        nota = nuevoValor;
    }

}