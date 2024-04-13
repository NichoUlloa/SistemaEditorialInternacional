import java.util.ArrayList;

public class Pais {
    // atributos
    private String nombrePais;
    private ArrayList<Ciudad> ciudades;

    // constructor
    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
        this.ciudades = new ArrayList<Ciudad>();
    }

    // getters y setters
    public String getNombrePais() {
        return nombrePais;
    }
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    // metodos
    @Override
    public String toString() {
        return "Pais: " + nombrePais + "\n" +
                "Ciudades: " + ciudades + "\n";
    }
}