package aula05;

public class Sistema {
    public static void main(String[] args){
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1234);
        c1.setDono("Vitor Bach");
        c1.setTipo("cc");
        c1.abrirConta();
        c1.depositar(150);
        c1.sacar(50);
        c1.pagarMensal();
        c1.depositar(75);
        c1.estadoAtual();
    }
}