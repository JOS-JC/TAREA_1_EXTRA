import java.util.ArrayList;
public class Estudiante {
    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String apellido, String numeroIdentificacion, String carrera, int semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}

