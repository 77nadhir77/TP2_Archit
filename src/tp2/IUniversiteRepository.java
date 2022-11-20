package tp2;

import java.sql.SQLException;

public interface IUniversiteRepository {
    Universite GetById(int universityId) throws SQLException;
}
