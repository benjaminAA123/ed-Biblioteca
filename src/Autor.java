import java.util.ArrayList;

public class Autor {

    public String nif;
    public String Nombre;
    public String apellidos;
    public String fechaNacimiento;
    public String LocalidadNacimiento;

    private ArrayList<Libro>libros;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLocalidadNacimiento() {
        return LocalidadNacimiento;
    }

    public void setLocalidadNacimiento(String localidadNacimiento) {
        LocalidadNacimiento = localidadNacimiento;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
