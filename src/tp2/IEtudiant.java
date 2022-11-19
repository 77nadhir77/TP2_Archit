package tp2;

public interface IEtudiant {

    int getMatricule();


    void setMatricule(int matricule);


    String getNom();


    void setNom(String nom) ;


    String getPrenom();


    void setPrenom(String prenom);


    String getEmail();


    void setEmail(String email);


    int getNbLivreMensuel_Autorise();


    void setNbLivreMensuel_Autorise(int nbLivreMensuel_Autorise);


    int getNbLivreEmprunte();


    void setNbLivreEmprunte(int nbLivreEmprunte);


    int getId_universite();


    void setId_universite(int id_universite);


    String getPwd();


    void setPwd(String pwd);
}
