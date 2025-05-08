package genc;

public class Cubo {

    private double lado;
/**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) { 
        lado = longitudLado;
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() { 
        return lado;
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
        lado = longitudLado;
     }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() { 
        return lado * lado;
        
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
        lado = Math.sqrt(areaCara);
     }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
        return lado * lado * lado;
     }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
        lado = Math.cbrt(volumen);
     }

}
