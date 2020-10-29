
public class Person {
    
    private String firstname;
    private String lastname;
    private int age;
    
    public Person(String firstname,String lastname,int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }
    
    public boolean checkAge(){
        if(age<18){
            System.out.println("not valid for voting");
            return false;
        }
        else{
            return true;
        }
    }
    
    public String getFistName(){
        return firstname;
    }
    
    public String getLastName(){
        return lastname;
    }
    @Override
    public String toString(){
        return "First Name: "+firstname+" Last Name: "+lastname;
    }
    
}
