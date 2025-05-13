package genc;

public class ExpendedorDePasajes {

	private int pasajes;
	private double precioPorKm, distanciaMax, kmTotales;
	
	/*
     * pre: precioPorKM debe ser mayor a 0.
     * pos: establece un precio por KM en el pasaje.
     */
	public ExpendedorDePasajes(double precioPorKm) {
		if(precioPorKm <= 0) {
			throw new Error("El precio por km debe ser mayor a 0. Es " + precioPorKm + ".");
		}
		this.precioPorKm = precioPorKm;
	}

    public double venderPasaje(double distanciaEnKm) {
    	if(distanciaEnKm <= 0) {
    		throw new Error("La distancia debe ser mayor a 0. Es " + distanciaEnKm + ".");
    	}
    	if(distanciaEnKm > distanciaMax) {
    		distanciaMax = distanciaEnKm;
    	}
    	pasajes++;
		kmTotales += distanciaEnKm;
		return precioPorKm * distanciaEnKm;
    }

    /*
     * pre: distanciaEnKM debe ser mayor a 0.
     * pos: devuelve precio del pasaje segun cantidad de KM.
     */
    public double venderPasajes(int cantidad, double distanciaEnKm) {
    	if(cantidad <= 0) {
    		throw new Error("La cantidad debe ser mayor a 0. Es " + cantidad + ".");
    	}
    	double total = 0.0;
    	for(int i = 0; i < cantidad; i++) {
    		total += venderPasaje(distanciaEnKm);
    	}
    	return total;
    }

    /*
     * pos: devuelve cuantos pasajes se vendieron.
     */
    public int contarPasajesVendidos() {
    	return pasajes;
    }

    /*
     * pos: devuelve la distancia maxima vendida.
     */
    public double obtenerDistanciaMaxima() {
    	return distanciaMax;
    }

    /*
     * pos: devuelve un promedio entre todas las distancias vendidas entre los pasajes.
     */
    public double calcularDistanciaPromedio() {
    	if(pasajes == 0) {
    		return 0;
    	}
    	return kmTotales / pasajes;
    }

    /*
     * pos: devuelve cantidad de pasajes vendidos.
     */
    public double calcularVentaTotal() {
    	return kmTotales * precioPorKm;
    }

    public static void main(String[] args) {
        try {
            ExpendedorDePasajes exp = new ExpendedorDePasajes(5.0);
            try {
                System.out.println("Venta 1 pasaje, 10 km: $" + exp.venderPasaje(10));
            } catch (Error e) {
                System.out.println("Error al vender pasaje individual: " + e.getMessage());
            }
            try {
                System.out.println("Venta 3 pasajes, 15 km: $" + exp.venderPasajes(3, 15));
            } catch (Error e) {
                System.out.println("Error al vender pasajes múltiples: " + e.getMessage());
            }
            try {
                System.out.println("Intento de vender pasaje con distancia inválida:");
                exp.venderPasaje(-5);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            try {
                System.out.println("Intento de vender pasajes con cantidad inválida:");
                exp.venderPasajes(0, 10);
            } catch (Error e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Total pasajes vendidos: " + exp.contarPasajesVendidos());
            System.out.println("Distancia máxima vendida: " + exp.obtenerDistanciaMaxima() + " km");
            System.out.println("Distancia promedio: " + exp.calcularDistanciaPromedio() + " km");
            System.out.println("Venta total: $" + exp.calcularVentaTotal());
        } catch (Error e) {
            System.out.println("Error al crear el expendedor: " + e.getMessage());
        }
    }

}