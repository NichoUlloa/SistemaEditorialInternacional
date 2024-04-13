import java.util.ArrayList;

public class Tienda {
    // atributos
    private String nombre;
    private ArrayList<Texto> stockTextos;
    private ArrayList<Texto> textosDeseados;

    // constructor
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.stockTextos = new ArrayList<Texto>();
        this.textosDeseados = new ArrayList<Texto>();
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Texto> getStockTextos() {
        return stockTextos;
    }
    public void setStockTextos(ArrayList<Texto> stockTextos) {
        this.stockTextos = stockTextos;
    }

    public ArrayList<Texto> getTextosDeseados() {
        return textosDeseados;
    }
    public void setTextosDeseados(ArrayList<Texto> textosDeseados) {
        this.textosDeseados = textosDeseados;
    }

    // metodos
    // metodo agregarTextoStock
    public void agregarTextoStock(Texto texto) {
        stockTextos.add(texto);
    }

    public void add(Tienda tienda) {
    }
}
