package inf3855.concepts;

public class Main {
    public static void main(String[] args) {

        VoitureElectrique maVoitureElectrique = new VoitureElectrique(
                "VoitureElect", 5, false, 1, "Chargeur20"
        );

        System.out.println("=== Test Voiture Électrique ===");
        maVoitureElectrique.afficher();
        System.out.println();

        maVoitureElectrique.demarrer();
        maVoitureElectrique.accelerer(1, 50);
        System.out.println();

        maVoitureElectrique.afficher();
        System.out.println("\n" + "=".repeat(40) + "\n");

        
        VoitureCarburant maVoitureCarburant = new VoitureCarburant(
                "VoitureEssence", 150, false, 0, "Essence"
        );

        System.out.println("=== Test Voiture à Carburant ===");
        maVoitureCarburant.afficher();
        System.out.println();

        maVoitureCarburant.demarrer();
        maVoitureCarburant.accelerer(1, 80);
        System.out.println();

        maVoitureCarburant.afficher();
    }
}