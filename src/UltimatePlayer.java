public class UltimatePlayer extends Person{
    int jerseyNumber;
    static int jerseyNumberCounter;
    String position;

    public UltimatePlayer(String firstName, String lastName, String position){
        super(firstName, lastName);
        setJerseyNumber(jerseyNumber);
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

    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
        jerseyNumberCounter++;
    }

    public String getPosition(){
        return position;
    }

    public int getJerseyNumber(){
        return jerseyNumber;
    }

    public String toString(){
        return super.toString() + "Jersey #: " + getJerseyNumber() + "Position: " + getPosition();
    }


}
