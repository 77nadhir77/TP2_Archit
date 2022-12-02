package tp2;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class ControleurInscription{
    private ViewInscription viewInscription;
    private EtudiantService etudiantService;


    public ControleurInscription(ViewInscription viewInscription, EtudiantService etudiantService){
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