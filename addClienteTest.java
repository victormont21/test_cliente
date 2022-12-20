
package BD_Cliente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class addClienteTest {
    
    public addClienteTest() {
    }

    @Test
    public void testId_cliente_auto() {
        System.out.println("id_cliente_auto");
        addCliente instance = null;
        int expResult = 0;
        int result = instance.id_cliente_auto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        addCliente.main(args);
        fail("The test case is a prototype.");
    }
    
}
