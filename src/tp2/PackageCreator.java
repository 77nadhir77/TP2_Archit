package tp2;

public class PackageCreator extends AbstractFactory{

    @Override
    public Package getPackageMode(TypePackage typePackage) {
        
        if(typePackage.equals(TypePackage.Standard)){

            return new StandardPack();

        }else if(typePackage.equals(TypePackage.Premium)){

            return new PremiumPack();
            
        }else{

            return new UnlimtedPack();
        }

    }
    
}
