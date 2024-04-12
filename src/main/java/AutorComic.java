public class AutorComic extends Autor {

    // constructor
    public AutorComic(String nombreIntegrante, String apellidoIntegrante, String rutIntegrante, Editorial editorialPerteneciente, String seudonimo) {
        super(nombreIntegrante, apellidoIntegrante, rutIntegrante, editorialPerteneciente, seudonimo);
    }

    // metodos
    // metodo getTipoAutor
    public String getTipoAutor() {
        return "Comic";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de autor: " + getTipoAutor() + "\n";
    }
}