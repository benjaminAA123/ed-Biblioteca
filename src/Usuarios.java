import java.util.ArrayList;

public class Usuarios {

    public String nombre;
    public String apellidos;
    public String dni;
    public String telefono;
    public String poblaacion;
    private ArrayList<Prestamos>prestamos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblaacion() {
        return poblaacion;
    }

    public void setPoblaacion(String poblaacion) {
        this.poblaacion = poblaacion;
    }

    public ArrayList<Prestamos> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamos> prestamos) {
        this.prestamos = prestamos;
    }
}
