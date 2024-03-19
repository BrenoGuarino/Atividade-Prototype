package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class InimigoTest {

        @Test
        void testClone() throws CloneNotSupportedException {
            Inimigo inimigo = new Inimigo(123, "Inimigo Original", new Armadura("Armadura Leve", 300), "Guerreiro");

            Inimigo inimigoClone = inimigo.clone();
            inimigoClone.setVida(456);
            inimigoClone.setNome("Breno O Melhor");
            inimigoClone.getArmadura().setDefesa(0);
            inimigoClone.setClasse("Bárbaro");

            assertEquals("Inimigo{vida=123, nome='Inimigo Original', armadura=Armadura{nomeArmadura='Armadura Leve', defesa=300}, classe='Guerreiro'}", inimigo.toString());
            assertEquals("Inimigo{vida=456, nome='Breno O Melhor', armadura=Armadura{nomeArmadura='Armadura Leve', defesa=0}, classe='Bárbaro'}", inimigoClone.toString());

        }
    }

