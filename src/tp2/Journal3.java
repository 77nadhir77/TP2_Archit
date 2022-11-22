package tp2;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Journal3 implements IJournal{

    @Override
    public void outPut_Msg(String message) {
        
        String className = this.getClass().getName();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();


        System.out.println("\t" + "g�n�rer par la classe: "+ className +" , "+"Le : "+dateFormat.format(date));
        
    }
    
}
