package tp2.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import tp2.Connection.DBConnection;
import tp2.Journal.IJournal;
import tp2.ServiceEtudiant.Etudiant;
import tp2.ServiceEtudiant.IEtudiantRepository;

public class EtudiantRepository implements IEtudiantRepository{
	

	public IJournal journal;

	public EtudiantRepository(IJournal journal){
		this.journal = journal;
	}



	public void add(Etudiant E) throws SQLException
	{

		IDBConnection DB = DBConnection.getInstance();
		Connection connect= DB.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			
			journal.outPut_Msg("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule "+E.getMatricule());

				// System.out.println("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
	
				journal.outPut_Msg("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
				// System.out.println("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }


	public boolean Exists(String email) throws SQLException	
	{
		IDBConnection DB = DBConnection.getInstance();
		Connection connect= DB.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.executeQuery(sql).next();
		
		if (rs){

				journal.outPut_Msg("logBD--- :email existe dans la BD  " + email);



				// System.out.println("logBD--- :email existe dans la BD  " + email);
				connect.close();
				return true;
			}

		journal.outPut_Msg("logBD--- : email n'existe pas " + email);	
		
		// System.out.println("logBD--- : email n'existe pas " + email);	
		connect.close();
		return false;
	}
	
	public boolean Exists(int mat) throws SQLException	
	{
		IDBConnection DB = DBConnection.getInstance();
		Connection connect=DB.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.executeQuery(sql).next();
		
		if (rs){

			journal.outPut_Msg("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);


			// System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			connect.close();
			return true;

			}

		journal.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);
		
		// System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		connect.close();
		return false;
	}




	public boolean emailMatVerification(Etudiant E) throws SQLException{
		return this.Exists(E.getEmail()) || this.Exists(E.getMatricule()) || E.getEmail().length() == 0 || E.getEmail() == null;
	}

}
