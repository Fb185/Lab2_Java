package exercicio1;

import java.util.Scanner;

public class TestaBuzina2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escolha entre Citadino 1, Familiar 2, Jipe 3\n");
        String option = sc.nextLine();

        switch (option) {
            case "1" -> {
                Citadino citadino = new Citadino();
                citadino.buzinar();
                citadino.ligarACManual();
            }
            case "2" -> {
                Familiar familiar = new Familiar();
                familiar.buzinar();
                familiar.desligarAirbadPassageiro();
            }
            case "3" -> {
                Jipe jipe = new Jipe();
                jipe.buzinar();
                jipe.ligarTracao4x4();
            }
        }
        sc.close();
    }
}
