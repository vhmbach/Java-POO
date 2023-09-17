package aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        if (!this.isLigado()) {
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if (isLigado()) {
            this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + isLigado());
        System.out.println("Está tocando? " + isTocando());
        System.out.print("Volume: " + getVolume());
        for (int i= 0; i <= this.getVolume(); i+=10){
            System.out.print(" | ");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (!isLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            this.setTocando(false);
        }
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
