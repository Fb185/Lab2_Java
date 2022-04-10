package ExercicioP2E3;

public abstract class Carro implements CarroInterface {
    private String matricula;
    private int velocidadeAtual = 0;
    int velocidadeMaxima = 200;
    boolean ligado = false;

    public Carro() {
        this.ligado = false;
    }

    public void ligar() {
        System.out.println("VROOOM");
        ligado = true;
    }

    public void desligar() {
        System.out.println("MMMmmmmm");
        ligado = false;
    }

    // public boolean isLigado(boolean ligado) {
    // return ligado;
    // }

    public void acelerar() {
        if (ligado) {
            velocidadeAtual += 10;
            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
        }

        else {
            System.out.println("O carro tem que ser ligado para poder acelerar");
        }
    }

    public void travar(int intensidadeTravagem) {

        if (ligado) {

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

    // public void buzinar() {
    // System.out.println("Buzina do Carro");
    // }
    // public abstract void buzinar();
    // este metodo pode estar abstrato porque tem as suas implementacoes feitas nas
    // subclasses

}
