package org.example;

public class Inimigo implements Cloneable {
    private int vida;
    private String nome;
    private Armadura armadura;
    private String classe;

    public Inimigo(int vida, String nome, Armadura armadura, String classe) {
        this.vida = vida;
        this.nome = nome;
        this.armadura = armadura;
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public Inimigo clone() throws CloneNotSupportedException {
        Inimigo inimigoClone = (Inimigo) super.clone();
        inimigoClone.armadura = (Armadura) inimigoClone.armadura.clone();
        return inimigoClone;
    }

    @Override
    public String toString() {
        return "Inimigo{" +
                "vida=" + vida +
                ", nome='" + nome + '\'' +
                ", armadura=" + armadura +
                ", classe='" + classe + '\'' +
                '}';
    }
}
