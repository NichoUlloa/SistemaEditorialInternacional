public class Agencia {
    // atributos
    private String nombreAgencia;
    private Tienda tiendas;

    // constructor
    public Agencia(String nombreAgencia, Tienda tiendas) {
        this.nombreAgencia = nombreAgencia;
        this.tiendas = tiendas;
    }

    // getters y setters
    public String getNombreAgencia() {
        return nombreAgencia;
    }
    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public Tienda getTiendas() {
        return tiendas;
    }
    public void setTiendas(Tienda tiendas) {
        this.tiendas = tiendas;
    }

    // metodos
    // metodo agregarTienda
    public void agregarTienda(Tienda tienda) {
        tiendas.add(tienda);
    }

    public void aceptarOferta(Edicion edicion) {

    }
}
