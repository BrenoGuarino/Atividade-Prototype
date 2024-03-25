package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CarroTest {

        @Test
        void testClone() throws CloneNotSupportedException {
            Carro carro = new Carro("Volkswagen", "Gol GTI", new Motor("1.6"), new Rodas("Rodas de Aço"), 1996);

            Carro carroClone = carro.clone();
            carroClone.setAnoFabricacao(1998);
            carroClone.getMotor().setTipo("1.0");

            assertEquals("Carro{marca='Volkswagen', modelo='Gol GTI', motor=Motor{tipo='1.6'}, rodas=Rodas{tipo='Rodas de Aço'}, anoFabricacao=1996}", carro.toString());
            assertEquals("Carro{marca='Volkswagen', modelo='Gol GTI', motor=Motor{tipo='1.0'}, rodas=Rodas{tipo='Rodas de Aço'}, anoFabricacao=1998}", carroClone.toString());

        }
    }

