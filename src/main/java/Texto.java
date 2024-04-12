import java.util.ArrayList;

public abstract class Texto {
	// atributos
	private Localizacion localizacion;
	private ArrayList<Edicion> ediciones;
	private Editorial editorial;
	private Autor autor;
	private String titulo;

	// constructor
	public Texto(Localizacion localizacion, Autor autor, String titulo, Editorial editorial) {
		this.localizacion = localizacion;
		this.autor = autor;
		this.titulo = titulo;
		this.ediciones = new ArrayList<Edicion>();
		this.editorial = editorial;
	}

	// getters y setters
	public Localizacion getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

	public ArrayList<Edicion> getEdiciones() {
		return ediciones;
	}
	public void setEdiciones(ArrayList<Edicion> ediciones) {
		this.ediciones = ediciones;
	}

	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	// metodos
	// metodo abstracto getTipoTexto
	public abstract String getTipoTexto();

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" +
				"Autor: " + autor + "\n" +
				"Ediciones: " + ediciones + "\n" +
				"Editorial: " + editorial + "\n" +
				"Localizacion: " + localizacion + "\n";
	}
}