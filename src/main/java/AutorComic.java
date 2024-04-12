public class AutorComic extends Autor {
    // atributos
    private String seudonimo;

    // constructor
    public AutorComic(String nombreIntegrante, String apellidoIntegrante, String rutIntegrante, String seudonimo) {
        super(nombreIntegrante, apellidoIntegrante, rutIntegrante);
        this.seudonimo = seudonimo;
    }

    // getters y setters
    public String getSeudonimo() {
        return seudonimo;
    }
    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    // metodos
    // metodo getTipoAutor
    public String getTipoAutor() {
        return "Comic";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Seudonimo: " + seudonimo + "\n" +
                "Tipo de autor: " + getTipoAutor() + "\n";
    }
}