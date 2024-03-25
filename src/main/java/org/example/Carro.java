package org.example;

public class Carro implements Cloneable {
    private String marca;
    private String modelo;
    private Motor motor;
    private Rodas rodas;
    private int anoFabricacao;

    public Carro(String marca, String modelo, Motor motor, Rodas rodas, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.rodas = rodas;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rodas getRodas() {
        return rodas;
    }

    public void setRodas(Rodas rodas) {
        this.rodas = rodas;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        Carro carroClone = (Carro) super.clone();
        carroClone.motor = motor.clone();
        return carroClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", rodas=" + rodas +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }}