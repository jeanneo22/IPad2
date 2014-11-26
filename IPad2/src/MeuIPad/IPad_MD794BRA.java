/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;

import Representacao2D.Ponto;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeanne
 */
public class IPad_MD794BRA extends IPad{
    private MP3Player mp3;
    private static int contIpad_MD794BRA = 0;

    public IPad_MD794BRA(int codigoBarras, float pesoLiq, String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, Usuario usuarioIpad) {
        super(codigoBarras, pesoLiq, cor, tipoTela, mesesGarantia, coordenadasTela, usuarioIpad);
        this.mp3 = new MP3Player();
        contIpad_MD794BRA++;
    }

    public IPad_MD794BRA() {
        super();
        this.mp3 = new MP3Player();
        contIpad_MD794BRA++;
    }

    public IPad_MD794BRA(IPad_MD794BRA ipadOriginal) {
        super(ipadOriginal);
        this.mp3 = new MP3Player();
        contIpad_MD794BRA++;
    }

    public static int getContIpad_MD794BRA() {
        return contIpad_MD794BRA;
    }
    
    @Override
    public void imprime() {
        System.out.println("Modelo: MD794BRA");
        System.out.println("Codigo de Barras: "+this.codigoBarras);
        System.out.println("Peso Liquido: "+this.pesoLiq+ " g");
        if(isLigado()) System.out.println("Esta ligado");
        else System.out.println("Desligado");
        System.out.println("Cor: "+this.cor);
        System.out.println("Tipo da Tela: "+this.tipoTela);
        System.out.println("Meses de Garantia: "+this.mesesGarantia);
        System.out.println("Coordenadas apontadas na tela pelo usuario: "+this.coordenadasTela);
        System.out.println("Usuario do IPad - "+this.usuarioIpad);
    }
    
    @Override
    public void gerenciar() {
        short tecla = 0;
        System.out.println("Qual acao deseja: ");
        do {
            tecla = Short.parseShort(JOptionPane.showInputDialog("1. Ouvir musica\n 2. sair"));
            switch(tecla) {
                case 1:
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Numero da musica: "));
                    this.mp3.tocarMusica(n);
                    break;
                case 2:
                    break;
            }
        } while(tecla != 2);
    }
    
    
}
