public class Localizacion {
	// atributos
	private boolean isTextoCensurado;
	private boolean isTextoInterpretado;
	private Ciudad ciudadOrigen;
	private Pais pais;

	// constructor
	public Localizacion(Ciudad ciudadOrigen, Pais pais) {
		this.ciudadOrigen = ciudadOrigen;
		this.pais = pais;
		this.isTextoCensurado = false;
		this.isTextoInterpretado = false;
	}

	// getters y setters
	public boolean getIsTextoCensurado() {
		return this.isTextoCensurado;
	}
	public void setIsTextoCensurado(boolean isTextoCensurado) {
		this.isTextoCensurado = isTextoCensurado;
	}

	public boolean getIsTextoInterpretado() {
		return this.isTextoInterpretado;
	}
	public void setIsTextoInterpretado(boolean isTextoInterpretado) {
		this.isTextoInterpretado = isTextoInterpretado;
	}

	public Ciudad getCiudadOrigen() {
		return this.ciudadOrigen;
	}
	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	// metodos
	@Override
	public String toString() {
		return "Ciudad de origen: " + ciudadOrigen + "\n" +
				"Pais: " + pais + "\n" +
				"Texto censurado: " + isTextoCensurado + "\n" +
				"Texto interpretado: " + isTextoInterpretado + "\n";
	}
}