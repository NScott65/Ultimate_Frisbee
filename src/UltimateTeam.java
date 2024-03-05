import java.util.ArrayList;
public class UltimateTeam {
    static ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
    static ArrayList<Coach> coaches = new ArrayList<Coach>();

    public static void main(String[] args) {
        players.add(new UltimatePlayer("Noah","Scott","Cutter"));
        players.add(new UltimatePlayer("John","Doe","Handler"));
        players.add(new UltimatePlayer("Joe","Mamma","Cutter"));
        players.add(new UltimatePlayer("Benjamin","Dover","Handler"));
        coaches.add(new Coach("Hughe","Ganus","Head Coach"));
        coaches.add(new Coach("Lou","Sassle","Assistant Coach"));

        System.out.println(teamInfo());
    }

    public String getCutters(){
        String cutters = " ";

        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getPosition().equalsIgnoreCase("Cutter")){
                cutters += players.get(i);
            }
        }
        return cutters;
    }

    public String getHandlers(){
        String handlers = " ";

        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getPosition().equalsIgnoreCase("Handler")){
                handlers += players.get(i);
            }
        }
        return handlers;
    }

    public static String teamInfo(){
        String team = "COACHES\n";
        for(int i = 0; i < coaches.size(); i++){
            team += coaches.get(i) + "\n";
        }
        team += "PLAYERS\n";
        for(int i = 0; i < players.size(); i++){
            team += players.get(i) + "\n";
        }
        return team;
    }

}
