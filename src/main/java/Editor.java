import java.util.ArrayList;

public class Editor extends Integrante {
	private ArrayList<Texto> textos;

	// constructor
	public Editor(String nombreIntegrante, String apellidoIntegrante, String rutIntegrante) {
		super(nombreIntegrante, apellidoIntegrante, rutIntegrante);
		this.textos = new ArrayList<Texto>();
	}

	// getters y setters
	public ArrayList<Texto> getTextos() {
		return textos;
	}
	public void setTextos(ArrayList<Texto> textos) {
		this.textos = textos;
	}

	// metodos
	// metodo getTipoIntegrante
	public String getTipoIntegrante() {
		return "Editor";
	}

	@Override
	public String toString() {
		return super.toString() +
				"Textos: " + textos + "\n" +
				"Tipo de integrante: " + getTipoIntegrante() + "\n";
	}
}
