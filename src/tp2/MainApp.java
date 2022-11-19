package tp2;


public class MainApp {

	public static void main(String[] args){



		EtudiantService serv=new EtudiantService();
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 123);
			serv.inscription(3, "NACEF", "Nadhir", "nnacef877@gmail.com", "xxxx", 2);
			serv.inscription(4, "slimani", "Mehdi", "didoslimani10@gmail.com", "xxxx", 2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
