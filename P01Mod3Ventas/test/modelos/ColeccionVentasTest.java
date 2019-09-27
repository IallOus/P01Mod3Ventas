
package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColeccionVentasTest {
    
    public ColeccionVentasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> expResult = new ArrayList<Venta>();
        ArrayList<Venta> result = instance.Listar();
        assertEquals(expResult, result);
    }

    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta("001", 1000, 1);
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = true;
        boolean result = instance.Agregar(venta);
        assertEquals(expResult, result);
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = new Venta("001", 1000, 1);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean expResult = true;
        boolean result = instance.Modificar(venta);
        assertEquals(expResult, result);
    }

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Venta venta = new Venta("001", 1000, 1);
        String codigo = "001";
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean expResult = true;
        boolean result = instance.Eliminar(codigo);
        assertEquals(expResult, result);
    }

    @Test
    public void testSubTotal() {
        System.out.println("SubTotal");
        Venta venta = new Venta("001", 1000, 1);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean expResult = true;
        boolean result = instance.SubTotal();
        assertEquals(expResult, result);
    }
    
}
