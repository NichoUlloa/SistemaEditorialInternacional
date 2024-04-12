public class Ciudad {
    // atributos
    private String nombreCiudad;
    private Pais pais;

    // constructor
    public Ciudad(String nombreCiudad, Pais pais) {
        this.nombreCiudad = nombreCiudad;
        this.pais = pais;
    }

    // getters y setters
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    // metodos
    @Override
    public String toString() {
        return "Ciudad de origen: " + nombreCiudad + "\n" +
                "Pais: " + pais + "\n";
    }
}