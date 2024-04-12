public class Localizacion {
	// atributos
	private Ciudad ciudadOrigen;
	private Pais pais;

	// constructor
	public Localizacion(Ciudad ciudadOrigen, Pais pais) {
		this.ciudadOrigen = ciudadOrigen;
		this.pais = pais;
	}

	// getters y setters

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
				"Pais: " + pais + "\n";
	}
}