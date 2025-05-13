package genc;

public class Circulo {
	
	private double radio;
	
	/*
	 * pre: el radio debe ser mayor a 0.
	 * post: inicializa el círculo con el radio indicado.
	 */
	public Circulo(double radio) {
		cambiarRadio(radio);
	}

	/*
	 * pre: el nuevoRadio debe ser mayor a 0.
	 * post: cambia el radio del círculo al valor indicado.
	 */
	public void cambiarRadio(double nuevoRadio) {
		validarPositividad(nuevoRadio);
		radio = nuevoRadio;
	}
	
	/*
	 * pre: el nuevoDiametro debe ser mayor a 0.
	 * post: cambia el radio del círculo según el diámetro indicado.
	 */
	public void cambiarDiametro(double nuevoDiametro) {
		validarPositividad(nuevoDiametro);
		cambiarRadio(nuevoDiametro / 2);
	}
	
	/**
	 * pre : el nuevoPerimetro debe ser mayor a 0.
	 * post: cambia el radio del círculo según el perímetro indicado.
	 */
	public void cambiarPerimetro(double nuevoPerimetro) {
		validarPositividad(nuevoPerimetro);
		cambiarDiametro(nuevoPerimetro / Math.PI);
	}
	
	/**
	 * pre : el nuevoArea debe ser mayor a 0.
	 * post: cambia el radio del círculo según el área indicada.
	 */
	public void cambiarArea(double nuevoArea) {
		validarPositividad(nuevoArea);
		cambiarRadio(Math.sqrt(nuevoArea / Math.PI));
	}
	
	/*
	 * post: lanza un error si el valor no es estrictamente positivo.
	 */
	public void validarPositividad(double valor) {
		if(valor <= 0) {
			throw new Error("El campo debe ser positivo. Es " + valor + ".");
		}
	}
	
	/**
	 * post: devuelve el radio del círculo.
	 */
	public double obtenerRadio() {
		return radio;
	}
	
	/**
	 * post: devuelve el diámetro del círculo.
	 */
	public double obtenerDiametro() {
		return 2 * obtenerRadio();
	}
	
	/**
	 * post: devuelve el perímetro del círculo.
	 */
	public double obtenerPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	/**
	 * post: devuelve el área del círculo
	 */
	public double obtenerArea() {
		return Math.PI * Math.pow(obtenerRadio(), 2);
	}

	public static void main(String[] args) {
		System.out.println("Creando círculo con radio 5...");
        Circulo c = new Circulo(5);
        System.out.println("Radio: " + c.obtenerRadio());
        System.out.println("Diámetro: " + c.obtenerDiametro());
        System.out.println("Perímetro: " + c.obtenerPerimetro());
        System.out.println("Área: " + c.obtenerArea());
        System.out.println("\nCambiando diámetro a 20...");
        c.cambiarDiametro(20);
        System.out.println("Nuevo radio: " + c.obtenerRadio());
        System.out.println("\nCambiando perímetro a 31.4...");
        c.cambiarPerimetro(31.4);
        System.out.println("Nuevo radio: " + c.obtenerRadio());
        System.out.println("\nCambiando área a 78.5...");
        c.cambiarArea(78.5);
        System.out.println("Nuevo radio: " + c.obtenerRadio());
        System.out.println("\nIntentando cambiar radio a -2...");
        try {
            c.cambiarRadio(-2);
        } catch (Error e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        System.out.println("\nIntentando cambiar diámetro a 0...");
        try {
            c.cambiarDiametro(0);
        } catch (Error e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        System.out.println("\nIntentando cambiar área a -50...");
        try {
            c.cambiarArea(-50);
        } catch (Error e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        System.out.println("\nFin de la prueba.");
	}

}
