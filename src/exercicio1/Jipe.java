package exercicio1;

public class Jipe extends Carro {
    public void ligarTracao4x4() {
        System.out.println("Tracao ligada");
    }

    // override do metodo buzinar da classe carro
    public void buzinar() {
        System.out.println("Buzina do Jipe");
    }
}
