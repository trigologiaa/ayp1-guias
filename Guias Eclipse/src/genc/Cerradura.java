package genc;

class Cerradura {
    private int contraseña;
    private int fallos;
    private int fallosQueBloquean;
    private boolean bloqueo;
    private boolean puertaAbierta = false;
    private int aperturasExitosas;
    private int aperturasFallidas;

    /**
     * pre: clave de apertura puede ser cualquier numero,
     * cantidadDeFallosConsecutivosQueLaBloquean debe ser almenos 1
     * post: inicializa una cerradura con clave y cantidad de fallos que bloquean la
     * cerradura
     */
    public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
        contraseña = claveDeApertura;
        if (cantidadDeFallosConsecutivosQueLaBloquean < 1) {
            throw new Error("Los fallos que bloquean no deben ser negativos y deben ser almenos 1.");
        } else {
            fallosQueBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
            fallos = 0;
            bloqueo = false;
        }
    }

    /**
     * pre: la cerradura esta cerrada y no esta bloqueada
     * post: abre la cerradura con la clave correctas y en caso de
     * fallar consecutivamente X veces, bloquea la cerradura
     */
    public boolean abrir(int clave) {
        if (bloqueo) {
            return false;
        }
        if (!puertaAbierta && clave == contraseña) {
            puertaAbierta = true;
            aperturasExitosas++;
            fallosQueBloquean = 0;
            return true;
        } else {
            fallos++;
            aperturasFallidas++;
        }
        if (fallos >= fallosQueBloquean) {
            bloqueo = true;
        }
        return false;
    }

    /**
     * post: cierra la cerradura
     */
    public void cerrar() {
        if (puertaAbierta) {
            puertaAbierta = false;
        }
    }

    /**
     * post: devuelve si la cerradura sigue abierta
     */
    public boolean estaAbierta() {
        return puertaAbierta;
    }

    /**
     * post: devuelve si la cerradura esta cerrada
     */
    public boolean estaCerrada() {
        return !puertaAbierta;
    }

    /**
     * post: devuelve que la cerradura fue bloqueada
     */
    public boolean fueBloqueada() {
        return bloqueo;
    }

    /**
     * post: cuenta la cantidad de veces que se abrio la cerradura
     */
    public int contarAperturasExitosas() {
        return aperturasExitosas;
    }

    /**
     * post: cuenta cantidad de veces que la clave fue mal introducida
     */
    public int contarAperturasFallidas() {
        return aperturasFallidas;
    }

    public int fallos() {
        return fallos;
    }

    public int contraseña() {
        return contraseña;
    }
}
