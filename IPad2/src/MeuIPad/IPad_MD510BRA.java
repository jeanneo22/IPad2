/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;

import Representacao2D.Ponto;

/**
 *
 * @author Jeanne
 */
public class IPad_MD510BRA extends IPad{
    private Calculadora calculadora;
    private MP3Player mp3;
    private static int contIpad_MD510BRA = 0;

    public IPad_MD510BRA(int codigoBarras, float pesoLiq, String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, Usuario usuarioIpad) {
        super(codigoBarras, pesoLiq, cor, tipoTela, mesesGarantia, coordenadasTela, usuarioIpad);
        this.calculadora = new Calculadora();
        this.mp3 = new MP3Player();
        contIpad_MD510BRA++;
    }

    public IPad_MD510BRA() {
        super();
        this.calculadora = new Calculadora();
        this.mp3 = new MP3Player();
        contIpad_MD510BRA++;
    }

    public IPad_MD510BRA(IPad_MD510BRA ipadOriginal) {
        super(ipadOriginal);
        this.calculadora = new Calculadora(ipadOriginal.calculadora);
        this.mp3 = new MP3Player(ipadOriginal.mp3);
        contIpad_MD510BRA++;
    }

    public static int getContIpad_MD510BRA() {
        return contIpad_MD510BRA;
    }
    
    @Override
    public void imprime() {
        System.out.println("Modelo: MD510BRA");
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
    
}
