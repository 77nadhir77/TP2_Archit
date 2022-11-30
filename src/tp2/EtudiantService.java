package tp2;
import java.sql.SQLException;
import java.util.ArrayList;




public class EtudiantService {
	
	public IJournal journal;
	IEtudiantRepository StudRep;
	IUniversiteRepository UnivRep;


	public EtudiantService(IJournal journal, IEtudiantRepository StudRep, IUniversiteRepository UnivRep){
		this.journal = journal;
		this.StudRep= StudRep;
	    this.UnivRep= UnivRep;
		
	}
	
	boolean inscription (int matricule, String nom, String prenom, String email,String pwd, int id_universite) throws SQLException	
	{
		
	    Etudiant stud = new Etudiant(matricule, nom, prenom, email, pwd, id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    

		
		journal.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    // System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
		
	    if(StudRep.emailMatVerification(stud))
	    {
	    	return false;
	    }
	    
		
		int nombreDeLivresAutorises = UnivRep.NbrLivreAutorise(univ);
		stud.setNbLivreMensuel_Autorise(nombreDeLivresAutorises);



		
		// if (univ.getPack() == TypePackage.Standard)
		// {
		// 	stud.setNbLivreMensuel_Autorise(10);
		// }
		// else if (univ.getPack() == TypePackage.Premium)
		// {
		// 	stud.setNbLivreMensuel_Autorise(10*2);
		// }                           
		
		StudRep.add(stud);

		
		journal.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);

		//  System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		return true;
	    
		
	}


	public void ajouterBonus(int id) throws SQLException{

		Universite univ = UnivRep.GetById(id);

		ArrayList<Etudiant> listEtudiant = GetEtudiantParUniversite();

		if(univ.getPack() == TypePackage.Standard){
			Package p = new StandardPack();

			for(Etudiant e : listEtudiant){
				p.augumenterNombreDeLivre(e);
			}
		}else if(univ.getPack() == TypePackage.Premium){
			Package p = new PremiumPack();
			
			for(Etudiant e : listEtudiant){
				p.augumenterNombreDeLivre(e);
			}
		}

	}
	
	
	

	public ArrayList<Etudiant> GetEtudiantParUniversite()
	{
		//..
		return new ArrayList<>(4);
	}
	
	public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
	{
	    //...
		return new ArrayList<>(4);
		
	}
	

	
}
