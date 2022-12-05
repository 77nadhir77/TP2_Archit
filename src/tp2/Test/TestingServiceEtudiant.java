package tp2.Test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import tp2.Journal.JournalComposite;
import tp2.Repository.EtudiantRepository;
import tp2.Repository.UniversiteRepository;
import tp2.ServiceEtudiant.EtudiantService;
import tp2.ServiceEtudiant.IEtudiantRepository;
import tp2.ServiceEtudiant.IUniversiteRepository;


class TestingServiceEtudiant{
    IEtudiantRepository etudRep;
    IUniversiteRepository univRep;
    JournalComposite jcmp;
    EtudiantService serv;


    @BeforeEach
    public void initianilisateur(){
        jcmp = new JournalComposite();
        etudRep = new EtudiantRepository(jcmp);
        univRep = new UniversiteRepository(jcmp);
        serv = new EtudiantService(jcmp, etudRep, univRep);
    }



    @Test
    void test(){
        boolean b = serv.inscription(10, "test", "test", "test@gmail.com", "xxx", 123);
        assertEquals(true,b);
    
    }





}

    


