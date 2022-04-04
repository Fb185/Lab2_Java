package exercicio1;

public class Familiar extends Carro {
    public void desligarAirbadPassageiro() {
        System.out.println("Airbag desligado");
    }

    // override do metodo buzinar da classe carro
    public void buzinar() {
        System.out.println("Buzina do Familiar");
    }
}
