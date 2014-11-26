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
public class IPad_MD531BZA extends IPad{
    private Calculadora calculadora;
    private static int contIpad_MD531BZA = 0;

    public IPad_MD531BZA(int codigoBarras, float pesoLiq, String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, Usuario usuarioIpad) {
        super(codigoBarras, pesoLiq, cor, tipoTela, mesesGarantia, coordenadasTela, usuarioIpad);
        this.calculadora = new Calculadora();
        contIpad_MD531BZA++;
    }

    public IPad_MD531BZA() {
        super();
        this.calculadora = new Calculadora();
        contIpad_MD531BZA++;
    }

    public IPad_MD531BZA(IPad_MD531BZA ipadOriginal) {
        super(ipadOriginal);
        this.calculadora = new Calculadora();
        contIpad_MD531BZA++;
    }

    public void ativarCalculadora() {
        this.calculadora.mostrarCalculadora();
    }
    
    public static int getContIpad_MD531BZA() {
        return contIpad_MD531BZA;
    }
    
    @Override
    public void imprime() {
        System.out.println("Modelo: MD531BZA");
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
            tecla = Short.parseShort(JOptionPane.showInputDialog("1. Ativar calculadora\n 2. sair"));
            switch(tecla) {
                case 1:
                    this.ativarCalculadora();
                    break;
                case 2:
                    break;
            }
        } while(tecla != 2);
    }
}
