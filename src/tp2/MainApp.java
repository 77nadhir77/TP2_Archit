package tp2;


public class MainApp {

	public static void main(String[] args){

		JournalComposite journalComposite = new JournalComposite();
		Journal1 journal1 = new Journal1();
		Journal2 journal2 = new Journal2();
		Journal3 journal3 = new Journal3();

		journalComposite.addIJournal(journal1);
		journalComposite.addIJournal(journal2);
		journalComposite.addIJournal(journal3);

		EtudiantService serv=new EtudiantService(journalComposite);
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 123);
			serv.inscription(3, "NACEF", "Nadhir", "nnacef877@gmail.com", "xxxx", 2);
			serv.inscription(4, "slimani", "Mehdi", "didoslimani19@gmail.com", "xxxx", 2);
			serv.inscription(5, "Salmi", "Rafik", "rafik@gmail.com", "xxxx", 123);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
