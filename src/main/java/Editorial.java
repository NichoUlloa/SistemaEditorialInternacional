import java.util.ArrayList;

public class Editorial {
	private Texto textosEsperaAprobacion;
	private ArrayList<Integrante> integrantes;

	// constructor
	public Editorial(Texto textosEsperaAprobacion) {
		this.textosEsperaAprobacion = textosEsperaAprobacion;
		this.integrantes = new ArrayList<Integrante>();
	}

	public Texto getTextosEsperaAprobacion() {
		return this.textosEsperaAprobacion;
	}
	public void setTextosEsperaAprobacion(Texto textosEsperaAprobacion) {
		this.textosEsperaAprobacion = textosEsperaAprobacion;
	}

	public ArrayList<Integrante> getIntegrantes() {
		return this.integrantes;
	}
	public void setIntegrantes(ArrayList<Integrante> integrantes) {
		this.integrantes = integrantes;
	}

	@Override
	public String toString() {
		return "Textos en espera de aprobacion: " + textosEsperaAprobacion + "\n" +
				"Integrantes: " + integrantes + "\n";
	}
}