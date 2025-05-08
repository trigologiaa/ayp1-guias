package genc;

class Ticket {

    private double ticket;
    private boolean descuentoAplicado = false;

    /**
     * post: el Ticket se inicializa con importe 0.
     */
    public Ticket() {
        ticket = 0;
    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de
     * de productos y su precio unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) {
        if (cantidad < 0) {
            throw new Error("cantidad no puede ser menor a cero");
        }
        if (precioUnitario < 0) {
            throw new Error("precioUnitario no puede ser menor a cero");
        }

        ticket += cantidad * precioUnitario;

    }

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) {
        if (descuentoAplicado) {
            throw new Error("El descuento ya ha sido aplicado.");
        }
        ticket -= (porcentaje * ticket) / 100;
        descuentoAplicado = true;
    }

    /**
     * post: devuelve el importe acumulado hasta el momento,
     * sin cerrar el Ticket.
     */
    public double calcularSubtotal() {
        return 1.1;
    }

    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
        return 1.1;
    }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
        return 1;
    }

}
