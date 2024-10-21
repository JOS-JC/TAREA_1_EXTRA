import java.util.Date;
public class Asistencia {
    private Estudiante estudiante;
    private Date fecha;
    private String horaEntrada;
    private String horaSalida;
    private String estado; // Presente, Ausente, Retardo

    public Asistencia(Estudiante estudiante, Date fecha, String horaEntrada, String horaSalida, String estado) {
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "estudiante=" + estudiante.getNombreCompleto() +
                ", fecha=" + fecha +
                ", horaEntrada='" + horaEntrada + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public String getEstado() {
        return estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
