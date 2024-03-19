package org.example;

public class Armadura implements Cloneable {
    private String nomeArmadura;
    private Integer defesa;

    public Armadura(String nomeArmadura, Integer defesa) {
        super();
        this.nomeArmadura = nomeArmadura;
        this.defesa = defesa;
    }

    public String getNomeArmadura() {
        return nomeArmadura;
    }

    public void setNomeArmadura(String nomeArmadura) {
        this.nomeArmadura = nomeArmadura;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Armadura{" +
                "nomeArmadura='" + nomeArmadura + '\'' +
                ", defesa=" + defesa +
                '}';
    }
}