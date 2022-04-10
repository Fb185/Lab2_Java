package ExercicioP2E3;

import exercicio1.Carro;
import exercicio1.Citadino;
import exercicio1.Familiar;
import exercicio1.Jipe;

public class testaBuzina1 {

    public static void main(String[] args) {
        Familiar familiar = new Familiar();
        Jipe jipe = new Jipe();
        Citadino citadino = new Citadino();

        System.out.println(familiar);
        familiar.buzinar();
        System.out.println(jipe);
        jipe.buzinar();
        System.out.println(citadino);
        citadino.buzinar();

    }
}
