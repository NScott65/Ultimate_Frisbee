public class Captain extends UltimatePlayer{

    boolean type;

    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
        setType(type);
    }

    public void setType(boolean type){
        this.type = type;
    }

    public boolean getType(){
        return type;
    }

    public int throwDisc(int pow){
        if(pow >= 1 && pow <= 10) {
            pow *= 5;
        }else{
            pow = 1;
        }
        return pow;
    }

    public String toString(){
        String sType = " ";

        if(type){
            sType = "offense";
        }else if(!type){
            sType = "defense";
        }
        return super.toString() + "\n   Capatain: " + sType;
    }


}
