/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;

/**
 *
 * @author Jeanne
 */
public interface Device {
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract boolean isLigado(); 
    public abstract void imprime(); 
}
