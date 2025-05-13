package genc;

public class CajaDeAhorro {
	
	private String titular;
	private double saldo;
	
	/**
     * post: la instancia queda asignada al titular indicado y con saldo igual a 0.
     */
    public CajaDeAhorro(String titularDeLaCuenta) {
    	this.titular = titularDeLaCuenta;
    	this.saldo = 0.0;
    }
    
    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() {
    	return this.titular;
    }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() {
    	return this.saldo;
    }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto depositado.  
     */
    public void depositar(double monto) {
    	if(monto < 0.0) {
    		throw new Error("El monto debe ser mayor que 0.0. Es " + monto + ".");
    	}
    	this.saldo += monto;
    }
 
    /**
     * @monto: la cantidad de dinero a extraer de la cuenta.
     * pre : monto es mayor a 0 y menor o igual que el saldo de la Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto extraído.
     */
    public void extraer(double monto) {
    	if(monto <= 0.0) {
    		throw new Error("El monto a extraer debe ser mayor a 0.0. Es " + monto + ".");
    	}
    	if(monto > saldo) {
    		throw new Error("El monto que se quiere extraer (" + monto + ") es mayor al saldo disponible (" + saldo + ").");
    	}
    	this.saldo -= monto;
    }
    
    public static void main(String[] args) {
    	CajaDeAhorro cuenta = new CajaDeAhorro("Juan Perez");
    	try {
        	System.out.println("Depositando 500...");
        	cuenta.depositar(500);
        	System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    	} catch (Error e) {
        	System.out.println("Error al depositar: " + e.getMessage());
    	}
    	try {
        	System.out.println("Extrayendo 200...");
        	cuenta.extraer(200);
        	System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    	} catch (Error e) {
        	System.out.println("Error al extraer: " + e.getMessage());
    	}
    	try {
        	System.out.println("Intentando extraer 400...");
        	cuenta.extraer(400);
        	System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    	} catch (Error e) {
        	System.out.println("Error al extraer: " + e.getMessage());
    	}
    	try {
        	System.out.println("Intentando depositar -100...");
        	cuenta.depositar(-100);
        	System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    	} catch (Error e) {
        	System.out.println("Error al depositar: " + e.getMessage());
    	}
	}
	
}