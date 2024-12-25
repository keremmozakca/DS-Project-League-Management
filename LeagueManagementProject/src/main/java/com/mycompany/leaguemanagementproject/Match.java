
package com.mycompany.leaguemanagementproject;

public class Match extends Node{
    
    public Team home;
    public Team away;
    
    public Match nextMatch;
    
    public Match(Team home, Team away){
        this.home = home;
        this.away = away;
        this.next = null;
    }
    
    public void playMatch(Team home, Team away){
        int shotNumber = (int)(Math.random() * 10);
     
        Player homeGoalKeeper;
        Player awayGoalKeeper;
        
        double minValueForHomeKeeper = (homeGoalKeeper.value * 0.4) + (home.advantage * 0.6);
        double minValueForAwayKeeper = (awayGoalKeeper.value * 0.4) + (away.advantage * 0.6);
        
        int awayScore = 0;
        int homeScore = 0;
        
        for(int i = 1; i < shotNumber + 1; i++){
            //Player bulma kısmı eklenecek.
            Player homePlayer;
            Player awayPlayer;
            
            double minValueForHomePlayer = (homePlayer.value * 0.4) + (home.advantage * 0.6);
            double minValueForAwayPlayer = (awayPlayer.value * 0.4) + (away.advantage * 0.4);
            
            double rndValueForAwayPlayer = (Math.random() * ((100 - minValueForAwayPlayer) + 1)) + minValueForAwayPlayer;
            double rndValueForHomePlayer = (Math.random() * ((100 - minValueForHomePlayer) + 1)) + minValueForHomePlayer;
            double rndValueForHomeKeeper = (Math.random() * ((100 - minValueForHomeKeeper) + 1)) + minValueForHomeKeeper;
            double rndValueForAwayKeeper = (Math.random() * ((100 - minValueForAwayKeeper) + 1)) + minValueForAwayKeeper;
            
            if(i % 2 == 1){
                if(rndValueForHomePlayer > rndValueForAwayKeeper){
                    homeScore++;
                    System.out.println(homeScore + " " + awayScore);
                }
                else{
                    System.out.println(homeScore + " " + awayScore);
                }
            }
            else{
                if(rndValueForAwayPlayer > rndValueForHomeKeeper){
                    awayScore++;
                    System.out.println(homeScore + " " + awayScore);
                }
                else{
                    System.out.println(homeScore + " " + awayScore);
                }
            }
        }
    }
}
