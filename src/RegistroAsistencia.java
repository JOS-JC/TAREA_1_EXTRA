import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegistroAsistencia {
    private List<Asistencia> asistencias;

    public RegistroAsistencia() {
        asistencias = new ArrayList<>();
    }

    public void registrarAsistencia(Asistencia asistencia) {
        asistencias.add(asistencia);
    }

    public List<Asistencia> consultarHistorial(Estudiante estudiante) {
        List<Asistencia> historial = new ArrayList<>();
        for (Asistencia asistencia : asistencias) {
            if (asistencia.getEstudiante().getNumeroIdentificacion().equals(estudiante.getNumeroIdentificacion())) {
                historial.add(asistencia);
            }
        }
        return historial;
    }

    public int contarAusencias(Estudiante estudiante) {
        int ausencias = 0;
        for (Asistencia asistencia : asistencias) {
            if (asistencia.getEstudiante().getNumeroIdentificacion().equals(estudiante.getNumeroIdentificacion())
                    && asistencia.getEstado().equals("Ausente")) {
                ausencias++;
            }
        }
        return ausencias;
    }
}
