import java.util.*;

public class Voting {
    
    private HashMap<Question,HashSet<Vote>> choice;
    private int type;
    private ArrayList<Person> voters;
    private int votingNum;
    private HashSet<Vote> allVotes;
    
    public Voting(int type,int votingNum,Question question){
        this.type=type;
        this.votingNum=votingNum;
        choice=new HashMap<Question,HashSet<Vote>>();
        allVotes=new HashSet<Vote>();
    }
    
    public void getQuestion(){
        for(Map.Entry<Question,HashSet<Vote>> set:choice.entrySet()){
            set.getKey().questionShow();
        }
    }
    
    public int getVotingNum(){
        return votingNum;
    }
    
    public void creatChoice(String name,String option){
        for(Map.Entry<Question,HashSet<Vote>> set:choice.entrySet()){
            if(set.getKey().getQuestionName().equals(name)){
                set.getKey().addOption(option);
            }
        }
        
    }
    
    public void vote(Person person,ArrayList<Integer> s,Question question){
        Vote v=new Vote(person);
        v.chooseOption(s);
        allVotes.add(v);
        choice.put(question,allVotes);
    }
    
    public void getVoters(){
        for(Person p:voters){
            System.out.println(p.toString());
        }
    }
    
    public void printVotes(){
        for(Map.Entry<Question,HashSet<Vote>> map: choice.entrySet()){
            map.getKey().questionShow();
            for(Vote set:map.getValue()){
                set.showVotersInfo();
            }
        }
    }
    
    
}
