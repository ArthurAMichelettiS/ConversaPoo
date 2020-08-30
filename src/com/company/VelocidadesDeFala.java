package com.company;

public enum VelocidadesDeFala {
    MTO_LENTO(240),
    LENTO(150),
    RAPIDO(70),
    MTO_RAPIDO(30);


    private int tempoEntreLetras;

    VelocidadesDeFala(int tempoEntreLetras) {
        this.tempoEntreLetras = tempoEntreLetras;
    }

    public int getTempoEntreLetras() {
        return tempoEntreLetras;
    }

}
