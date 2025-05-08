package genc;

public class TarjetaBaja {

    private double saldo;
    private int viajesEnColectivo = 0;
    private int viajesEnSubte = 0;

    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
        saldo = saldoInicial;
    }

    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
        return saldo;
    }

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) {
        saldo += monto;

        /**
         * pre : saldo suficiente.
         * post: utiliza 21.50 del saldo para un viaje en colectivo.
         */
        if (saldo <= 21.50)

        {
            throw new Error("Saldo insuficiente boludon");
        }
        saldo -= 21.50;
        viajesEnColectivo++;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte.
     */
    public void pagarViajeEnSubte() {
        if (saldo <= 19.50) {
            throw new Error("Saldo insuficiente boludon");
        }
        saldo -= 19.50;
        viajesEnSubte++;
    }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
        return viajesEnColectivo + viajesEnSubte;
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
        return viajesEnColectivo;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() {
        return viajesEnSubte;
    }

}
