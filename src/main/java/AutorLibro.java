public class AutorLibro extends Autor {
    // atributos
    private String seudonimo;

    // constructor
    public AutorLibro(String nombreIntegrante, String apellidoIntegrante, String rutIntegrante, String seudonimo) {
        super(nombreIntegrante, apellidoIntegrante, rutIntegrante);
        this.seudonimo = seudonimo;
    }


    // metodos
    // metodo getTipoAutor
    public String getTipoAutor() {
        return "Libro";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Seudonimo: " + seudonimo + "\n" +
                "Tipo de autor: " + getTipoAutor() + "\n";
    }
}