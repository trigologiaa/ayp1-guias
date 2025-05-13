package genc;

public class Punto {
	
	private double x;
	private double y;
	
	/*
	 * post: inicializa el punto con las coordenadas dadas.
	 */
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 * post: devuelve la coordenada x del punto.
	 */
	public double obtenerX() {
		return x;
	}
	
	/*
	 * post: devuelve la coordenada y del punto.
	 */
	public double obtenerY() {
		return y;
	}
	
	/*
	 * post: cambia la coordenada x del punto al nuevo valor.
	 */
	public void cambiarX(double nuevoX) {
		x = nuevoX;
	}
	
	/*
	 * post: cambia la coordenada y del punto al nuevo valor.
	 */
	public void cambiarY(double nuevoY) {
		y = nuevoY;
	}

	/*
	 * post: devuelve true si el punto está sobre el eje X.
	 */
	public boolean estaSobreEjeX() {
		return x == 0.0;
	}

	/*
	 * post: devuelve true si el punto está sobre el eje Y.
	 */
	public boolean estaSobreEjeY() {
		return y == 0.0;
	}

	/*
	 * post: devuelve true si el punto está en el origen de coordenadas.
	 */
	public boolean esElOrigen() {
		return estaSobreEjeX() && estaSobreEjeY();
	}
	
	public static void main(String[] args) {
		System.out.println("Creando punto en (3.0, 0.0)...");
	    Punto p = new Punto(3.0, 0.0);
	    System.out.println("x: " + p.obtenerX());
	    System.out.println("y: " + p.obtenerY());
	    System.out.println("¿Está sobre el eje X? " + p.estaSobreEjeX());
	    System.out.println("¿Está sobre el eje Y? " + p.estaSobreEjeY());
	    System.out.println("¿Es el origen? " + p.esElOrigen());
	    System.out.println("\nMoviendo punto a (0.0, 0.0)...");
	    p.cambiarX(0.0);
	    p.cambiarY(0.0);
	    System.out.println("x: " + p.obtenerX());
	    System.out.println("y: " + p.obtenerY());
	    System.out.println("¿Está sobre el eje X? " + p.estaSobreEjeX());
	    System.out.println("¿Está sobre el eje Y? " + p.estaSobreEjeY());
	    System.out.println("¿Es el origen? " + p.esElOrigen());
	    System.out.println("\nMoviendo punto a (0.0, 5.0)...");
	    p.cambiarY(5.0);
	    System.out.println("x: " + p.obtenerX());
	    System.out.println("y: " + p.obtenerY());
	    System.out.println("¿Está sobre el eje X? " + p.estaSobreEjeX());
	    System.out.println("¿Está sobre el eje Y? " + p.estaSobreEjeY());
	    System.out.println("¿Es el origen? " + p.esElOrigen());
	}
	
}