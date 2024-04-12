public class Poemario extends Texto {
    // atributos
    private int numeroVersosPorPagina;
    private int numeroPaginas;

    // constructor
    public Poemario(Localizacion localizacion, Autor autor, String titulo, Editorial editorial, int numeroVersosPorPagina, int numeroPaginas) {
        super(localizacion, autor, titulo, editorial);
        this.numeroVersosPorPagina = numeroVersosPorPagina;
        this.numeroPaginas = numeroPaginas;
    }

    // getters y setters
    public int getNumeroVersosPorPagina() {
        return numeroVersosPorPagina;
    }
    public void setNumeroVersosPorPagina(int numeroVersosPorPagina) {
        this.numeroVersosPorPagina = numeroVersosPorPagina;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // metodos
    // metodo getTipoTexto
    public String getTipoTexto() {
        return "Poemario";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Numero de versos por pagina: " + numeroVersosPorPagina + "\n" +
                "Numero de paginas: " + numeroPaginas + "\n" +
                "Tipo de texto: " + getTipoTexto() + "\n";
    }
}