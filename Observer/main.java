
import classes.CarroPolicia;
import classes.CarroRoubado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args){
        //Observador
        CarroPolicia carroPolicia = new CarroPolicia();
        
        //Observado
        CarroRoubado carroRoubado = new CarroRoubado();
        
        //Adicionar o observador ao observado
        carroRoubado.addObserver(carroPolicia);
        
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.para();
        
        
    }
}
