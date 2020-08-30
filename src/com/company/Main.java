package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Pessoa arth = new Pessoa("Arthur",
                "Alegria", "Estudante");
        arth.addGosto("Filmes");
        arth.addGosto("Jogos");
        arth.addGosto("Matemática");
        arth.setEnfaseFala(true);
        arth.setVelocidadeFala(VelocidadesDeFala.RAPIDO);

        Pessoa agata = new Pessoa("Agata",
                "Incrível", "Developer");
        agata.addGosto("Arvores");
        agata.setVelocidadeFala(VelocidadesDeFala.LENTO);


        Estudante jonas = new Estudante("Jonas");
        jonas.setInstituicao("E.E. João Ramalho");
        jonas.setRa("081181245");
        jonas.setVelocidadeFala(VelocidadesDeFala.MTO_RAPIDO);

        
        arth.Saudacao(agata);
        arth.seApresentar();
        agata.seApresentar();


        System.out.println();
        agata.Saudacao(jonas, "garoto");
        jonas.seApresentar();
        agata.seApresentar();
        jonas.FalarDoEnsino();
    }
}
