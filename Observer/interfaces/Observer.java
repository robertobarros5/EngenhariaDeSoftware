/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Observable;

/**
 *
 * @author user
 */
public interface Observer {
    public void update(Observable arg0, Object arg1);
}
