

package cl.duoc;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestMontoBono {
    @Test
    public void testMontoBono() {
        System.out.println("Monto Bono");
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.montoBono());
        
    }
}