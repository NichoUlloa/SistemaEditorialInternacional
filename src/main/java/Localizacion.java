public class Localizacion {
	private boolean isTextoCensurado;
	private boolean isTextoInterpretado;
	public Edicion edicion;
	public Libro libro;
	public Pais pais;

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

	public Edicion getEdicion() {
		return this.edicion;
	}
	public void setEdicion(Edicion edicion) {
		this.edicion = edicion;
	}

	public Libro getLibro() {
		return this.libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Localizacion(boolean isTextoCensurado, boolean isTextoInterpretado, Edicion edicion, Libro libro, Pais pais) {
		this.isTextoCensurado = isTextoCensurado;
		this.isTextoInterpretado = isTextoInterpretado;
		this.edicion = edicion;
		this.libro = libro;
		this.pais = pais;
	}
}