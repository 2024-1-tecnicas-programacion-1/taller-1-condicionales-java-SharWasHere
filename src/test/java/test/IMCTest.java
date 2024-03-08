package test;

import ejercicios.IMC;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class IMCTest {
    @Test
    public void testBajo() {
        String valorEsperado = "bajo";
        String valorActual = IMC.evaluar(50, 1.8,   20);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
    public void testMedio() {
        String valorEsperado = "medio";
        String valorActual = IMC.evaluar(70,1.7,25);
        assertEquals(valorEsperado, valorActual);
    }
    public void testMedio2() {
        String valorEsperado = "medio";
        String valorActual = IMC.evaluar(55,1.75,45);
        assertEquals(valorEsperado, valorActual);
    }
    public void testAlto() {
        String valorEsperado = "alto";
        String valorActual = IMC.evaluar(90,1.72,50);
        assertEquals(valorEsperado, valorActual);
    }
}
