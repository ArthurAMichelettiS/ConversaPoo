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

    /**
    * @return Retorna o tempo em milisegundos entre a fala de cada letra
     *
    */
    public int getTempoEntreLetras() {
        return tempoEntreLetras;
    }

}
