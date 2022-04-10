package ExercicioP2E3;

import exercicio1.Citadino;
import exercicio1.Familiar;
import exercicio1.Jipe;

import java.util.Scanner;

public class TestaBuzina2 {
    public static void main(String[] args) {
        Citadino citadino = new Citadino();
        Familiar familiar = new Familiar();
        Jipe jipe = new Jipe();
        Scanner sc = new Scanner(System.in);
        System.out.println("escolha entre Citadino 1, Familiar 2, Jipe 3\n");
        String option = sc.nextLine();

        switch (option) {
            case "1" -> {
                // Citadino citadino = new Citadino();
                citadino.buzinar();
                citadino.ligarACManual();
            }
            case "2" -> {
                // Familiar familiar = new Familiar();
                familiar.buzinar();
                familiar.desligarAirbadPassageiro();
            }
            case "3" -> {
                // Jipe jipe = new Jipe();
                jipe.buzinar();
                jipe.ligarTracao4x4();
            }
        }
        sc.close();
    }
}
