import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDiferenteTest {

    private final CalculadoraDiferente calculadora = new CalculadoraDiferente();

    @Test
    public void testInverteNumero_123() {
        int resultado = calculadora.inverteNumero(123);
        assertEquals(321, resultado, "A inversão de 123 deveria ser 321");
    }

    @Test
    public void testInverteNumero_Zero() {
        int resultado = calculadora.inverteNumero(0);
        assertEquals(0, resultado, "A inversão de 0 deveria ser 0");
    }

    @Test
    public void testInverteNumero_NumeroSimples() {
        int resultado = calculadora.inverteNumero(7);
        assertEquals(7, resultado, "A inversão de 7 deveria ser 7");
    }

    @Test
    public void testFatorial_5() {
        int resultado = calculadora.fatorial(5);
        assertEquals(120, resultado, "O fatorial de 5 deveria ser 120");
    }

    @Test
    public void testFatorial_1() {
        int resultado = calculadora.fatorial(1);
        assertEquals(1, resultado, "O fatorial de 1 deveria ser 1");
    }

    @Test
    public void testFatorial_3() {
        int resultado = calculadora.fatorial(3);
        assertEquals(6, resultado, "O fatorial de 3 deveria ser 6");
    }

    @Test
    public void testSomaDobro_3e4() {
        int resultado = calculadora.somaDobro(3, 4);
        assertEquals(11, resultado, "A soma de 3 com o dobro de 4 deveria ser 11");
    }

    @Test
    public void testSomaDobro_0e0() {
        int resultado = calculadora.somaDobro(0, 0);
        assertEquals(0, resultado, "A soma de 0 com o dobro de 0 deveria ser 0");
    }

    @Test
    public void testSomaDobro_Negativo() {
        int resultado = calculadora.somaDobro(-2, 3);
        assertEquals(4, resultado, "A soma de -2 com o dobro de 3 deveria ser 4");
    }
}
