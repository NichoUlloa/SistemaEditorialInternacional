import java.util.ArrayList;

public class SistemaEditorialInternacional {
    // atributos
    private ArrayList<Autor> autores;
    private ArrayList<Texto> textosEnEsperaAprobacion;
    private ArrayList<Texto> textos;

    // constructor
    public SistemaEditorialInternacional() {
        this.autores = new ArrayList<Autor>();
        this.textosEnEsperaAprobacion = new ArrayList<Texto>();
        this.textos = new ArrayList<Texto>();
    }

    // getters y setters
    public ArrayList<Autor> getAutores() {
        return autores;
    }
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Texto> getTextosEnEsperaAprobacion() {
        return textosEnEsperaAprobacion;
    }
    public void setTextosEnEsperaAprobacion(ArrayList<Texto> textosEnEsperaAprobacion) {
        this.textosEnEsperaAprobacion = textosEnEsperaAprobacion;
    }

    public ArrayList<Texto> getTextos() {
        return textos;
    }
    public void setTextos(ArrayList<Texto> textos) {
        this.textos = textos;
    }

    // metodos

    // Crear un nuevo texto con autor, localizacion, impresión, ediciones y editor que lo aprobó
    // metodo editor aprobar texto
    public void editorAprobarTexto(Texto texto, Editor editorAprobador) {
        texto.setEditorAprobador(editorAprobador);
    }
    // metodo crearTexto ya aprobado
    public void crearTextoAprobado(Texto texto, Editor editorAprobador) {
        editorAprobarTexto(texto, editorAprobador);
        textos.add(texto);
    }

    // • Agregar ediciones a un texto.
    // metodo agregarEdicionTexto
    public void agregarEdicionTexto(Texto texto, Edicion edicion) {
        texto.getEdiciones().add(edicion);
    }

    // • Buscar autores e información de las editoriales de las que son integrantes
    // metodo buscarAutor, recibe el rut del autor y retorna la información del autor como por ejemplo las editoriales a las que pertenece y demas
    public String buscarAutor(String rutAutor) {
        for (Autor autor : autores) {
            if (autor.getRutIntegrante().equals(rutAutor)) {
                return autor.toString();
            }
        }
        return "Autor no encontrado";
    }

    // Buscar las diferentes ediciones de un texto
    // metodo buscarEdicionesTexto, recibe el titulo del texto y retorna las ediciones del texto si no se encuentra retorna mensaje de no se encontro
    public String buscarEdicionesTexto(String tituloTexto) {
        for (Texto texto : textos) {
            if (texto.getTitulo().equals(tituloTexto)) {
                return texto.getEdiciones().toString();
            }
        }
        return "No se encontraron ediciones";
    }

    // • Obtener lista de localizaciones de una edición
    // metodo obtenerLocalizacionesEdicion, recibe una edicion y retorna las localizaciones de la edicion, sino se encuentran localizaciones retorna mensaje de no se encontraron localizaciones
    public String obtenerLocalizacionesEdicion(Edicion edicion) {
        if (edicion.getLocalizaciones().size() > 0) {
            return edicion.getLocalizaciones().toString();
        }
        return "No se encontraron localizaciones";
    }

    // Solicitar aprobación de un texto en lista de espera
    // metodo solicitarAprobacionTexto, recibe un texto y lo agrega a la lista de textos en espera de aprobacion
    public void solicitarAprobacionTexto(Texto texto) {
        textosEnEsperaAprobacion.add(texto);
    }

    // • Acceder a los seudónimos del autor al buscar un autor.
// metodo obtenerSeudonimoAutor, recibe el rut del autor y retorna una lista de seudonimo del autor yaque puede tener seudonimo por cada tipo de texto, si no se encuentra retorna mensaje de no se encontro
    // metodo obtenerSeudonimoAutor
    public String obtenerSeudonimoAutor(String rutAutor) {
        for (Autor autor : autores) {
            if (autor.getRutIntegrante().equals(rutAutor)) {
                return autor.getSeudonimo().toString();
            }
        }
        return "No se encontraron seudonimos";
    }

    // • Reabastecer a las tiendas.
    // metodo reabastecerTiendas, recibe una lista de tiendas y una lista de textos y reabastece las tiendas con los textos, con metodo agregarTextoStock
    public void reabastecerTiendas(ArrayList<Tienda> tiendas, ArrayList<Texto> textos) {
        for (Tienda tienda : tiendas) {
            for (Texto texto : textos) {
                tienda.agregarTextoStock(texto);
            }
        }
    }

    // • Aceptar ofertas de agencias.
    // metodo aceptarOfertasAgencias
    public void aceptarOfertasAgencias(ArrayList<Agencia> agencias, ArrayList<Edicion> ediciones) {
        for (Agencia agencia : agencias) {
            for (Edicion edicion : ediciones) {
                agencia.aceptarOferta(edicion);
            }
        }
    }

    // Ver el número de impresiones y ventas realizadas por texto
    // metodo verNumeroImpresionesVentasTexto, recibe un texto y retorna el numero de impresiones y ventas realizadas por el texto
    public String verNumeroImpresionesVentasTexto(Texto texto) {
        return "Numero de impresiones: " + texto.getNumeroImpresiones() + "\n" +
                "Numero de ventas: " + texto.getNumeroVentas();
    }
}