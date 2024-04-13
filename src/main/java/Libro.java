import java.util.ArrayList;

public class Libro extends Texto {
    // atributos
    private String isbn;
    private int anioPublicacion;

    // constructor
    public Libro(Localizacion localizacion, Autor autor, String titulo, Editorial editorial, String isbn, int anioPublicacion) {
        super(localizacion, autor, titulo, editorial);
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    // getters y setters
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // metodos
    // metodo getTipoTexto
    public String getTipoTexto() {
        return "Libro";
    }

    @Override
    public String toString() {
        return super.toString() +
                "ISBN: " + isbn + "\n" +
                "Año de publicacion: " + anioPublicacion + "\n" +
                "Tipo de texto: " + getTipoTexto() + "\n";
    }

}