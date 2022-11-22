package tp2;

import java.util.ArrayList;
import java.util.List;

public class JournalComposite implements IJournal{

    private List<IJournal> list= new ArrayList<>();

    @Override
    public void outPut_Msg(String message){
        for(IJournal j : list){
            j.outPut_Msg(message);
        }
    }


    public void addIJournal(IJournal object){
        list.add(object);
    }

    
}
