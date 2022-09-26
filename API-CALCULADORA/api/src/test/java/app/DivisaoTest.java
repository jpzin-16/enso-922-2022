package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisaoTest {
     Divisao divisao;

     @BeforeEach
     public void antesTeste(){
       divisao = new Divisao();
     }

     @AfterEach
     public void depoisTeste(){
        System.out.println("Resulatdo finais dos teses");
     }

    @Test
    public void valoresGrandes(){
        double resultado = divisao.calculandoDivisao(65000, 4);
        assertEquals(16250,resultado);

    }

    @Test
    public void valoresnegativos(){
        double resultado = divisao.calculandoDivisao(23, -2);
        assertEquals(-11.5,resultado);

    }

    @Test
    public void dizimaPeriodica(){
        double resultado = divisao.calculandoDivisao(7, 3);
        assertEquals(2.33333,resultado, 0.00001);

    }
}