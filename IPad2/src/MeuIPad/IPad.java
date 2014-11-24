/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;
import java.util.ArrayList;
/**
 *
 * @author Jeanne
 */
public abstract class IPad implements Device,Comparable<IPad>{
    
    public enum Cor {
        Nenhuma,Branco,Preto,CinzaEspacial;
    }
    public enum CorEnum {
        Nenhuma(0),Branco(1),Preto(2),CinzaEspacial(3);
        private int valorCor;
        CorEnum(int valor) {
            valorCor = valor;
        }
        public void setValorCor(int valor) {
            valorCor = valor;
        }
    }
    
    protected String modelo;
    protected int codigoBarras;
    protected float pesoLiq; // Peso liq em gramas
    protected boolean ligado;
    protected CorEnum cor;
    protected String tipoTela;
    protected int mesesGarantia;
    protected Ponto coordenadasTela;
    protected UsuarioIPad usuarioIpad;
    protected ArrayList<String> funcionalidades;
    protected static final int GARANTIA_MAXIMA = 36; // 36 meses ou 3 anos

    public IPad(String modelo, int codigoBarras, float pesoLiq,String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, UsuarioIPad usuarioIpad) {
        setModelo(modelo);
        setCodigoBarras(codigoBarras);
        setPesoLiq(pesoLiq);
        setCor(0);
        setTipoTela(tipoTela);
        setMesesGarantia(mesesGarantia);
        this.coordenadasTela = new Ponto(coordenadasTela);
        this.usuarioIpad = new UsuarioIPad(usuarioIpad);
        funcionalidades = new ArrayList<>(10);
    }

    public IPad() {
        this.modelo = "";
        this.codigoBarras = 000000000;
        this.pesoLiq = 0.00F;
        this.ligado = false;
        //this.cor.setValorCor(0);
        this.tipoTela = "";
        this.mesesGarantia = 0;
        this.coordenadasTela = new Ponto();
        this.usuarioIpad = new UsuarioIPad();
    }

    public IPad(IPad ipadOriginal) {
        this.modelo = ipadOriginal.modelo;
        this.codigoBarras = ipadOriginal.codigoBarras;
        this.pesoLiq = ipadOriginal.pesoLiq;
        this.ligado = ipadOriginal.ligado;
        this.cor = ipadOriginal.cor;
        this.tipoTela = ipadOriginal.tipoTela;
        this.mesesGarantia = ipadOriginal.mesesGarantia;
        this.coordenadasTela = ipadOriginal.coordenadasTela;
        this.usuarioIpad = ipadOriginal.usuarioIpad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = (codigoBarras>=0)?codigoBarras:0;
    }

    public void setPesoLiq(float pesoLiq) {
        this.pesoLiq = (pesoLiq>=0)?pesoLiq:0.00F;
    }

    public void setCor(int valorCor) {
        /*if(valorCor >= 0 && valorCor <= 3)
            //this.cor.setValorCor(valorCor);
        //else//this.cor.setValorCor(0);*/
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = (mesesGarantia >= 0 && mesesGarantia <= GARANTIA_MAXIMA)?mesesGarantia:0;
    }
    
    public void setCoordenadasTela(Ponto coordenadasTela) {
        this.coordenadasTela.setX(coordenadasTela.getX());
        this.coordenadasTela.setY(coordenadasTela.getY());
    }

    public void setUsuarioIpad(UsuarioIPad usuarioIpad) {
        this.usuarioIpad.setNome(usuarioIpad.getNome());
        this.usuarioIpad.setSenha(usuarioIpad.getSenha());
    }
    
    public void setFuncionalidade(String funcionalidade) {
        funcionalidades.add(funcionalidade);
    }
    
    public String getModelo() {
        return modelo;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public float getPesoLiq() {
        return pesoLiq;
    }

    public CorEnum getCor() {
        return cor;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public Ponto getCoordenadasTela() {
        return coordenadasTela;
    }

    public UsuarioIPad getUsuarioIpad() {
        return usuarioIpad;
    }
    
    public String getFuncionalidade(int i) {
        return funcionalidades.get(i);
    }
    
    public abstract void inicializaFuncionalidades();
    
    @Override
    public void ligar() {
        imprimeMensagem();
        this.ligado = true;
    }
    
    @Override
    public void desligar() {
        this.ligado = false;
    }
    
    @Override
    public boolean isLigado() {
        return(this.ligado);
    }
    
    public void tocarTela(float x,float y) {
        this.coordenadasTela.setX(x);
        this.coordenadasTela.setY(y);
    }
    
    public abstract void imprime();
 
    public static void imprimeMensagem() {
        System.out.println("Bem Vindo ao IPad!");
    }
    
    @Override
    public int compareTo(IPad outroIPad) {
        if(this.pesoLiq > outroIPad.pesoLiq)
            return 1;
        else if(this.pesoLiq == outroIPad.pesoLiq)
            return 0;
        else return -1;
            
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof IPad) {
           IPad I = (IPad) obj;
           return (this.pesoLiq==I.pesoLiq);
        }else {
            return false;
        }
    }
}
