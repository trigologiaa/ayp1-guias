package genc;

public class Punto {
    double valorX = 0.0;
    double valorY = 0.0;

    public Punto(double x, double y) {
        valorX = x;
        valorY = y;
    }

    public double obtenerX() {
        return valorX;
    }

    public double obtenerY() {
        return valorY;
    }

    public void cambiarX(double nuevoX) {
        valorX = nuevoX;
    }

    public void cambiarY(double nuevoY) {
        valorY = nuevoY;
    }

    public boolean estaSobreEjeX() {
        return valorX == 0;
    }

    public boolean estaSobreEjeY() {
        return valorY == 0;
    }

    // public boolean esElOrigen()

}
