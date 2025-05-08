package gmem;
class Telefono {
    private String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void cambiarNumero(String nuevoNumero) {
        this.numero = nuevoNumero;
    }
}
