package exercicio1;

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
