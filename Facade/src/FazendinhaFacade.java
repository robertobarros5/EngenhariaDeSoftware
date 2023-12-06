/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class FazendinhaFacade {

    private Galinheiro galinheiro;
    private Curral curral;
    private Celeiro celeiro;

    public FazendinhaFacade() {
        this.galinheiro = new Galinheiro();
        this.curral = new Curral();
        this.celeiro = new Celeiro();
    }

    public void cuidarDaFazenda() {
        System.out.println("FazendinhaFacade: Cuidando da Fazenda");
        galinheiro.alimentarGalinhas();
        curral.alimentarAnimais();
        celeiro.armazenarColheita();
    }

    // Galinheiro.java
    public class Galinheiro {

        public void alimentarGalinhas() {
            System.out.println("Galinheiro: Alimentando Galinhas");
        }
    }

// Curral.java
    public class Curral {

        public void alimentarAnimais() {
            System.out.println("Curral: Alimentando Animais");
        }
    }

// Celeiro.java
    public class Celeiro {

        public void armazenarColheita() {
            System.out.println("Celeiro: Armazenando Colheita");
        }
    }
}
