package com.company;

public class NavioPetroleiro extends Navio{
    private float capCarga;

    public NavioPetroleiro(String matricula, String nome, float comprimento, float capCarga){
        super(matricula,nome,comprimento);
        this.capCarga=capCarga;
    }

    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }

    @Override
    public float getCapacidade() {
        return capCarga;
    }
}
