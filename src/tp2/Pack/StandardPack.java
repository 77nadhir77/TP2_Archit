package tp2.Pack;

import tp2.ServiceEtudiant.Etudiant;

public class StandardPack extends Package{

    @Override
    public  int avoirNombreDelivreAutorise() {
        return 10;
    }

    @Override
    public void augumenterNombreDeLivre(Etudiant e) {
        e.setBonus(5);
    }

    
}
