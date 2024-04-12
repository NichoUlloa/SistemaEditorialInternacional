import java.util.ArrayList;

public abstract class Texto {
	// atributos
	private Localizacion localizacion;
	private ArrayList<Edicion> ediciones;
	private Autor autor;
	private String titulo;
	private String informacionImpresion;
	private Editor editorAprobador;

	// constructor
	public Texto(String titulo, Autor autor, Localizacion localizacion, String informacionImpresion, ArrayList<Edicion> ediciones) {
		this.localizacion = localizacion;
		this.autor = autor;
		this.titulo = titulo;
		this.ediciones = new ArrayList<Edicion>();
		this.informacionImpresion = informacionImpresion;
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

	public String getInformacionImpresion() {
		return informacionImpresion;
	}
	public void setInformacionImpresion(String informacionImpresion) {
		this.informacionImpresion = informacionImpresion;
	}

	public Editor getEditorAprobador() {
		return editorAprobador;
	}
	public void setEditorAprobador(Editor editorAprobador) {
		this.editorAprobador = editorAprobador;
	}

	// metodos
	// metodo abstracto getTipoTexto
	public abstract String getTipoTexto();

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" +
				"Autor: " + autor + "\n" +
				"Ediciones: " + ediciones + "\n" +
				"Editor aprobador: " + editorAprobador + "\n" +
				"Informacion de impresion: " + informacionImpresion + "\n" +
				"Localizacion: " + localizacion + "\n";
	}

}