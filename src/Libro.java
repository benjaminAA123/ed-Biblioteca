import java.util.ArrayList;

public class Libro {

    public String titulo;
    public String isbn;
    public String autor;
    public String genero;
    public String fechaPublicacion;
    private ArrayList<Autor>autors;
    private ArrayList<GeneroLibro>generoLibros;
    private Prestamos prestamos;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public ArrayList<Autor> getAutors() {
        return autors;
    }

    public void setAutors(ArrayList<Autor> autors) {
        this.autors = autors;
    }

    public ArrayList<GeneroLibro> getGeneroLibros() {
        return generoLibros;
    }

    public void setGeneroLibros(ArrayList<GeneroLibro> generoLibros) {
        this.generoLibros = generoLibros;
    }

    public Prestamos getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamos prestamos) {
        this.prestamos = prestamos;
    }
}
