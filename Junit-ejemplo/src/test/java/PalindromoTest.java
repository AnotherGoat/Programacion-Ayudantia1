import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromoTest {

    private Palindromo p;

    @Before
    public void setUp() throws Exception {
        p = new Palindromo();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void esPalindromo() {
        String palabraPrueba = "aji traga la lagartija";

        assertFalse(p.esPalindromo(palabraPrueba));
    }

    @Test
    public void randomEntre() {

        int min = 70;
        int max = 100;

        int resultado = p.randomEntre(min, max);

        if (resultado<=100 && resultado>=70){
            assertTrue(true);
        }
        else{
            fail();
        }
    }
}