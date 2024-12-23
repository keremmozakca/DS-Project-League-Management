package com.mycompany.leaguemanagementproject;
public class Team {
    public String teamName;
    public int teamId;
    public Player headPlayer;
    public Player tailPlayer;
    public int totalPoint;
    public int goalDiff;
    
    public Team(String teamName, int teamId){
        this.teamName = teamName;
        this.teamId = teamId;
        this.headPlayer = null;
        this.tailPlayer = null;
        this.totalPoint = 0;
        this.goalDiff = 0;
    }
    
    public void updateTeam(int totalPoint, int goalDiff){
        this.totalPoint = updateTotalPoint();
        this.goalDiff = updateGoalDiff();
    }
    
    public void updateTeamName(String teamName){
        this.teamName = teamName;
    }
    
    
}
