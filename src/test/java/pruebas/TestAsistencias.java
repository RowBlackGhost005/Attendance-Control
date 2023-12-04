package pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import clases.Alumno;
import clases.Asistencia;
import java.time.LocalTime;

public class TestAsistencias {
    @Test
    public void testAsistencia() {
        // Datos de prueba
        Alumno alumno = new Alumno("Juan");
        boolean presente = true;
        LocalTime horaLlegada = LocalTime.of(9, 30);

        
        Asistencia asistencia = new Asistencia(alumno, presente, horaLlegada);

        // Verificar que los valores se han establecido correctamente
        assertEquals(alumno, asistencia.getNombreAlumno());
        assertTrue(asistencia.getPresente());
        assertEquals(horaLlegada, asistencia.getHoraLlegada());
    }

}