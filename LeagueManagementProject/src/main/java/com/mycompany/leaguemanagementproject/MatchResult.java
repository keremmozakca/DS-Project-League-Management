
package com.mycompany.leaguemanagementproject;

public class MatchResult {    
    Team homeT;
    Team awayT;
    Team winner;
    Team loser;
    
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
            loser = awayT;
            this.goalDiff = (homeScore - awayScore);
        }else if(awayScore > homeScore){
            winner = awayT;
            loser = homeT;
            this.goalDiff = (awayScore - homeScore);
        }else{
            winner = null;
        }
    }
}
