public class UltimatePlayer extends Player{

    private static int jerseyNumber;
    private int jersey;
    private String position;
    
    public UltimatePlayer(){

        super();
        jersey = 0;
        position = "cutter";

    }
    
    public UltimatePlayer(String firstName, String lastName, String position){

        super();
        if(position.equals("cutter") != true && position.equals("handler") != true){
            this.position = "cutter";
        } else {
            this.position = position;
        }

        jerseyNumber++;
        this.jersey = jerseyNumber;

    }

    public String getPosition(){
        return position;
    }

    public String toString(){
        return super.toString() + "\n" + " Jersey #: " + jersey + "\n" + " Position: " + position;
    }

}
