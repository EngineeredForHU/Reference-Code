package OOP.TeamMenuApp;

//Entry point to the program
public class TeamMenu {

    public static void main(String[] args) {

        //created two instances of player called P1 and P2
        Player p1 = new Player("Angel","LB","Strong\n");
        Player p2 = new Player("Joe","QB","Arm Strength");

        //created an instance of Team called team1 with the name Cardinals
        Team team1 = new Team("Cardinals\n");

        //added instances of P1 and P2 to team
        team1.addPlayer(p1);
        team1.addPlayer(p2);

        //called the described method in Team to describe the players in that respective team in this case team1
        team1.describe();

        team1.removePlayer("Joe");
        team1.describe();
    }
}
