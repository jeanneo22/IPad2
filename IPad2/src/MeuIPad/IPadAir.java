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
public class IPadAir extends IPad { 
    private static final float tamanhoTela = 9.7F; // tamanho da tela em polegadas
    static int contIpadAir = 0;

    public IPadAir(String modelo, int codigoBarras, float pesoLiq, String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, UsuarioIPad usuarioIpad, float tamanhoTela) {
        super(modelo, codigoBarras, pesoLiq, cor, tipoTela, mesesGarantia, coordenadasTela, usuarioIpad);
        contIpadAir++;
    }
    
    public IPadAir() {
        super();
        contIpadAir++;
    }
    
    public IPadAir(IPadAir iPadAirOriginal) {
        super(iPadAirOriginal);
        contIpadAir++;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }
    
    @Override
    public void inicializaFuncionalidades() {
        String f[] = {"EDGE","GPRS","WAP","CameraFilmadora","MP3","Bluetooth","Calendario","Calculadora","GPS"}; // funcionalidades do IPadAir
        for(int i = 0; i < f.length; i++)
            funcionalidades.add(f[i]);
    }
    
    @Override
    public void imprime() {
        System.out.println("Familia do IPad: IPadAir");
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
        System.out.println("Tamanho da Tela: "+IPadAir.tamanhoTela);
        System.out.println("Funcionalidades:");
        System.out.println(this.funcionalidades);
        System.out.println("Quantidade de IPadAir: "+IPadAir.contIpadAir);
    } 
    
    
}
