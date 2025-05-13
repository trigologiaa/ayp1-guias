package genc;

public class Ticket {
	
	private double importe;
	private int productos;
	private boolean descuento, cerrado;
	
	/**
     * post: el Ticket se inicializa con importe 0.
     */
    public Ticket() {
    	this.importe = 0.0;
    	this.productos = 0;
    	this.descuento = false;
    	this.cerrado = false;
    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de productos y su precio unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) {
    	if(cerrado) {
    		throw new Error("No se pueden agregar más ítems. El ticket está cerrado.");
    	}
    	if(cantidad <= 0) {
    		throw new Error("La cantidad no puede ser menor a 0. Es " + cantidad + ".");
    	}
    	if(precioUnitario <= 0) {
    		throw new Error("El precio unitario no puede ser menor a 0. Es " + precioUnitario + ".");
    	}
    	productos += cantidad;
    	importe += cantidad * precioUnitario;
    }

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) {
    	if(cerrado) {
    		throw new Error("No se puede aplicar descuentos. El ticket está cerrado.");
    	}
    	if(descuento) {
    		throw new Error("El descuento ya fue aplicado.");
    	}
    	if(porcentaje <= 0 || porcentaje >= 100) {
    		throw new Error("El porcentaje de descuento debe estar entre 0 y 100.");
    	}
    	importe -= (porcentaje * importe) / 100;
    	descuento = true;
    }

    /**
     * post: devuelve el importe acumulado hasta el momento, sin cerrar el Ticket.
     */
    public double calcularSubtotal() {
    	return importe;
    }
	
    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
    	cerrado = true;
    	return importe;
    }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
    	return productos;
    } 

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
	    System.out.println("Ticket creado.");
	    try {
	        System.out.println("\nAgregando 2 productos de $100 cada uno...");
	        ticket.agregarItem(2, 100);
	        System.out.println("Subtotal: $" + ticket.calcularSubtotal());
	        System.out.println("Productos: " + ticket.contarProductos());
	    } catch (Error e) {
	        System.out.println("Error al agregar ítems válidos: " + e.getMessage());
	    }
	    try {
	        System.out.println("\nIntentando agregar producto con cantidad 0...");
	        ticket.agregarItem(0, 50);
	    } catch (Error e) {
	        System.out.println("Error esperado: " + e.getMessage());
	    }
	    try {
	        System.out.println("\nIntentando agregar producto con precio 0...");
	        ticket.agregarItem(1, 0);
	    } catch (Error e) {
	        System.out.println("Error esperado: " + e.getMessage());
	    }
	    try {
	        System.out.println("\nAplicando descuento del 10%...");
	        ticket.aplicarDescuento(10);
	        System.out.println("Subtotal tras descuento: $" + ticket.calcularSubtotal());
	    } catch (Error e) {
	        System.out.println("Error al aplicar descuento válido: " + e.getMessage());
	    }
	    try {
	        System.out.println("\nIntentando aplicar descuento nuevamente...");
	        ticket.aplicarDescuento(5);
	    } catch (Error e) {
	        System.out.println("Error esperado: " + e.getMessage());
	    }
	    try {
	        System.out.println("\nIntentando aplicar descuento del 150% (ticket aún abierto)...");
	        Ticket t2 = new Ticket();
	        t2.agregarItem(1, 100);
	        t2.aplicarDescuento(150);
	    } catch (Error e) {
	        System.out.println("Error esperado: " + e.getMessage());
	    }
	    System.out.println("\nCalculando total y cerrando el ticket...");
	    double total = ticket.calcularTotal();
	    System.out.println("Total: $" + total);
	    try {
	        System.out.println("\nIntentando agregar ítem luego de cerrar el ticket...");
	        ticket.agregarItem(1, 50);
	    } catch (Error e) {
	        System.out.println("Error esperado: " + e.getMessage());
	    }
	    try {
	        System.out.println("\nIntentando aplicar descuento luego de cerrar el ticket...");
	        ticket.aplicarDescuento(10);
	    } catch (Error e) {
	        System.out.println("Error esperado: " + e.getMessage());
	    }
	    System.out.println("\nFin de prueba.");
	}

}