package com.company;

import java.util.ArrayList;

public class Estudante extends Pessoa {

    public Estudante(String nome){
        super(nome);
        setOcupacao("Estudante");
    }

    public Estudante(String nome, String sentimento, String ocupacao){
        super(nome, sentimento, ocupacao);
    }

    public void FalarDoEnsino(){
        Fala("Estudo em " + instituicao + " e meu RA é " + ra);
    }

    private String ra;
    private String instituicao;

    public String getInstituicao() { return instituicao; }

    public void setInstituicao(String instituicao) { this.instituicao = instituicao; }

    public String getRa() { return ra; }

    public void setRa(String ra) { this.ra = ra; }
}
