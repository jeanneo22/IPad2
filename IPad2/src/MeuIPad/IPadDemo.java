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
public class IPadDemo {
    public static void isIPad(Device aparelho) {
        if(aparelho instanceof IPad)
            System.out.println("E um IPad");
        else System.out.println("Nao e um IPad");
    }
    
    public static void main(String args[]) {
        IPad_MD531BZA MeuIPad1 = new IPad_MD531BZA();
        IPad_MD794BRA MeuIPad2  = new IPad_MD794BRA();
        IPad_MD510BRA MeuIPad3 = new IPad_MD510BRA();
        String nome;
        int senha;
        
        MeuIPad1.ligar();
        MeuIPad1.setCodigoBarras(885909679);
        MeuIPad1.setCor(3);
        MeuIPad1.setMesesGarantia(12);
        MeuIPad1.setPesoLiq(469);
        MeuIPad1.setTipoTela("Tela Convencional");
        Usuario usuario1 = new Usuario();
        usuario1.cadastraUsuario();
        MeuIPad1.tocarTela(2,3);
        
        MeuIPad2.ligar();
        MeuIPad2.setCodigoBarras(885909634);
        MeuIPad2.setCor(1);
        MeuIPad2.setMesesGarantia(12);
        MeuIPad2.setPesoLiq(308);
        MeuIPad2.setTipoTela("Tela de Retina");
        Usuario usuario2 = new Usuario();
        usuario2.cadastraUsuario();
        MeuIPad2.tocarTela(2,3);
        
        MeuIPad3.ligar();
        MeuIPad3.setCodigoBarras(885909634);
        MeuIPad3.setCor(1);
        MeuIPad3.setMesesGarantia(12);
        MeuIPad3.setPesoLiq(308);
        MeuIPad3.setTipoTela("Tela de Retina");
        Usuario usuario3 = new Usuario();
        usuario3.cadastraUsuario();
        MeuIPad3.tocarTela(2,3);
       
        MeuIPad1.imprime();
        System.out.println();
        MeuIPad2.imprime();
        System.out.println();
        MeuIPad3.imprime();
        System.out.println();
        IPadDemo.isIPad(MeuIPad1);
        IPadDemo.isIPad(MeuIPad2);
        IPadDemo.isIPad(MeuIPad3);
    }
    
}
