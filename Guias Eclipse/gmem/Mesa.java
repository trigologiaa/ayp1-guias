package gmem;
class Mesa {
    private Plato[] platos;

    public Mesa(int capacidad) {
        if (capacidad < 1) {
            throw new Error("La mesa debe tener al menos una capacidad de platos.");
        }
        platos = new Plato[capacidad];
    }

    public void agregarPlato(Plato plato, int posicion) {
        int indice = obtenerPosicion(posicion);
        platos[indice] = plato;
    }

    public double obtenerConsumicion() {
        double total = 0;
        for (Plato plato : platos) {
            if (plato != null) {
                total += plato.getPrecio();
            }
        }
        return total;
    }

    private int obtenerPosicion(int posicion) {
        if (posicion < 1 || posicion > platos.length) {
            throw new Error("Posición incorrecta en la mesa: " + posicion);
        }
        return posicion - 1;
    }
}