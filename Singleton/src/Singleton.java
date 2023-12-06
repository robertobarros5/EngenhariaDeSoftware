/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Singleton {
    
    //instancia única da classe
    private static Singleton instancia;
    
    
    private Singleton(){
        
    }
    
    //metodo publico para obter a isntancia única
    public static Singleton getInstance(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
    
    public void mostraMensagem(){
        System.out.println("Instancia Singleton");
    }
}
