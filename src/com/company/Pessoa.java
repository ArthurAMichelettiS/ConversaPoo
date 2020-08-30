package com.company;

import java.util.*;


public class Pessoa {

    public Pessoa(String nome){
        this(nome, "neutro", "uma pessoa");
    }

    public Pessoa(String nome, String sentimento, String ocupacao){
        this.nome = nome;
        this.sentimento = sentimento;
        this.ocupacao = ocupacao;
        gostos = new ArrayList<String>();
    }

    private String nome;
    private String sentimento;
    private List<String> gostos;
    private String ocupacao;
    private VelocidadesDeFala velocidadeFala;
    private boolean enfaseFala = false;
    //list dos proximos topicos, metodos conversa

    protected void Fala(String frase){
        PrintExpressivo.Print(frase, enfaseFala,
                velocidadeFala.getTempoEntreLetras());
    }

    public void seApresentar(){
        StringBuilder textoApresenta = new StringBuilder(this.nome +
                ": Eu sou " + this.ocupacao);

        if (gostos.size()!=0)
            textoApresenta.append(" e gosto de ");

        int i;
        for (i=0; i < gostos.size()-2; i++) {
            textoApresenta.append(gostos.get(i)).append(", ");
        }
        if(gostos.size()>1)
            textoApresenta.append(gostos.get(i)).append(" e ").append(gostos.get(i+1));
        else if (gostos.size()==1)
            textoApresenta.append(gostos.get(0));

        textoApresenta.append(" (Diz sentindo ").append(this.sentimento).append(").");
        Fala(textoApresenta.toString());
    }

    public void Saudacao(Pessoa outraPessoa){
        this.Saudacao(outraPessoa, "você");
    }

    public void Saudacao(Pessoa outraPessoa, String vocativo){
        Fala("Olá, "+ vocativo +"! Meu nome é " + this.nome);
        if(outraPessoa != null)
            outraPessoa.RespondeSaudacao(this);
    }

    public void RespondeSaudacao(Pessoa outraPessoa){
        this.Saudacao(null, outraPessoa.nome);
    }

    public boolean isEnfaseFala() { return enfaseFala; }

    public void setEnfaseFala(boolean enfaseFala) { this.enfaseFala = enfaseFala; }

    public VelocidadesDeFala getVelocidadeFala() {
        return velocidadeFala;
    }

    public void setVelocidadeFala(VelocidadesDeFala velocidadeFala) {
        this.velocidadeFala = velocidadeFala;
    }

    public void addGosto(String gosto){
        gostos.add(gosto);
    }

    public void renovarGostos(){
        gostos.clear();
    }

    public List<String> getGostos(){ return gostos; }

    public String getNome(){ return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public void setOcupacao(String ocupacao) {this.ocupacao = ocupacao;}

    public String getOcupacao() {return ocupacao;}
}