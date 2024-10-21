import java.util.HashMap;
import java.util.List;
public class Reporte {
    private RegistroAsistencia registro;

    public Reporte(RegistroAsistencia registro) {
        this.registro = registro;
    }

    public void generarPorcentajeAsistencia(Estudiante estudiante) {
        List<Asistencia> historial = registro.consultarHistorial(estudiante);
        int totalClases = historial.size();
        int clasesPresentes = 0;

        for (Asistencia asistencia : historial) {
            if (asistencia.getEstado().equals("Presente")) {
                clasesPresentes++;
            }
        }

        double porcentaje = (totalClases > 0) ? (clasesPresentes * 100.0 / totalClases) : 0;
        System.out.printf("Porcentaje de asistencia de %s: %.2f%%\n", estudiante.getNombreCompleto(), porcentaje);
    }

    public void estudiantesConMasAusencias(List<Estudiante> estudiantes) {
        HashMap<Estudiante, Integer> ausencias = new HashMap<>();
        for (Estudiante estudiante : estudiantes) {
            int numAusencias = registro.contarAusencias(estudiante);
            ausencias.put(estudiante, numAusencias);
        }

        System.out.println("Estudiantes con más ausencias:");
        ausencias.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Ordenar de mayor a menor
                .forEach(entry -> {
                    System.out.printf("%s: %d ausencias\n", entry.getKey().getNombreCompleto(), entry.getValue());
                });
    }
}
