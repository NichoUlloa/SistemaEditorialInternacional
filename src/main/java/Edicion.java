import java.util.ArrayList;

public class Edicion {
	private ArrayList<Localizacion> localizaciones;
	private boolean TextoCensurado;
	private boolean TextoInterpretado;

	// constructor
	public Edicion() {
		this.localizaciones = new ArrayList<Localizacion>();
		this.TextoCensurado = false;
		this.TextoInterpretado = false;
	}

	// getters y setters
	public ArrayList<Localizacion> getLocalizaciones() {
		return localizaciones;
	}
	public void setLocalizaciones(ArrayList<Localizacion> localizaciones) {
		this.localizaciones = localizaciones;
	}

	public boolean getTextoCensurado() {
		return TextoCensurado;
	}
	public void setTextoCensurado(boolean TextoCensurado) {
		this.TextoCensurado = TextoCensurado;
	}

	public boolean getTextoInterpretado() {
		return TextoInterpretado;
	}
	public void setTextoInterpretado(boolean TextoInterpretado) {
		this.TextoInterpretado = TextoInterpretado;
	}

	// metodos

	@Override
	public String toString() {
		return "Localizaciones: " + localizaciones + "\n" +
				"Texto censurado: " + TextoCensurado + "\n" +
				"Texto interpretado: " + TextoInterpretado + "\n";
	}
}