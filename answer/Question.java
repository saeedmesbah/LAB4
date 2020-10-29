import java.util.*;

public class Question {
    private String name;
    private HashMap<Integer,String> choice;
    private int counter;
    
    public Question(String name){
        this.name=name;
        choice=new HashMap<Integer,String>();
        counter=1;
    }
    
    public void addOption(String option){
        choice.put(counter, option);
        counter++;
    }
    
    public String getQuestionName(){
        return name;
    }
    
    public void questionShow(){
        System.out.println(name);
        for(Map.Entry<Integer,String> map:choice.entrySet()){
            System.out.println(map.getKey()+"-"+map.getValue());
        }
    }
}
