package genc;

public class Cerradura {
	
	private int clave, fallosConsecutivos, maxFallos, exitosas, fallidas;
    private boolean abierta;
	
    /**
     * pre: clave de apertura puede ser cualquier numero, cantidadDeFallosConsecutivosQueLaBloquean debe ser almenos 1.
     * post: inicializa una cerradura con clave y cantidad de fallos que bloquean la cerradura.
     */
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		if(claveDeApertura <= 0) {
			throw new Error("La clave debe ser positiva.");
		}
		if(cantidadDeFallosConsecutivosQueLaBloquean <= 0) {
			throw new Error("La cantidad de fallos consecutivos debe ser mayor a 0.");
		}
		this.clave = claveDeApertura;
		this.maxFallos = cantidadDeFallosConsecutivosQueLaBloquean;
		this.abierta = true;
	}

	/**
     * pre: la cerradura esta cerrada y no esta bloqueada.
     * post: abre la cerradura con la clave correctas y en caso de fallar consecutivamente X veces, bloquea la cerradura.
     */
	public boolean abrir(int clave) {
		if(clave < 0) {
			throw new Error("Clave inválida");
		}
		if(fueBloqueada()) {
			return false;
		}
		if(this.clave == clave) {
			abierta = true;
			fallosConsecutivos = 0;
			exitosas++;
			return true;
		} else {
			fallosConsecutivos++;
			fallidas++;
			return false;
		}
	}
	
	/**
     * post: cierra la cerradura.
     */
	public void cerrar() {
		this.abierta = false;
	}
	
	/**
     * post: devuelve si la cerradura sigue abierta.
     */
	public boolean estaAbierta() {
		return this.abierta;
	}
	
	/**
     * post: devuelve si la cerradura esta cerrada.
     */
	public boolean estaCerrada() {
		return !abierta;
	}
	
	/**
     * post: devuelve que la cerradura fue bloqueada.
     */
	public boolean fueBloqueada() {
		return fallosConsecutivos >= maxFallos;
	}
	
	/**
     * post: cuenta la cantidad de veces que se abrio la cerradura.
     */
	public int contarAperturasExitosas() {
		return exitosas;
	}
	
	/**
     * post: cuenta cantidad de veces que la clave fue mal introducida.
     */
	public int contarAperturasFallidas() {
		return fallidas;
	}

	public static void main(String[] args) {
	    try {
	        Cerradura cerraduraInvalida = new Cerradura(-1234, 3);
	    } catch (Error e) {
	        System.out.println("Error capturado (clave negativa): " + e.getMessage());
	    }
	    try {
	        Cerradura cerraduraInvalida = new Cerradura(1234, 0);
	    } catch (Error e) {
	        System.out.println("Error capturado (fallos máximos <= 0): " + e.getMessage());
	    }
	    Cerradura cerradura = new Cerradura(1234, 3);
	    try {
	        cerradura.abrir(-111);
	    } catch (Error e) {
	        System.out.println("Error capturado (intento con clave negativa): " + e.getMessage());
	    }
	    System.out.println("Intento 1 (clave incorrecta): " + cerradura.abrir(1111));
	    System.out.println("Intento 2 (clave incorrecta): " + cerradura.abrir(2222));
	    System.out.println("Intento 3 (clave incorrecta): " + cerradura.abrir(3333));
	    System.out.println("¿Fue bloqueada? " + cerradura.fueBloqueada());
	    System.out.println("Intento con clave correcta (luego de bloqueo): " + cerradura.abrir(1234));
	    Cerradura cerradura2 = new Cerradura(5678, 2);
	    System.out.println("Intento con clave correcta: " + cerradura2.abrir(5678));
	    System.out.println("¿Está abierta? " + cerradura2.estaAbierta());
	    cerradura2.cerrar();
	    System.out.println("¿Está cerrada? " + cerradura2.estaCerrada());
	    cerradura2.abrir(0000);
	    cerradura2.abrir(5678);
	    System.out.println("Aperturas exitosas: " + cerradura2.contarAperturasExitosas()); // 2
	    System.out.println("Aperturas fallidas: " + cerradura2.contarAperturasFallidas()); // 1
	}

}