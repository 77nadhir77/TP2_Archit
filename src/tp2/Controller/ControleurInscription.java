package tp2.Controller;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import tp2.ServiceEtudiant.EtudiantService;

public class ControleurInscription{
    private IViewInscription viewInscription;
    private EtudiantService etudiantService;


    public ControleurInscription(IViewInscription viewInscription, EtudiantService etudiantService){
        this.viewInscription = viewInscription;
        this.etudiantService = etudiantService;

        viewInscription.addSubmitEvent(new Inscription());
    }
    



    public class Inscription implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            try {

                etudiantService.inscription(Integer.valueOf(viewInscription.getMatricule()), viewInscription.getNom(), viewInscription.getPrenom(), viewInscription.getEmail(), viewInscription.getPwd(), Integer.valueOf(viewInscription.getIdUniversite()));
            
            } catch (NumberFormatException e1) {
            
                e1.printStackTrace();
            
            } catch (SQLException e1) {
                
                e1.printStackTrace();
        
            }

        }
        
    }
}