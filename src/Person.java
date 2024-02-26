public class Person {
    private String firstName;
    private String lastName;

    //Constructors
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Mutators (Setters)
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    //Accessors (Getters)
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int throwDisc(int pow){
        if(pow >= 1 && pow <= 10) {
            pow *= 2;
        }else{
            pow = 1;
        }
        return pow;
    }

    public String toString(){
        return "Name: " + getLastName() + ", " + getFirstName();
    }


}
