package genc;

public class Cubo {
	
	private double lado;
	
	/**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada.
     */
    public Cubo (double longitudLado) {
    	cambiarLado(longitudLado);
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo.
     */
    public void cambiarLado(double longitudLado) {
    	validarPositividad(longitudLado);
    	lado = longitudLado;
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo.
     */
    public void cambiarAreaCara(double areaCara) {
    	validarPositividad(areaCara);
        lado = Math.sqrt(areaCara);
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo.
     */
    public void cambiarVolumen(double volumen) {
    	validarPositividad(volumen);
        lado = Math.cbrt(volumen);
    }
    
    /**
     * post: lanza un error si el valor no es estrictamente positivo.
     */
    private void validarPositividad(double valor) {
    	if(valor <= 0) {
            throw new Error("El valor debe ser positivo. Es " + valor + ".");
        }
    }
    
    /**
     * post: devuelve la longitud de todos los lados del cubo.
     */
    public double obtenerLado() {
    	return lado;
    }

    
    /**
     * post: devuelve el área de la superficie de las caras del cubo.
     */
    public double obtenerAreaCara() {
    	return Math.pow(lado, 2);
    }

    /**
     * post: devuelve el volumen que encierra el cubo.
     */
    public double obtenerVolumen() {
    	return Math.pow(lado, 3);
    }
    
    public static void main(String[] args) {
    	System.out.println("Creando cubo con lado 5...");
        Cubo cubo = new Cubo(5);
        System.out.println("Lado: " + cubo.obtenerLado());
        System.out.println("Área de la cara: " + cubo.obtenerAreaCara());
        System.out.println("Volumen: " + cubo.obtenerVolumen());
        System.out.println("\nCambiando área de la cara a 100...");
        cubo.cambiarAreaCara(100);
        System.out.println("Nuevo lado: " + cubo.obtenerLado());
        System.out.println("\nCambiando volumen a 125...");
        cubo.cambiarVolumen(125);
        System.out.println("Nuevo lado: " + cubo.obtenerLado());
        System.out.println("\nIntentando cambiar lado a -2...");
        try {
            cubo.cambiarLado(-2);
        } catch (Error e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        System.out.println("\nIntentando cambiar área de la cara a 0...");
        try {
            cubo.cambiarAreaCara(0);
        } catch (Error e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        System.out.println("\nIntentando cambiar volumen a -50...");
        try {
            cubo.cambiarVolumen(-50);
        } catch (Error e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        System.out.println("\nFin de la prueba.");
	}
    
}