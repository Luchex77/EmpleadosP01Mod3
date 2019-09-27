
package cl.duoc;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCrear {
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado ejem=new Empleado("13777999", "Luchexiz", 42, 12);
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Crear(ejem));
    }
}
