package tp2.Pack;

import tp2.ServiceEtudiant.Etudiant;

public class PremiumPack extends Package{

    @Override
    public int avoirNombreDelivreAutorise() {
        
        return 20;
    }

    @Override
    public void augumenterNombreDeLivre(Etudiant e) {
        e.setBonus(10);
        
    }
    
}
