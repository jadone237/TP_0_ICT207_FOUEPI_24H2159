package inf3855.concepts;


    public class VoitureElectrique extends Voiture {
        private String typeChargeur;


        public VoitureElectrique(String nom, int puissance, boolean estDemarre,
                                 double vitesse, String typeChargeur) {
            super(nom, puissance, estDemarre, vitesse);
            this.typeChargeur = typeChargeur;
        }


        public String getTypeChargeur() {
            return typeChargeur;
        }


        @Override
        public void afficher() {
            super.afficher();
            System.out.println("Type de chargeur: " + typeChargeur);
            System.out.println("Type: Voiture électrique");
        }
}
