
import java.util.*;



public class Vote {
    private Person person;
    private ArrayList<Integer> choices;
    
    
    public Vote(Person person){
        this.person=person;
        choices=new ArrayList<Integer>();
    }
    
    public Person getPerson(){
        return person;
    }
    
    
    public void chooseOption(ArrayList<Integer> num){
        choices=num;
    }
    
    public void showVotersInfo(){
        System.out.println("First Name: "+person.getFistName());
        System.out.println("Last Name: "+person.getLastName());
        printDate();
        for(Integer i:choices){
            System.out.println("Option-"+i.intValue());
        }
        
    }
    
    public void printDate() {
        Date date=new Date();
        int gd=date.getDate();
        int gm=(date.getMonth()+1);
        int gy=date.getYear();
        int[] g_d_m = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
        int gy2 = (gm > 2) ? (gy + 1) : gy;
        int days = 355666 + (365 * gy) + ((int) ((gy2 + 3) / 4)) - ((int) ((gy2 + 99) / 100)) + ((int) ((gy2 + 399) / 400)) + gd + g_d_m[gm - 1];
        int jy = -1595 + (33 * ((int) (days / 12053)));
        days %= 12053;
        jy += 4 * ((int) (days / 1461));
        days %= 1461;
        if (days > 365) {
            jy += (int) ((days - 1) / 365);
            days = (days - 1) % 365;
        }
        int jm = (days < 186) ? 1 + (int) (days / 31) : 7 + (int) ((days - 186) / 30);
        int jd = 1 + ((days < 186) ? (days % 31) : ((days - 186) % 30));
        int[] jalali = { jy, jm, jd };
        System.out.println("Date: "+jy+"/"+jm+"/"+jd);
    } 
    
}
