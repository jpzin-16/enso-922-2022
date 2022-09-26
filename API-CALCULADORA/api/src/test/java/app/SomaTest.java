package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SomaTest{
    
    Adicao adicao;

    @BeforeEach
    public void antesTeste(){
        adicao = new Adicao();
    }

    @AfterEach
    public void depoisTeste(){
        System.out.println("Valor após teste");
    }

    @Test
    public void valoresNegativos(){
        double r1 = adicao.calculandoSoma(-8.0, -3.0);
        assertEquals(-11.0, r1);
    }   

    @Test   
    public void valoresNulos(){
        double r1 = adicao.calculandoSoma(0.0, 0.0);
        assertEquals(0.0, r1);

    }

    @Test
    public void valorPositivoNegativo(){
        double r1 = adicao.calculandoSoma(5, -8);
        assertEquals(-3,r1);
    }
}