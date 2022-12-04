package tp2;
import java.awt.event.ActionListener;


public interface IViewInscription {


    public void addSubmitEvent(ActionListener a);


    public String getNom();

    public String getPrenom();

    public String getMatricule();

    public String getEmail();

    public String getPwd();

    public String getIdUniversite();
}
