package tp2;


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
