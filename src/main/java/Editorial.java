import java.util.ArrayList;

public class Editorial {
	private Texto textosEsperaAprobacion;
	private ArrayList<Integrante> integrantes = new ArrayList<Integrante>();
	public ArrayList<AgenciaLibreria> agenciasLibrerias = new ArrayList<AgenciaLibreria>();

	public Texto getTextosEsperaAprobacion() {
		return this.textosEsperaAprobacion;
	}

	public void setTextosEsperaAprobacion(Texto textosEsperaAprobacion) {
		this.textosEsperaAprobacion = textosEsperaAprobacion;
	}
}