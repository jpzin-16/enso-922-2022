package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicacaoTest{
    
    Multiplicacao multiplicacao;

    @BeforeEach
    public void antesTeste(){
        multiplicacao = new Multiplicacao();
    }

    @AfterEach
    public void depoisTeste(){
        System.out.println("Valor após teste");
    }

    @Test
    public void valoresNegativos(){
        double r1 = multiplicacao.calculandoMultiplicacao(-4.0, -5.0);
        assertEquals(20.0, r1);
    }   

    @Test   
    public void valoresNulos(){
        double r1 = multiplicacao.calculandoMultiplicacao(0.0, 0.0);
        assertEquals(0.0, r1);

    }

    @Test
    public void valorPositivoNegativo(){
        double r1 = multiplicacao.calculandoMultiplicacao(10.0, -6.0);
        assertEquals(-60.0,r1);
    }
}