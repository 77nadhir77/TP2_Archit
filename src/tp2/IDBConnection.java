package tp2;

import java.sql.SQLException;
import java.sql.Connection;

public interface IDBConnection {
    
    public Connection getConn() throws SQLException;
}
