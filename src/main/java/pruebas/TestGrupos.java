package pruebas;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import clases.Alumno;
import clases.Grupo;
import java.util.ArrayList;
import java.util.Date;


public class TestGrupos {
    
    @Test 
    public void TestGrupo(){

        // crear los datos de prueba
        Alumno alumno1 = new Alumno("Carlos");
        Alumno alumno2 = new Alumno("Felipe");
        Alumno alumno3 = new Alumno("Pepe");
        

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        Date dia1 = new Date(2023/11/20);
        Date dia2 = new Date(2023/11/21);
        Date dia3 = new Date(2023/11/22);

        ArrayList<Date> dias = new ArrayList<>();

        dias.add(dia1);
        dias.add(dia2);
        dias.add(dia3);

        Grupo grupo1 = new Grupo("2-A", alumnos, dias);
        
        assertEquals(3, grupo1.getAlumnos().size());
        assertEquals(3, grupo1.getDias().size());
        assertEquals("2-A", grupo1.getNombre());
        

    }


}
