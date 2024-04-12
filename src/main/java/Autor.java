import java.util.ArrayList;

public abstract class Autor extends Integrante {
	private ArrayList<Texto> textosEscritos;

	// constructor
	public Autor(String nombreIntegrante, String apellidoIntegrante, String rutIntegrante) {
		super(nombreIntegrante, apellidoIntegrante, rutIntegrante);
		this.textosEscritos = new ArrayList<Texto>();
	}

	// getters y setters
	public ArrayList<Texto> getTextosEscritos() {
		return textosEscritos;
	}
	public void setTextosEscritos(ArrayList<Texto> textosEscritos) {
		this.textosEscritos = textosEscritos;
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
				"Tipo de integrante: " + getTipoIntegrante() + "\n";
	}
}