package com.mycompany.leaguemanagementproject;
public class Team{
    public String teamName;
    public int teamId;
    public playerList teamPlayers;
    
    public int totalPoint;
    public int goalDiff;
    
    public int advantage;
    public Team nextTeam;
    
    public Team(String teamName, int teamId, int advantage){
        this.teamName = teamName;
        this.teamId = teamId;
        this.totalPoint = 0;
        this.goalDiff = 0;
        this.advantage = advantage;
        this.teamPlayers = new playerList();
    }
    
    public void updateTeam(int totalPoint, int goalDiff){
        //this.totalPoint = updateTotalPoint();
        //this.goalDiff = updateGoalDiff();
    }
    
    public void updateTeamName(String teamName){
        this.teamName = teamName;
    }
    
    public void newPlayerProfile(String name, int ID, String position, int value){      
        this.teamPlayers.newPlayer(new Player(name, ID, position, value));
    }
    
    public Player findPlayer(String position){
        Player current = this.teamPlayers.head;
        while(current.nextPlayer != null){
            if(current.position == position){
                return current;
            }
            current = current.nextPlayer;
        }
        return null;
    }
    
    public Player findPlayer(){
        int rnd = (int)(Math.random() * 12);
        //System.out.println("Random number: " + rnd);
        Player current = this.teamPlayers.head;
        int i = 0;
        while(current.nextPlayer != null){
            if(rnd == i){
                break;
            }
            current = current.nextPlayer;
            i++;
        }
        return current;
    }
}
