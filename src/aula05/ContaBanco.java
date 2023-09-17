package aula05;
// se conta poupança, saldo = 150
//se conta corrente, saldo = 50
//public abrirContar(), status = true
//public depositar()
//public fecharContar, satus = false, não pode ter debito ou saldo
//public sacar(), não pode ser maior que o saldo
//public pagarMensalidade(), poupança = 20 reais, corrente = 12 reais
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual() {
        System.out.println("--------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        setStatus(true);
        if (getTipo().equals("cc")) {
            setSaldo(50);
        } else {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (getSaldo() < 0) {
            System.out.println("Não foi possível fechar a conta pois você tem débito ativo.");
        } else if (getSaldo() > 0){
            System.out.println("Não foi possível fechar a conta pois você tem saldo ativo.");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(double valor) {
        if (isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    public void sacar(double valor) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("O valor de R$" + valor + ", foi sacado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if(tipo.equals("cc")) {
            v = 12;
        } else if (tipo.equals("cp")){
            v = 20;
        }
        if (isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
}
