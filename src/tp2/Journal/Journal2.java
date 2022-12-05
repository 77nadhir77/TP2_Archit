package tp2.Journal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Journal2 implements IJournal{

    @Override
    public void outPut_Msg(String message) {
       
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("filename.txt", true));
            bw.write(message);
            bw.newLine();
            bw.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally { 
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ioe2) {
                    ioe2.printStackTrace();
                }
            }
        }
        
    }



}
