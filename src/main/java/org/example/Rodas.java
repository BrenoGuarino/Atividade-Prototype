package org.example;

class Rodas implements Cloneable {
    private String tipo;

    public Rodas(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Rodas clone() throws CloneNotSupportedException {
        return (Rodas) super.clone();
    }

    @Override
    public String toString() {
        return "Rodas{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}