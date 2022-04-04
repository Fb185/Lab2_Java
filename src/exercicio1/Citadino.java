package exercicio1;

public class Citadino extends Carro {
    public void ligarACManual() {
        System.out.println("AC ligado");
    }

    // override do metodo buzinar da classe carro

    public void buzinar() {
        System.out.println("Buzina do Citadino");
    }
    // super.buzinar();

}
