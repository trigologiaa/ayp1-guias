package genc;

public class Nota {
	
	private int valor;
	
	/**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
    public Nota(int valorInicial) {
    	recuperar(valorInicial);
    }
    
    /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() {
    	return valor;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
    	return valor >= 4;
    }
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
    	return !aprobado();
    }
    
    /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo
     *       por nuevoValor, siempre y cuando nuevoValor sea superior al
     *       valor numérico actual de la Nota.
     */
    public void recuperar(int nuevoValor) {
    	if(nuevoValor < 0 || nuevoValor > 10) {
			throw new Error("La nota debe ser entre 0 y 10. Nota (" + nuevoValor + ") inválida.");
		} else if(nuevoValor < valor) {
			throw new Error("La nota (" + nuevoValor + ") de recuperación es menor que la nota anterior.");
    	}
    	valor = nuevoValor;
    }

	public static void main(String[] args) {
		System.out.println("Creando nota con valor inicial 3...");
	    Nota nota = new Nota(3);
	    System.out.println("Valor actual: " + nota.obtenerValor());
	    System.out.println("¿Aprobado? " + nota.aprobado());
	    System.out.println("¿Desaprobado? " + nota.desaprobado());
	    System.out.println("\nIntentando recuperar con valor 5...");
	    try {
	        nota.recuperar(5);
	        System.out.println("Valor actual: " + nota.obtenerValor());
	    } catch (Error e) {
	        System.out.println("Error capturado: " + e.getMessage());
	    }
	    System.out.println("\nIntentando recuperar con valor 2 (no debería cambiar)...");
	    try {
	        nota.recuperar(2);
	    } catch (Error e) {
	        System.out.println("Error capturado: " + e.getMessage());
	    }
	    System.out.println("Valor actual: " + nota.obtenerValor());
	    System.out.println("\n¿Aprobado? " + nota.aprobado());
	    System.out.println("¿Desaprobado? " + nota.desaprobado());
	    System.out.println("\nIntentando recuperar con valor inválido (11)...");
	    try {
	        nota.recuperar(11);
	    } catch (Error e) {
	        System.out.println("Error capturado: " + e.getMessage());
	    }
	    System.out.println("\nFin de la prueba.");
	}

}