import java.util.*;

public class VotingSystem {
    private ArrayList<Voting> votinglist;
    
    public VotingSystem(){
        votinglist=new ArrayList<Voting>();
    }
    
    public void createVoting(String question,int type){}
    
    public void printListOfVoting(){
       for(Voting v:votinglist){
            v.getQuestion();
        } 
    }
    
    public void printVoting(int num){
        for(int i=0;i<votinglist.size();i++){
            if(votinglist.get(i).getVotingNum()==num){
                votinglist.get(i).getQuestion();
            }
        }
    }
    
    public void vote(){}
    
    public void printResult(){
        for(Voting v:votinglist){
            v.printVotes();
        }
    }
    
}
