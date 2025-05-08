package genc;

class ExpendedorDePasajes {
    private int pasajes;
    private double precioEnKM;
    private double distanciaMax = 0;
    private double kilometrosTotales;

    /*
     * pre: precioPorKM debe ser mayor a 0
     * pos: establece un precio por KM en el pasaje
     */
    public ExpendedorDePasajes(double precioPorKm) {
        precioEnKM = precioPorKm;
    }

    /*
     * pre: distanciaEnKM debe ser mayor a 0
     * pos: devuelve precio del pasaje segun cantidad de KM
     */
    public double venderPasaje(double distanciaEnKm) {
        if (distanciaEnKm > distanciaMax) {
            distanciaMax = distanciaEnKm;
        }
        if (distanciaEnKm < 0) {
            throw new Error("La distancia debe ser mayor a 0.");
        } else {
            pasajes++;
            kilometrosTotales += distanciaEnKm;
            return precioEnKM * distanciaEnKm;
        }
    }

    /*
     * pre: cantidad y distancia deben ser mayor a 0
     * pos: devuelve cantidad de pasajes segun cantidad de KM
     */
    public double venderPasajes(int cantidad, double distanciaEnKm) {
        if (distanciaEnKm < 0) {
            throw new Error("La distancia debe ser mayor a 0.");
        } else {
            pasajes += cantidad;
            kilometrosTotales += (distanciaEnKm * cantidad);
            return cantidad * (precioEnKM * distanciaEnKm);
        }
    }

    /*
     * pos: devuelve cuantos pasajes se vendieron
     */
    public int contarPasajesVendidos() {
        return pasajes;
    }

    /*
     * pos: devuelve la distancia maxima vendida
     */
    public double obtenerDistanciaMaxima() {
        return distanciaMax;
    }

    /*
     * pos: devuelve un promedio entre todas las distancias
     * vendidas entre los pasajes
     */
    public double calcularDistanciaPromedio() {
        return kilometrosTotales / pasajes;
    }

    /*
     * pos: devuelve cantidad de pasajes vendidos
     */
    public double calcularVentaTotal() {
        return pasajes;
    }
}
