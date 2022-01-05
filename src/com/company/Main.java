package com.company;

public class Main {

    public static void main(String[] args) {

        Navio navioP1 = new NavioPortaContentores("12312","Navio1",100,10);
        Navio navioP2 = new NavioPortaContentores("23432","Navio2",100,10);
        Navio navioP3 = new NavioPortaContentores("12311243422","Navio3",100,10);
        Navio navioP4 = new NavioPortaContentores("32423","Navio4",100,10);
        Navio navioP5 = new NavioPortaContentores("234234","Navio5",100,10);
        Navio navioP6 = new NavioPortaContentores("45453","Navio6",100,10);

        Navio navioC1 = new NavioPetroleiro("2342","Navio1",100,10);
        Navio navioC2 = new NavioPetroleiro("342234","Navio2",100,10);
        Navio navioC3 = new NavioPetroleiro("23423432","Navio3",100,10);
        Navio navioC4 = new NavioPetroleiro("3243242323","Navio4",100,10);
        Navio navioC5 = new NavioPetroleiro("67678","Navio5",100,10);
        Navio navioC6 = new NavioPetroleiro("67867","Navio6",100,10);

        Porto porto = new Porto();
        porto.addNavio(navioP1);
        porto.addNavio(navioP2);
        porto.addNavio(navioP3);
        porto.addNavio(navioP4);
        porto.addNavio(navioP5);
        porto.addNavio(navioP6);
        porto.addNavio(navioC1);
        porto.addNavio(navioC2);
        porto.addNavio(navioC3);
        porto.addNavio(navioC4);
        porto.addNavio(navioC5);

        porto.addNavio(navioC6);
        porto.addNavio(navioC6);   //confirmar que mostra a mensagem de erro a dizer que a matricula ja existe





    }
}
