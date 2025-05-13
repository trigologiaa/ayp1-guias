package genc;

public class TarjetaBaja {
	
	private double saldo;
	private int viajesColectivo, viajesSubte;
	
	/**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
    	validarPositividad(saldoInicial);
    	saldo = saldoInicial;
    }
    
    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) {
    	validarPositividad(monto);
    	saldo += monto;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
    public void pagarViajeEnColectivo() {
    	pagar(21.50);
    	viajesColectivo++;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */
    public void pagarViajeEnSubte() {
    	pagar(19.50);
    	viajesSubte++;
    }
    
    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
    	return saldo;
    } 

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
    	return viajesColectivo + viajesSubte;
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
    	return viajesColectivo;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() {
    	return viajesSubte;
    }
    
    /**
     * post: lanza un error si el valor no es positivo.
     */
    private void validarPositividad(double valor) {
    	if(valor <= 0) {
    		throw new Error("El valor debe ser positivo. Es " + valor + ".");
    	}
    }
    
    /**
     * pre : el saldo debe ser mayor o igual al costo.
     * post: descuenta el costo del saldo o lanza un error si no hay saldo suficiente.
     */
    private void pagar(double costo) {
    	if(saldo < costo) {
    		throw new Error("Saldo insuficiente para pagar viaje. Saldo disponible: $" + saldo);
    	}
    	saldo -= costo;
    }

	public static void main(String[] args) {
		System.out.println("Creando tarjeta con saldo inicial de $50...");
	    TarjetaBaja tarjeta = new TarjetaBaja(50.0);
	    System.out.println("Saldo actual: $" + tarjeta.obtenerSaldo());
	    try {
	        System.out.println("\nPagando viaje en colectivo...");
	        tarjeta.pagarViajeEnColectivo();
	    } catch (Error e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    System.out.println("Saldo actual: $" + tarjeta.obtenerSaldo());
	    System.out.println("Viajes totales: " + tarjeta.contarViajes());
	    System.out.println("Viajes en colectivo: " + tarjeta.contarViajesEnColectivo());
	    System.out.println("Viajes en subte: " + tarjeta.contarViajesEnSubte());
	    try {
	        System.out.println("\nPagando viaje en subte...");
	        tarjeta.pagarViajeEnSubte();
	    } catch (Error e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    System.out.println("Saldo actual: $" + tarjeta.obtenerSaldo());
	    System.out.println("Viajes totales: " + tarjeta.contarViajes());
	    System.out.println("Viajes en colectivo: " + tarjeta.contarViajesEnColectivo());
	    System.out.println("Viajes en subte: " + tarjeta.contarViajesEnSubte());
	    System.out.println("\nIntentando cargar la tarjeta con monto negativo...");
	    try {
	    	tarjeta.cargar(-15);
	    } catch (Error e) {
	    	System.out.println("Error: " + e.getMessage());
	    }
	    System.out.println("\nCargando $20 a la tarjeta...");
	    tarjeta.cargar(20);
	    System.out.println("Saldo actual: $" + tarjeta.obtenerSaldo());
	    System.out.println("\nIntentando pagar 2 viajes más en colectivo...");
	    try {
	        tarjeta.pagarViajeEnColectivo();
	    } catch (Error e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    try {
	        tarjeta.pagarViajeEnColectivo();
	    } catch (Error e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    System.out.println("Saldo actual: $" + tarjeta.obtenerSaldo());
	    System.out.println("Viajes totales: " + tarjeta.contarViajes());
	    System.out.println("Viajes en colectivo: " + tarjeta.contarViajesEnColectivo());
	    System.out.println("Viajes en subte: " + tarjeta.contarViajesEnSubte());
	    System.out.println("\nIntentando pagar un viaje en subte con saldo insuficiente...");
	    try {
	        tarjeta.pagarViajeEnSubte();
	    } catch (Error e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    System.out.println("Saldo actual: $" + tarjeta.obtenerSaldo());
	    System.out.println("Viajes totales: " + tarjeta.contarViajes());
	    System.out.println("Viajes en subte: " + tarjeta.contarViajesEnSubte());
	    System.out.println("\nFin de prueba.");
	}

}