package tp2;

import tp2.Controller.ControleurInscription;
import tp2.Controller.IViewInscription;
import tp2.Journal.Journal1;
import tp2.Journal.Journal2;
import tp2.Journal.Journal3;
import tp2.Journal.JournalComposite;
import tp2.Repository.EtudiantRepository;
import tp2.Repository.UniversiteRepository;
import tp2.ServiceEtudiant.EtudiantService;
import tp2.ServiceEtudiant.IEtudiantRepository;
import tp2.ServiceEtudiant.IUniversiteRepository;
import tp2.View.ViewInscription;

public class MainAppMvc {

	public static void main(String[] args){

		JournalComposite journalComposite = new JournalComposite();
		Journal1 journal1 = new Journal1();
		Journal2 journal2 = new Journal2();
		Journal3 journal3 = new Journal3();

		journalComposite.addIJournal(journal1);
		journalComposite.addIJournal(journal2);
		journalComposite.addIJournal(journal3);

		IUniversiteRepository UnivRep = new UniversiteRepository(journalComposite);
		IEtudiantRepository StudRep = new EtudiantRepository(journalComposite);

		EtudiantService serv=new EtudiantService(journalComposite, StudRep, UnivRep);


		IViewInscription viewInscription = new ViewInscription();
		ControleurInscription controleurInscription = new ControleurInscription(viewInscription, serv);
		


	}

}
