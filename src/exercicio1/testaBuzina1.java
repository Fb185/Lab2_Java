package exercicio1;

public class testaBuzina1 {
    public static void main(String[] args) {
        Familiar familiar = new Familiar();
        Condutor condutor = new Condutor();
        Jipe jipe = new Jipe();
        Citadino citadino = new Citadino();

        System.out.println(familiar);
        familiar.buzinar();
        System.out.println(condutor);
        condutor.buzinar();
        System.out.println(jipe);
        jipe.buzinar();
        System.out.println(citadino);
        citadino.buzinar();

    }
}
