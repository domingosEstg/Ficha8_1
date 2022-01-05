package com.company;

import java.util.*;

public class Porto {
    Map<String, Navio> navios;
    public Porto(){
        this.navios= new HashMap<>();
    }

    public void addNavio(Navio n){
        if(!this.navios.containsKey(n.getMatricula())) this.navios.put(n.getMatricula(),n);
        else System.out.println("ERRO!! MATRICULA JÁ EXISTENTE");
    }

    public int getQuantidadeContentores() {
        int count =0;
        for (Navio n : this.navios.values()) {
            if (n instanceof NavioPortaContentores){
                count += ((NavioPortaContentores) n).get_nMaxContentores();
            }
        }
        return count;
    }

    public float getQuantidadeCarga() {
        int count =0;
        for (Navio n : this.navios.values()) {
                count += n.getCapacidade();
        }
        return count;
    }
    public int getPeso(){
        int total=0;
        for(Navio n : this.navios.values()){
            if(n instanceof NavioPetroleiro) total+= ((NavioPetroleiro) n).getCapCarga();
            else total+= ((NavioPortaContentores) n).get_nMaxContentores()*10;
        }
        return total;
    }
}
