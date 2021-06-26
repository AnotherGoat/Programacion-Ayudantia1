import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora a, c;

    @Before // Antes de hacer todos los test
    public void setUp() throws Exception {
        a = new Calculadora(6, 2);
        c = new Calculadora(5, 1);
    }

    @After // Después de hacer todos los test
    public void tearDown() throws Exception {
        a = null; // Liberar memoria
        c = null;
    }

    @Test
    public void sumar() {
        assertEquals(8, a.sumar());
        assertEquals(6, c.sumar());
    }

    @Test
    public void restar() {
        assertEquals(4, a.restar());
        assertEquals(4, c.restar());
    }

    @Test
    public void multiplicar() {
        assertEquals(12, a.multiplicar());
        assertEquals(5, c.multiplicar());
    }

    @Test
    public void dividir() {
        assertEquals(3, a.dividir(), 0);
        assertEquals(5, c.dividir(), 0);
    }

    @Test
    public void potencia() {
        assertEquals(36, a.potencia(), 0);
        assertEquals(5, c.potencia(), 0);
    }
}