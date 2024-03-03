public class Coach extends Person{
    private String role;


    //Constructor
    public Coach(String firstName, String lastName, String role){
        super(firstName, lastName);
        setRole(role);
    }

    //Mutators
    public void setRole(String role){
        this.role = role;
    }

    //Accessors
    public String getRole(){
        return role;
    }

    public String toString(){
        String s = "";
        s += super.toString() + "\n   Role: " + getRole();

        return s;
    }
}
