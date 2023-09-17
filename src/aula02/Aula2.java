package aula02;

public class Aula2 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setCor("Azul");
        c1.setPonta(0.5);
        c1.setTampada(false);
        c1.status();
        System.out.print("Está tampada? ");
        c1.estaTampada();
        c1.tampar();
        System.out.print("Está tampada? ");
        c1.estaTampada();
    }
}
