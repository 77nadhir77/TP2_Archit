package tp2;

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
