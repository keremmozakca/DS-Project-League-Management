package com.mycompany.leaguemanagementproject;
import java.util.Scanner;
public class LeagueManagementProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SuperLeagueManagement league25 = new SuperLeagueManagement(); 
        
        /*
        String log = input.nextLine();
                    Team teamSearched = league25.findTeam(log);
                    if(teamSearched != null){
                        System.out.println("Team: "+ teamSearched.teamName);
                        System.out.println("Short Name: "+ teamSearched.shortName);
                        System.out.println("Advantage: "+ teamSearched.advantage);
                        System.out.println("Total Point: "+ teamSearched.totalPoint);
                        System.out.println("Goaldiff: "+ teamSearched.goalDiff);
                        System.out.println("");
                        System.out.println("    PLAYERS / IDs   ");
                        System.out.println("--------------------");                        
                        teamSearched.playertree.printPostorder(teamSearched.playertree.root);
                        System.out.println("\nWould you like to show all details about players? (y/n)");
                        log = input.nextLine();
                        if(log.toLowerCase().equals("y")){
                            System.out.print("\nSEARCH PLAYER: ");
                            int log_ = input.nextInt();
                            Player player_ = teamSearched.playertree.findPlayerByBinarySearchTree(log_);
                            if(player_ != null){
                                System.out.println("Player Name: "+ player_.playerName);
                                System.out.println("Player ID: "+ player_.playerID);
                                System.out.println("Position: "+ player_.position);
                                System.out.println("Value: "+ player_.value);
                                System.out.println("Goals: "+ player_.goals + "\n");
                            }else{
                                System.out.println("No Player.");
                            }
                        }else{
                        }
                    }else{
                        System.out.println("It is not found.");
                    }
        */
        
        
        
        while(true){
            System.out.println("Welcome to the League Management System! Plese select a operation.\n");
            if(!league25.matchQueue.isEmpty()){
                System.out.println("NEXT MATCH: " + league25.matchQueue.front.home.teamName + " - " + league25.matchQueue.front.away.teamName + "\n");
            }            
            System.out.println("- Enter 1 to play match.");
            System.out.println("- Enter 2 to view leader table.");
            System.out.println("- Enter 3 to view all teams.");
            System.out.println("- Enter 4 to find team.");
            System.out.println("- Enter 5 to show fixture.");
            System.out.println("- Enter 6 to play all matches.");
            System.out.println("- Enter 7 to exit from the system.");
           
            int choice = input.nextInt();            
            //input.nextLine();           
            switch(choice){
                case 1 -> {
                    while(true){
                        System.out.println("Enter for next match.(Any key for main menu)");
                        String log = input.nextLine();
                        if(log.isEmpty()){
                            league25.PlayNextMatch();
                        }
                        else
                            break;
                    }
                    continue;
                }
                case 2 -> league25.showLeaderTable();
                case 3 -> league25.printArr(league25.teams);
                case 4 -> {
                    System.out.println("SHORT NAMES FOR TEAMS");
                    System.out.println("---------------------");
                    for(int i = 0; i < league25.teams.length; i++){
                        System.out.println(league25.teams[i].teamName + " : " + 
                                           league25.teams[i].shortName);
                    }
                    System.out.print("\nSEARCH A TEAM WITH SHORT NAME: ");
                    String log = input.nextLine();
                    Team teamSearched = league25.findTeam(log);
                    if(teamSearched != null){
                        System.out.println("Team: "+ teamSearched.teamName);
                        System.out.println("Short Name: "+ teamSearched.shortName);
                        System.out.println("Advantage: "+ teamSearched.advantage);
                        System.out.println("Total Point: "+ teamSearched.totalPoint);
                        System.out.println("Goaldiff: "+ teamSearched.goalDiff);
                        System.out.println("");
                        System.out.println("    PLAYERS / IDs   ");
                        System.out.println("--------------------");                        
                        teamSearched.playertree.printPostorder(teamSearched.playertree.root);
                        System.out.println("\nWould you like to show all details about players? (y/n)");
                        log = input.nextLine();
                        if(log.toLowerCase().equals("y")){
                            System.out.print("\nSEARCH PLAYER: ");
                            int log_ = input.nextInt();
                            Player player_ = teamSearched.playertree.findPlayerByBinarySearchTree(log_);
                            if(player_ != null){
                                System.out.println("Player Name: "+ player_.playerName);
                                System.out.println("Player ID: "+ player_.playerID);
                                System.out.println("Position: "+ player_.position);
                                System.out.println("Value: "+ player_.value);
                                System.out.println("Goals: "+ player_.goals + "\n");
                                continue;
                            }else{
                                System.out.println("No Player.");
                                continue;
                            }
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("It is not found.");
                    }
                }
                case 5 -> {
                    league25.matchQueue.printQueue();
                    continue;
                }
                case 6 -> {
                    while(!league25.matchQueue.isEmpty()){
                        league25.PlayNextMatch();
                    }
                }
                case 7 -> {
                    System.out.println("Existing...");
                    input.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
        //
    }
    
}
