package tp2;


import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ViewInscription extends JFrame{

    private JFrame frame;
    private JPanel panel;
    private JTextField matricule;
    private JTextField nom;
    private JTextField prenom;
    private JTextField email;
    private  JTextField pwd;
    private JTextField id_universite;
    private JButton submitBtn;

    
    public ViewInscription(){

        this.frame = new JFrame();
        frame.setBounds(300,300, 450, 350);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);

        this.panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);

        frame.setContentPane(panel);


        JLabel matriculeLabel = new JLabel("Matricule"); 
        matricule = new JTextField();
        panel.add(matricule);

        JLabel nomLabel = new JLabel("Nom"); 
        nom = new JTextField();
        panel.add(nom);

        JLabel prenomLabel = new JLabel("Prénom"); 
        prenom = new JTextField();
        panel.add(prenom);

        JLabel emailLabel = new JLabel("Emai."); 
        email = new JTextField();
        panel.add(email);

        JLabel pwdLabel = new JLabel("Mot de passe"); 
        pwd = new JTextField();
        panel.add(pwd);

        JLabel universiteLabel = new JLabel("Matricule unviversite"); 
        id_universite = new JTextField();
        panel.add(id_universite);

    
        submitBtn = new JButton("Valider");
        panel.add(submitBtn);


        panel.add(matriculeLabel);
        panel.add(nomLabel);
        panel.add(prenomLabel);
        panel.add(emailLabel);
        panel.add(matriculeLabel);
        panel.add(pwdLabel);
        panel.add(universiteLabel);

        


    }


    public void getForm(){
        this.frame.setVisible(true);
    }


    public void addSubmitEvent(ActionListener a){
        this.submitBtn.addActionListener(a);
    }


    public String getNom(){
        return this.nom.getText();
    }

    public String getPrenom(){
    return this.prenom.getText();
    }

    public String getMatricule(){
        return this.matricule.getText();
    }

    public String getEmail(){
        return this.email.getText();
    }

    public String getPwd(){
        return this.pwd.getText();
    }

    public String getIdUniversite(){
        return this.id_universite.getText();
    }








}
