
package com.mycompany.leaguemanagementproject;

public class MatchResult {    
    Team homeT;
    Team awayT;
    Team winner;
    
    int goalDiff;
    int homeScore;
    int awayScore;
    
    public MatchResult(int homeS, int awayS, Team home, Team away){
        this.homeScore = homeS;
        this.awayScore = awayS;
        this.homeT = home;
        this.awayT = away;
        this.goalDiff = 0;
        
        if(homeScore > awayScore){
            winner = homeT;
            this.goalDiff = (homeScore - awayScore);
        }else if(awayScore > homeScore){
            winner = awayT;
            this.goalDiff = (awayScore - homeScore);
        }else{
            winner = null;
        }
    }
}
