package OOP.TeamMenuApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team {

    //list to hold the players in the team
    private List<Player> players = new ArrayList<Player>();
    //String to hold the players name on the team
    private  String name;

    //constructor
    public Team(String name){
        this.name = name;
    }

    public void describe(){
        System.out.println("Team Name: " + name);
        //loops through the player list and prints out the describe method for each player
        for (Player player:players){
            //grabs the describePlayer method in player
            player.describePlayer();
        }
    }

    //Adds a player to the player list
    public void addPlayer(Player addPlayer){
        players.add(addPlayer);

    }

    public void removePlayer(String playerName){

        // Use an iterator to safely remove elements from the list while iterating
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getName().equals(playerName)) {
                iterator.remove(); // safely removes the player
            }
        }
    }


//-------------------------------------------------------------------------------
    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
