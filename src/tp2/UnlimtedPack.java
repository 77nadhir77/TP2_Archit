package tp2;

public class UnlimtedPack extends Package{

    @Override
    public int avoirNombreDelivreAutorise() {
        return 0;
    }

    @Override
    public void augumenterNombreDeLivre(Etudiant e) {
        
        e.setBonus(0);
        
    }
    
}
