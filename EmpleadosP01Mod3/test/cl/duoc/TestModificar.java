
package cl.duoc;


import static org.junit.Assert.*;
import org.junit.Test;


public class TestModificar {
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        String rut="132222567";
       
        BussEmpleado instance = new BussEmpleado();
         Empleado obj = new Empleado(rut, "Luchex", 33, 7);
        assertTrue(instance.Modificar(obj));
        
    }
}
    

