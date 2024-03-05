public class UltimatePlayer extends Person{
    int jerseyNumber;
    static int jerseyNumberCounter = 0;
    String position;

    public UltimatePlayer(String firstName, String lastName, String position){
        super(firstName, lastName);
        setJerseyNumber();
        setPosition(position);
    }

    public int throwDisc(int pow){
        if(pow >= 1 && pow <= 10) {
            pow *= 4;
        }else{
            pow = 1;
        }
        return pow;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setJerseyNumber(){
        this.jerseyNumber = jerseyNumberCounter;
        jerseyNumberCounter++;
    }

    public String getPosition(){
        return position;
    }

    public int getJerseyNumber(){
        return jerseyNumber;
    }

    public String toString(){
        return super.toString() + "\n  Jersey #: " + getJerseyNumber() + "\n  Position: " + getPosition();
    }


}
