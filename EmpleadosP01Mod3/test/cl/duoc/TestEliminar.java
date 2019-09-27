package cl.duoc;

import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestEliminar {
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "99999999";
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Eliminar(rut));
       
    }

}
