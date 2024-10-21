import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "12345", "Ingeniería", 2);
        Estudiante estudiante2 = new Estudiante("Ana", "García", "67890", "Matemáticas", 3);
        Estudiante estudiante3 = new Estudiante("Luis", "Martínez", "54321", "Biología", 1);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        // Crear registro de asistencia
        RegistroAsistencia registro = new RegistroAsistencia();

        // Registrar asistencias
        registro.registrarAsistencia(new Asistencia(estudiante1, new Date(), "08:00", "10:00", "Presente"));
        registro.registrarAsistencia(new Asistencia(estudiante1, new Date(), "08:00", "10:00", "Ausente"));
        registro.registrarAsistencia(new Asistencia(estudiante2, new Date(), "08:00", "10:00", "Retardo"));
        registro.registrarAsistencia(new Asistencia(estudiante3, new Date(), "08:00", "10:00", "Presente"));

        // Generar reportes
        Reporte reporte = new Reporte(registro);
        reporte.generarPorcentajeAsistencia(estudiante1);
        reporte.generarPorcentajeAsistencia(estudiante2);
        reporte.generarPorcentajeAsistencia(estudiante3);

        // Mostrar estudiantes con más ausencias
        reporte.estudiantesConMasAusencias(estudiantes);
    }
}