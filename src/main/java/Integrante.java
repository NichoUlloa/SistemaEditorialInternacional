public abstract class Integrante {
    // atributos
    private String nombreIntegrante;
    private String apellidoIntegrante;
    private String rutIntegrante;

    // constructor
    public Integrante(String nombreIntegrante, String apellidoIntegrante, String rutIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
        this.apellidoIntegrante = apellidoIntegrante;
        this.rutIntegrante = rutIntegrante;
    }

    // getters y setters
    public String getNombreIntegrante() {
        return nombreIntegrante;
    }
    public void setNombreIntegrante(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    public String getApellidoIntegrante() {
        return apellidoIntegrante;
    }
    public void setApellidoIntegrante(String apellidoIntegrante) {
        this.apellidoIntegrante = apellidoIntegrante;
    }

    public String getRutIntegrante() {
        return rutIntegrante;
    }
    public void setRutIntegrante(String rutIntegrante) {
        this.rutIntegrante = rutIntegrante;
    }

    // metodos

    // metodo abstracto getTipoIntegrante
    public abstract String getTipoIntegrante();

    @Override
    public String toString() {
        return "Nombre: " + nombreIntegrante + "\n" +
                "Apellido: " + apellidoIntegrante + "\n" +
                "RUT: " + rutIntegrante + "\n";
    }
}