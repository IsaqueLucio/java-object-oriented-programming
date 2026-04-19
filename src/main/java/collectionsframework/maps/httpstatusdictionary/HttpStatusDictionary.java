package collectionsframework.maps.httpstatusdictionary;

import java.util.HashMap;
import java.util.Map;

public class HttpStatusDictionary {
    
    private Map<Integer,String> dicionary = new HashMap<>();

    public void addStatus(Integer code, String description){
        if(code==null || description==null){
            System.out.println("The code or the description cannot be null");
        } else{
            dicionary.put(code, description);
            System.out.println("Status "+code+" added.");
        }
    }

    public void lookUpStatus(Integer code){
        if(dicionary.get(code) == null){
            System.out.println("Error: Status code "+code+" not found");
        } else{
            System.out.println("Code "+code+" means: "+dicionary.get(code));
        }
    }




}
