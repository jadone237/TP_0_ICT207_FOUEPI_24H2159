package inf3855.concepts;

    public class VoitureCarburant extends Voiture {
        private String typeCarburant;


        public VoitureCarburant(String nom, int puissance, boolean estDemarre,
                                double vitesse, String typeCarburant) {
            super(nom, puissance, estDemarre, vitesse);
            this.typeCarburant = typeCarburant;
        }


        public String getTypeCarburant() {
            return typeCarburant;
        }


        @Override
        public void afficher() {
            super.afficher();
            System.out.println("Type de carburant: " + typeCarburant);
            System.out.println("Type: Voiture à carburant");
        }
}
