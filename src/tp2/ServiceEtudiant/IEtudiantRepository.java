package tp2.ServiceEtudiant;

import java.sql.SQLException;

public interface IEtudiantRepository {
    void add(Etudiant E) throws SQLException;
    boolean Exists(String email) throws SQLException;
    boolean Exists(int mat) throws SQLException;
    public boolean emailMatVerification(Etudiant E) throws SQLException;
}
