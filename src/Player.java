public class Player {

    private String firstName;
    private String lastName;

    public Player(){
        firstName = "Unknown";
        lastName = "Unknown";
    }

    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        String name = firstName + " " + lastName;
        return name;
    }

}
