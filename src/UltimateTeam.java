import java.util.ArrayList;

public class UltimateTeam {

    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){

        this.players = players;
        this.coaches = coaches;

    }

    public String getCutters(){

        String cutters = " ";
        for(UltimatePlayer n: players){
            if(n.getPosition().equals("cutters")){
                cutters = cutters + n.toString() + "\n" +"\n";
            }
        }
        return cutters;

    }

    public String getHandlers(){

        String handlers = " ";
        for(UltimatePlayer n: players){
            if(n.getPosition().equals("handlers")){
                handlers = handlers + n.toString() + "\n" +"\n";
            }
        }
        return handlers;

    }

    public String toString(){

        String additional = "";

        String coach = "COACHES" + "\n";
        for(Coach c: coaches){
            coach = coach + c.toString() + "\n" + "\n";
        }

        String player = "PLAYERS" + "\n";
        for(UltimatePlayer n: players){
            player = player + n.toString() + "\n" +"\n";
        }

        additional += coach + player;

        return additional;

    }

}
