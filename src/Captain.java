public class Captain extends UltimatePlayer{

    private boolean type;

    public Captain(){

        super();
        type = false;

    }

    public Captain(String firstName, String lastName, String position, boolean type){

        super(firstName, lastName, position);
        this.type = type;

    }

    public String toString() {
        if (type == true) {
            return super.toString() + "\n" + " Captain: " + "offense";
        } else {
            return super.toString() + "\n" + " Captain: " + "defense";
        }
    }
}
