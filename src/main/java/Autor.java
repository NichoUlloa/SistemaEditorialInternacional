import java.util.ArrayList;

public abstract class Autor extends Integrante {
	private ArrayList<Texto> textosEscritos;
	private ArrayList<Editorial> editorialesPertenecientes;
	private String seudonimo;

	// constructor
	public Autor(String nombreIntegrante, String apellidoIntegrante, String rutIntegrante, Editorial editorialesPertenecientes, String seudonimo) {
		super(nombreIntegrante, apellidoIntegrante, rutIntegrante);
		this.textosEscritos = new ArrayList<Texto>();
		this.editorialesPertenecientes = new ArrayList<Editorial>();
		this.seudonimo = seudonimo;
	}

	// getters y setters
	public ArrayList<Texto> getTextosEscritos() {
		return textosEscritos;
	}
	public void setTextosEscritos(ArrayList<Texto> textosEscritos) {
		this.textosEscritos = textosEscritos;
	}

	public ArrayList<Editorial> getEditorialesPertenecientes() {
		return editorialesPertenecientes;
	}
	public void setEditorialesPertenecientes(ArrayList<Editorial> editorialesPertenecientes) {
		this.editorialesPertenecientes = editorialesPertenecientes;
	}

	public String getSeudonimo() {
		return seudonimo;
	}
	public void setSeudonimo(String seudonimo) {
		this.seudonimo = seudonimo;
	}

	// metodos
	// metodo abstracto getTipoAutor
	public abstract String getTipoAutor();

	// metodo getTipoIntegrante
	public String getTipoIntegrante() {
		return "Autor";
	}

	@Override
	public String toString() {
		return super.toString() +
				"Textos escritos: " + textosEscritos + "\n" +
				"Seudonimo: " + seudonimo + "\n";
	}
}