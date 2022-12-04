package tp2;


import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ViewInscription extends JFrame implements IViewInscription{

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
        frame.setResizable(true);
        frame.getContentPane().setLayout(null);

        this.panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);

        frame.setContentPane(panel);


        JLabel matriculeLabel = new JLabel("Matricule"); 
        matriculeLabel.setBounds(10, 30, 200, 20);
        matricule = new JTextField();
        matricule.setBounds(90,30,300,20);
        panel.add(matricule);

        JLabel nomLabel = new JLabel("Nom"); 
        nomLabel.setBounds(10, 50, 200, 20);
        nom = new JTextField();
        nom.setBounds(90,50,300,20);
        panel.add(nom);

        JLabel prenomLabel = new JLabel("Prenom"); 
        prenomLabel.setBounds(10, 70, 200, 20);
        prenom = new JTextField();
        prenom.setBounds(90,70,300,20);
        panel.add(prenom);

        JLabel emailLabel = new JLabel("Email"); 
        emailLabel.setBounds(10, 90, 200, 20);
        email = new JTextField();
        email.setBounds(90, 90, 300, 20);
        panel.add(email);

        JLabel pwdLabel = new JLabel("Mot de passe"); 
        pwdLabel.setBounds(10, 110, 200, 20);
        pwd = new JTextField();
        pwd.setBounds(90, 110, 300, 20);
        panel.add(pwd);

        JLabel universiteLabel = new JLabel("unviversite"); 
        universiteLabel.setBounds(10, 130, 200, 20);
        id_universite = new JTextField();
        id_universite.setBounds(90,130,300,20);
        panel.add(id_universite);

    
        submitBtn = new JButton("Valider");
        submitBtn.setBounds(110, 160, 200,100);
        panel.add(submitBtn);


        panel.add(matriculeLabel);
        panel.add(nomLabel);
        panel.add(prenomLabel);
        panel.add(emailLabel);
        panel.add(matriculeLabel);
        panel.add(pwdLabel);
        panel.add(universiteLabel);

        
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
