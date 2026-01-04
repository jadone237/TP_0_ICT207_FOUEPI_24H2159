public class Division {
    public double diviser(double a,double b) {
        if (b == 0) {
            System.out.println("Erreur: division par zero");
            return 0;

        }
        return a/b;
    }
    public static double diviserStatique(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro");
            return 0;
        }
        return a / b;
    }
}
