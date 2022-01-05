package com.company;

public class NavioPortaContentores extends Navio {
    private int nMaxContentores;


    public NavioPortaContentores(String matricula, String nome, float comprimento, int nMax){
        super(matricula,nome,comprimento);
        this.nMaxContentores=nMax;
    }

    public int get_nMaxContentores() {
        return nMaxContentores;
    }

    public void set_nMaxContentores(int nMaxContentores) {
        this.nMaxContentores = nMaxContentores;
    }

    @Override
    public float getCapacidade() {
        return nMaxContentores * 10;
    }
}
