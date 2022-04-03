package exercicio1;

public class Carro {
    private String matricula;
    private int velocidadeAtual = 0;
    int velocidadeMaxima = 200;
    boolean ligado = false;

    void ligar() {
        System.out.println("VROOOM");
        ligado = true;
    }

    void desligar() {
        System.out.println("MMMmmmmm");
        ligado = false;
    }

    void acelerar() {
        if (ligado == true) {
            velocidadeAtual += 10;
            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
        }

        else {
            System.out.println("O carro tem que ser ligado para poder acelerar");
        }
    }

    void travar(int intensidadeTravagem) {

        if (ligado == true) {

            if (intensidadeTravagem > velocidadeMaxima) {
                intensidadeTravagem = velocidadeMaxima;
            }

            else if (intensidadeTravagem < 0) {
                intensidadeTravagem = 0;
                velocidadeAtual -= intensidadeTravagem;
            }

            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }

            else if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        } else {
            System.out.println("O carro tem que ser ligado para poder acelerar");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public boolean isLigado(boolean ligado) {
        if (ligado == true) {
            return true;
        }
        return false;
    }

    public void buzinar() {
        System.out.println("Buzina do carro");
    }
}
