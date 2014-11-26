/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeanne
 */
public class Usuario implements Autenticavel{
    private String nome;
    private int senha;

    public Usuario(String nome, int senha) {
        this.nome = nome;
        setSenha();
    }

    public Usuario() {
        this.nome = "";
        this.senha = 000000;
    }
    
    public Usuario(Usuario usuarioOriginal) {
        this.nome = usuarioOriginal.nome;
        this.senha = usuarioOriginal.senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha() {
        // gera um numero aleatorio entre 0 e 10000
        Random gerador = new Random();
        this.senha = gerador.nextInt(10001);
    }
    
    public void setSenha(Usuario usuario) {
        this.senha = usuario.senha;
    }

    public String getNome() {
        return nome;
    }

    public int getSenha() {
        return senha;
    }
    
    public void cadastraUsuario() {
        setNome(JOptionPane.showInputDialog("Nome "));
        setSenha();
        JOptionPane.showMessageDialog(null,"Senha criada com sucesso");
    }
    
    @Override
    public String toString() {
        String s = "Nome: "+this.nome+" Senha: "+this.senha;
        return s;
    }

    @Override
    public void autenticar(String nome, int senha) {
        if(this.nome.equals(nome) && this.senha == senha)
            System.out.println("Autenticacao valida");
        else
            System.out.println("Nao foi possivel autenticar");
        
        
    }
}
