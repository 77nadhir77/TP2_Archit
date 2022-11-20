package tp2;

import java.sql.SQLException;

public interface IEtudiantRepository {
    void add(Etudiant E) throws SQLException;
    boolean Exists(String email) throws SQLException;
    boolean Exists(int mat) throws SQLException;
}
