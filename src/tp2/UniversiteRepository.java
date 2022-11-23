package tp2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversiteRepository{
	 
	public IJournal journal;

	public UniversiteRepository(IJournal journal){
		this.journal = journal;
	}





	public Universite GetById(int universityId) throws SQLException {
		
		IDBConnection DB = DBConnection.getInstance();
		Connection connect = DB.getConn(); 
		Statement stmt = connect.createStatement();


		journal.outPut_Msg("LogBD : début recherche de id université dans la base de donnée");



		// System.out.println("LogBD : début recherche de id université dans la base de donnée");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
		
		
		journal.outPut_Msg("LogBD : université récupérée");
		// System.out.println("LogBD : université récupérée");
		
		connect.close();
		return u;	
	
		
	}	




	public int NbrLivreAutorise(Universite univ){

		if(univ.getPack() == TypePackage.Standard){
			return 10;
		}else if(univ.getPack() == TypePackage.Premium){
			return 20;
		}else{
			return 0;
		}
		
	}
	
}
