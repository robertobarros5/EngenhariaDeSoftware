/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class Main {
    public static void main(String[] args) {
        FazendinhaFacade fazendinha = new FazendinhaFacade();

        fazendinha.cuidarDaFazenda();
        // Saída esperada:
        // FazendinhaFacade: Cuidando da Fazenda
        // Galinheiro: Alimentando Galinhas
        // Curral: Alimentando Animais
        // Celeiro: Armazenando Colheita
    }
}