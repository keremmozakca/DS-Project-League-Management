package com.mycompany.leaguemanagementproject;

public class Player{
    
    public String playerName;
    public int playerID;
    public String position;
    public int goals;
    
    public int value;
    public Player nextPlayer;
    
    public Player(String playerName, int id, String position, int value){
        this.playerName = playerName;
        this.playerID = id;
        this.position = position;
        this.goals = 0;
        this.value = value;
    }
    
    public void updatePlayerName(String new_name){
        this.playerName = new_name;
    }
    
    public void updatePosition(String new_position){
        this.position = new_position;
    }
    
    public void updateGoals(int newGoal){
        this.goals = newGoal;
    }
    
    public void addGoal(){
        this.goals++;
    }
}
