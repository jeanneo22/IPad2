/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeanne
 */
public class IPadDemo {
    public static void isIPad(Device aparelho) {
        if(aparelho instanceof IPad)
            System.out.println("E um IPad");
        else System.out.println("Nao e um IPad");
    }
    
    public static void main(String args[]) {
        IPadAir MeuIPadAir = new IPadAir();
        IPadMini MeuIPadMini = new IPadMini();
        IPadKids MeuIPadKids = new IPadKids();
        String nome;
        int senha;
        
        MeuIPadAir.ligar();
        MeuIPadAir.setModelo("MD791BR/A");
        MeuIPadAir.setCodigoBarras(885909679);
        MeuIPadAir.setCor(3);
        MeuIPadAir.setMesesGarantia(12);
        MeuIPadAir.setPesoLiq(469);
        MeuIPadAir.setTipoTela("Tela Convencional");
        UsuarioIPad usuario1 = new UsuarioIPad();
        usuario1.cadastraUsuario();
        MeuIPadAir.tocarTela(2,3);
        
        MeuIPadMini.ligar();
        MeuIPadMini.setModelo("MD537BZ/A");
        MeuIPadMini.setCodigoBarras(885909634);
        MeuIPadMini.setCor(1);
        MeuIPadMini.setMesesGarantia(12);
        MeuIPadMini.setPesoLiq(308);
        MeuIPadMini.setTipoTela("Tela de Retina");
        UsuarioIPad usuario2 = new UsuarioIPad();
        usuario2.cadastraUsuario();
        MeuIPadMini.tocarTela(2,3);
       
        
        
        MeuIPadAir.imprime();
        System.out.println();
        MeuIPadMini.imprime();
        System.out.println();  
        IPadDemo.isIPad(MeuIPadAir);
        IPadDemo.isIPad(MeuIPadMini);
    }
    
}
