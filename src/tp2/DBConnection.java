package tp2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements IDBConnection{
	   
		private String BDD = "nomBD";
		private String url = "jdbc:mysql://localhost:3306/" + BDD;
		private String user = "root";
		private String passwd = "";
	    private Connection conn;
		private static IDBConnection DBConn;

	   
	    private DBConnection() {}

	    @Override
	    public Connection getConn() throws SQLException {
			conn= DriverManager.getConnection(url, user,passwd);
			return conn;
		}

		public static IDBConnection getInstance(){
			if(DBConn == null){
				DBConn = new DBConnection();
			}

			return DBConn;
		}

	
}
