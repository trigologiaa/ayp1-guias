package genc;

public class Corona {
	
	private Circulo interior, exterior;
	
	/*
     * pre: los radios interior y exterior deben ser mayores a 0.
     * post: inicializa la corona con los radios interior y exterior indicados.
     */
	public Corona(double interior, double exterior) {
		if(interior <= 0) {
			throw new Error("El radio interior debe ser mayor a 0. Es " + interior + ".");
		}
		if(exterior <= 0) {
			throw new Error("El radio exterior debe ser mayor a 0. Es " + exterior + ".");
		}
		if(interior >= exterior) {
			throw new Error("El radio exterior (" + exterior + ") debe ser mayor que el radio interior (" + interior + ").");
		}
		this.interior = new Circulo(interior);
		this.exterior = new Circulo(exterior);
	}
	
	/*
     * post: devuelve el radio interior de la corona.
     */
	public double obtenerRadioInterior() {
		return interior.obtenerRadio();
	}
	
	/*
     * post: devuelve el radio exterior de la corona.
     */
    public double obtenerRadioExterior() {
        return exterior.obtenerRadio();
    }
    
    /*
     * post: cambia el radio interior de la corona.
     */
    public void cambiarRadioInterior(double nuevoRadioInterior) {
        if (nuevoRadioInterior <= 0) {
            throw new Error("El radio interior debe ser mayor a 0.");
        }
        if (nuevoRadioInterior >= exterior.obtenerRadio()) {
            throw new Error("El radio interior debe ser menor que el radio exterior.");
        }
        interior.cambiarRadio(nuevoRadioInterior);
    }

    /*
     * post: cambia el radio exterior de la corona.
     */
    public void cambiarRadioExterior(double nuevoRadioExterior) {
        if (nuevoRadioExterior <= 0) {
            throw new Error("El radio exterior debe ser mayor a 0.");
        }
        if (nuevoRadioExterior <= interior.obtenerRadio()) {
            throw new Error("El radio exterior debe ser mayor que el radio interior.");
        }
        exterior.cambiarRadio(nuevoRadioExterior);
    }

    /*
     * post: devuelve el perímetro interior de la corona (el perímetro del círculo interior).
     */
    public double obtenerPerimetroInterior() {
        return interior.obtenerPerimetro();
    }

    /*
     * post: devuelve el perímetro exterior de la corona (el perímetro del círculo exterior).
     */
    public double obtenerPerimetroExterior() {
        return exterior.obtenerPerimetro();
    }

    /*
     * post: devuelve el área de la corona circular (área exterior - área interior).
     */
    public double obtenerArea() {
        double areaExterior = exterior.obtenerArea();
        double areaInterior = interior.obtenerArea();
        return areaExterior - areaInterior;
    }

	public static void main(String[] args) {
		try {
            System.out.println("Caso 1: Crear una corona con radios válidos");
            Corona corona = new Corona(5.0, 10.0);
            System.out.println("Corona creada correctamente.");
            System.out.println("Radio interior: " + corona.obtenerRadioInterior());
            System.out.println("Radio exterior: " + corona.obtenerRadioExterior());
            System.out.println("Perímetro interior: " + corona.obtenerPerimetroInterior());
            System.out.println("Perímetro exterior: " + corona.obtenerPerimetroExterior());
            System.out.println("Área de la corona: " + corona.obtenerArea());
            System.out.println();
            System.out.println("Caso 2: Intentar crear una corona con el radio interior <= 0");
            try {
                Corona coronaError = new Corona(0.0, 10.0);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
            System.out.println("Caso 3: Intentar crear una corona con el radio exterior <= 0");
            try {
                Corona coronaError = new Corona(5.0, 0.0);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
            System.out.println("Caso 4: Intentar crear una corona con el radio interior >= radio exterior");
            try {
                Corona coronaError = new Corona(10.0, 5.0);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
            System.out.println("Caso 5: Intentar cambiar el radio interior a un valor <= 0");
            try {
                corona.cambiarRadioInterior(0.0);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
            System.out.println("Caso 6: Intentar cambiar el radio interior a un valor mayor o igual que el radio exterior");
            try {
                corona.cambiarRadioInterior(12.0);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
            System.out.println("Caso 7: Intentar cambiar el radio exterior a un valor <= 0");
            try {
                corona.cambiarRadioExterior(0.0);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
            System.out.println("Caso 8: Intentar cambiar el radio exterior a un valor menor o igual que el radio interior");
            try {
                corona.cambiarRadioExterior(4.0);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("Excepción inesperada: " + e.getMessage());
        }
	}

}