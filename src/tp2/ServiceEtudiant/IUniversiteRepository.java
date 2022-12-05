package tp2.ServiceEtudiant;

import java.sql.SQLException;

public interface IUniversiteRepository {
    Universite GetById(int universityId) throws SQLException;
    public int NbrLivreAutorise(Universite univ);
}
