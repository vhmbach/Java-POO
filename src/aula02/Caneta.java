package aula02;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Carga: " + getCarga());
       //System.out.println("Está tampada? " + estaTampada());
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void estaTampada() {
        if (isTampada()){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    void rabiscar(){

    }
    void tampar() {
        setTampada(true);
    }
    void destampar() {
        setTampada(false);
    }
}
