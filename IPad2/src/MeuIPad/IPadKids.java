/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jeanne
 */
public class IPadKids extends IPad{
    
    private String temaInfantil;
    private Random temaInfantilRandomico;
    private ArrayList<String> temasInfantis;
    private static int contIpadKids = 0;
    

    public IPadKids(String modelo, int codigoBarras, float pesoLiq, String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, UsuarioIPad usuarioIpad) {
        super(modelo, codigoBarras, pesoLiq, cor, tipoTela, mesesGarantia, coordenadasTela, usuarioIpad);
        inicializaTemasInfantis();
        int numero = temaInfantilRandomico.nextInt();
        this.setTemaInfantil(this.temasInfantis.get(numero));
        contIpadKids++;        
        
    }

    public IPadKids() {
        this.temaInfantil = "";
        inicializaTemasInfantis();
        contIpadKids++;
    }

    public IPadKids(IPadKids ipadKidsOriginal) {
        super(ipadKidsOriginal);
        this.temaInfantil = ipadKidsOriginal.temaInfantil;
        inicializaTemasInfantis();
        contIpadKids++;
    }
    
    public void inicializaTemasInfantis() {
        this.temasInfantis = new ArrayList<>();
        temasInfantis.add("Mickey");
        temasInfantis.add("Galinha Pintadinha");
        temasInfantis.add("Barbie");
        temasInfantis.add("Homen Aranha");
    }

    public void setTemaInfantil(String temaInfantil) {
        if(this.temasInfantis.contains(temaInfantil))
            this.temaInfantil = temaInfantil;
        else this.temaInfantil = "";
    }

    public String getTemaInfantil() {
        return temaInfantil;
    }
    
    @Override
    public void inicializaFuncionalidades() {
        String f[] = {"Ensina Cores","Ensina Numeros","Ensina Formas"}; // funcionalidades do IPadAir
        for(int i = 0; i < f.length; i++)
            funcionalidades.add(f[i]);
    }
    
    @Override
    public void imprime() {
        System.out.println("Familia do IPad: IPadKids");
        System.out.println("Tema Infantils "+this.temaInfantil);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Codigo de Barras: "+this.codigoBarras);
        System.out.println("Peso Liquido: "+this.pesoLiq+ " g");
        if(isLigado()) System.out.println("Esta ligado");
        else System.out.println("Desligado");
        System.out.println("Cor: "+this.cor);
        System.out.println("Tipo da Tela: "+this.tipoTela);
        System.out.println("Meses de Garantia: "+this.mesesGarantia);
        System.out.println("Coordenadas apontadas na tela pelo usuario: "+this.coordenadasTela);
        System.out.println("Usuario do IPad - "+this.usuarioIpad);
        System.out.println("Funcionalidades:");
        System.out.println(this.funcionalidades);
        System.out.println("Quantidade de IPadAir: "+IPadKids.contIpadKids);
    } 
    
}
