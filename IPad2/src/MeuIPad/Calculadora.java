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
public class Calculadora {
    private double num1,num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculadora() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    public Calculadora(Calculadora calc) {
        this.num1 = calc.num1;
        this.num2 = calc.num2;
        
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    public void mostrarCalculadora() {
        String operacao;  
        double resultado;   
     
        this.num1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com 1 Numero: "));  
        operacao = JOptionPane.showInputDialog("Entre com a Operação: " );  
        this.num2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com 2 Numero: "));  
  
            if (operacao.equals("+")) {  
                resultado = this.num1 + this.num2;  
                JOptionPane.showMessageDialog(null,"O resultado e :" +Double.toString(resultado));  
            }  
      
            if (operacao.equals("-")) {  
                resultado = this.num1 - this.num2;  
                JOptionPane.showMessageDialog(null,"O resultado e :" +Double.toString(resultado));  
               }  
          
            if (operacao.equals("*")) {  
                resultado = this.num1 * this.num2;  
                JOptionPane.showMessageDialog(null,"O resultado e :" +resultado);  
            }  
          
            if (operacao.equals("/")) {  
                resultado = this.num1 / this.num2;  
                JOptionPane.showMessageDialog(null,"O resultado e :" +Double.toString(resultado));
            }  
             
        }  

    }
