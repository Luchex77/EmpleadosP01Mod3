
package cl.duoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class TestBuscar {
    
    
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "11111111";
        BussEmpleado instance = new BussEmpleado();
        Empleado expResult=null;
        
        Empleado result = instance.Buscar(rut);
        assertEquals(result.getRut(), rut);
        
        
    }
}
