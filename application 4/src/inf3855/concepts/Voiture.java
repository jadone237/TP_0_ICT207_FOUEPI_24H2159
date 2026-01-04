package inf3855.concepts;

public class Voiture {

    private int puissance;
    private boolean estDemarre;
    private double vitesse;


    public Voiture(String nom, int puissance, boolean estDemarre, double vitesse) {
        this.puissance = puissance;
        this.estDemarre = estDemarre;
        this.vitesse = vitesse;
    }


    public int getPuissance() {
        return puissance;
    }

    public boolean isEstDemarre() {
        return estDemarre;
    }

    public double getVitesse() {
        return vitesse;
    }


    public void demarrer() {
        if (!estDemarre) {
            estDemarre = true;
            System.out.println("La voiture a démarré.");
        } else {
            System.out.println("La voiture est déjà démarrée.");
        }
    }


    public void accelerer(int p1, double vitesse) {
        if (estDemarre) {
            this.vitesse += vitesse;
            System.out.println("Accélération de " + vitesse + " km/h. Vitesse actuelle: " + this.vitesse + " km/h");
        } else {
            System.out.println("Impossible d'accélérer. La voiture n'est pas démarrée.");
        }
    }


    public void afficher() {
        System.out.println("=== Informations de la voiture ===");
        System.out.println("Puissance: " + puissance + " CV");
        System.out.println("Est démarrée: " + (estDemarre ? "Oui" : "Non"));
        System.out.println("Vitesse: " + vitesse + " km/h");
    }
}
