public class AutorPoema extends Autor {

    // constructor
    public AutorPoema(String nombreIntegrante, String apellidoIntegrante, String rutIntegrante, Editorial editorialPerteneciente, String seudonimo) {
        super(nombreIntegrante, apellidoIntegrante, rutIntegrante, editorialPerteneciente, seudonimo);
    }

    // metodos
    // metodo getTipoAutor
    public String getTipoAutor() {
        return "Poema";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de autor: " + getTipoAutor() + "\n";
    }
}