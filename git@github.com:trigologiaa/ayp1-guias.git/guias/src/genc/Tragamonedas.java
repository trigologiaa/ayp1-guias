package genc;

public class Tragamonedas {
	
	private Tambor[] tambores;
	
	/**
     * post: los 3 Tambores del Tragamonedas están en la posición 1.
     */
    public Tragamonedas() {
    	tambores = new Tambor[3];
    	for(int i = 0; i < 3; i++) {
    		tambores[i] = new Tambor();
    	}
    }

    /**
     * post: activa el Tragamonedas haciendo girar sus 3 Tambores.
     */
    public void activar() {
    	for(Tambor tambor: tambores) {
    		tambor.girar();
    	}
    }

    /**
     * post: indica si el Tragamonedas entrega un premio a partir de la posición de sus 3 Tambores.
     */
    public boolean entregaPremio() {
    	int posicion = tambores[0].obtenerPosicion();
    	for(Tambor tambor: tambores) {
    		if(tambor.obtenerPosicion() != posicion) {
    			return false;
    		}
    	}
    	return true;
    }

/**
     * post: obtiene la posición del iésimo tambor del Tragamonedas
       pre:  i => 0; i < n (n = cantidad de tambores)
     */
    public int obtenerPosicionDelTambor(int i) {
    	if(i < 0 || i >= tambores.length) {
    		throw new Error("Índice de tambor fuera de rango.");
    	}
    	return tambores[i].obtenerPosicion();
    }

	public static void main(String[] args) {
		Tragamonedas tragamonedas = new Tragamonedas();
	    System.out.println("Posiciones iniciales:");
	    for (int i = 0; i < 3; i++) {
	        System.out.println("Tambor " + i + " está en la posición: " + tragamonedas.obtenerPosicionDelTambor(i));
	    }
	    System.out.println("\nActivando el tragamonedas...");
	    tragamonedas.activar();
	    System.out.println("\nPosiciones después de activar:");
	    for (int i = 0; i < 3; i++) {
	        System.out.println("Tambor " + i + " está en la posición: " + tragamonedas.obtenerPosicionDelTambor(i));
	    }
	    if (tragamonedas.entregaPremio()) {
	        System.out.println("\n¡Felicidades! ¡Has ganado un premio!");
	    } else {
	        System.out.println("\nNo has ganado un premio.");
	    }
	    System.out.println("\nProbando el manejo de errores...");
	    try {
	        System.out.println(tragamonedas.obtenerPosicionDelTambor(3));
	    } catch (Error e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    try {
	        System.out.println(tragamonedas.obtenerPosicionDelTambor(-1));
	    } catch (Error e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}

}