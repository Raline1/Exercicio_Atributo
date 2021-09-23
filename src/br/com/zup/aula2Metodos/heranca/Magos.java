package br.com.zup.aula2Metodos.heranca;

public class Magos extends Heroi{
    private double poderMagico;

    public Magos() {

    }

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }
    public double aplicarDano(){
        double dano = getVida() - poderMagico;
        return dano;
    }
}
