package gmem;
class Persona {
    private String nombre;
    private String apellido;
    private Telefono telefono;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void cambiarTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}