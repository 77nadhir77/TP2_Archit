package tp2;

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
