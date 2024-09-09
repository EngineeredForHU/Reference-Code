package OOP.TeamMenuApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Entry point to the program
public class TeamMenu {
    static Scanner scanner = new Scanner (System.in);
    //List of the teams
    static List<Team> teams = new ArrayList<Team>();

    public static void main(String[] args) {
        //Menu-driven APP to work with other classes
        int decision = 0;

        while (true){
            printOptions();
            decision = scanner.nextInt();
            if (decision == 1){
                //adds whatever team is created with the creatNewTeam to the team List
               teams.add(createNewTeam());
            } else if (decision == 2) {
                addPlayerToTeam();
            }else if (decision == 3){
                removePlayerFromTeam();
            } else if (decision == 4) {
                describeTeam();
            }else {
                System.out.println("Please pick a valid option! ");
            }
        }
    }




    private static void describeTeam(){
        printTeamNames();
        System.out.print("which team would you like to see? ");
        String teamName = scanner.next();
        try {
            Team foundTeam = findTeamByName(teamName);
            foundTeam.describe();
        }catch (Exception e){
            System.out.print(e.toString());
        }
    }
    private static void printOptions(){
        System.out.println("\n1.) Create new team");
        System.out.println("2.) Add new player to team");
        System.out.println("3.) Remove player from team");
        System.out.println("4.) View team INFO");
    }
    private static Team createNewTeam(){
        System.out.print("Enter the name of your team: ");
        String name = scanner.next();
        return new Team(name);
    }
    private static void addPlayerToTeam(){
        printTeamNames();
        System.out.print("Enter the name of the team you wish to add a player to: ");
        String teamName = scanner.next();
       try {
           Team foundTeam = findTeamByName(teamName);
           foundTeam.addPlayer(createNewPlayer());
       }catch (Exception e){
           System.out.println(e.toString());
       }
    }
    private static void removePlayerFromTeam(){
        printTeamNames();
        System.out.print("Enter the name of the team you wish to remove player from:" );
        String teamName = scanner.next();
        try {
            Team foungTeam = findTeamByName(teamName);
            foungTeam.describe();
            System.out.println("Which player would you like to remove? ");
            String playerName = scanner.next();
            foungTeam.removePlayer(playerName);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    private static Player createNewPlayer(){
        System.out.print("Enter player name: ");
        String name = scanner.next();

        System.out.print("Enter Player position: ");
        String position = scanner.next();

        System.out.print("Enter player specialty: ");
        String specialty = scanner.next();

        return new Player(name,position,specialty);
    }
    private static void printTeamNames(){
        //prints the names of the teams
        for (Team team : teams){
            System.out.println(team.getName());
        }
    }
    private static Team findTeamByName(String name) throws Exception {
        for (Team team:teams){
            if (team.getName().equals(name)){
                return team;
            }
        }
        throw new Exception("Team not found "+name);
    }





}
