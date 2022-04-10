package ExercicioP2E3;

import exercicio1.Carro;

public class Condutor extends Carro {
    private String nome;
    private int idade;
    private int destreza;

    public void setNome(String name) {
        this.nome = name;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}
