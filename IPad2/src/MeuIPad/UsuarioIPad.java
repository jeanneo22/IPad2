/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeanne
 */
public class UsuarioIPad implements Usuario{
    private String nome;
    private int senha;

    public UsuarioIPad(String nome, int senha) {
        this.nome = nome;
        setSenha(senha);
    }

    public UsuarioIPad() {
        this.nome = "";
        this.senha = 000000;
    }
    
    public UsuarioIPad(UsuarioIPad usuarioOriginal) {
        this.nome = usuarioOriginal.nome;
        this.senha = usuarioOriginal.senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(int senha) {
        // Uma senha de 6 digitos
        this.senha = (senha%100000>= 1)?senha:000000;
    }

    public String getNome() {
        return nome;
    }

    public int getSenha() {
        return senha;
    }
    
    public void cadastraUsuario() {
        nome = JOptionPane.showInputDialog("Nome: ");
        senha = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
        setNome(nome);
        setSenha(senha);
    }
    
    @Override
    public String toString() {
        String s = "Nome: "+nome+" Senha: "+senha;
        return s;
    }
}
