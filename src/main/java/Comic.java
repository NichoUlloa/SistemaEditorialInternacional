public class Comic extends Texto {
    // atributos
    private int numeroVinetas;

    // constructor
    public Comic(Localizacion localizacion, Autor autor, String titulo, Editorial editorial, int numeroVinetas) {
        super(localizacion, autor, titulo, editorial);
        this.numeroVinetas = numeroVinetas;
    }

    // getters y setters
    public int getNumeroVinetas() {
        return numeroVinetas;
    }
    public void setNumeroVinetas(int numeroVinetas) {
        this.numeroVinetas = numeroVinetas;
    }

    // metodos
    // metodo getTipoTexto
    public String getTipoTexto() {
        return "Comic";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Numero de vinetas: " + numeroVinetas + "\n" +
                "Tipo de texto: " + getTipoTexto() + "\n";
    }
}