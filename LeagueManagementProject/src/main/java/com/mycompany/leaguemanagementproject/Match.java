
package com.mycompany.leaguemanagementproject;

public class Match {
    
    public Team home;
    public Team away;
    
    public Match nextMatch;
    
    public MatchResult result;
    
    public Match(Team home, Team away){
        this.home = home;
        this.away = away;
        this.nextMatch = null;
    }
    
    public void playMatch(){
        int shotNumber = 1 + (int)(Math.random() * 9);
     
        Player homeGoalKeeper = home.findPlayer("Goalkeeper");
        Player awayGoalKeeper = away.findPlayer("Goalkeeper");
        
        double minValueForHomeKeeper = (homeGoalKeeper.value * 0.4) + (home.advantage * 0.6);
        double minValueForAwayKeeper = (awayGoalKeeper.value * 0.4) + (away.advantage * 0.6);
        
        int awayScore = 0;
        int homeScore = 0;
        
        for(int i = 1; i < shotNumber + 1; i++){
            //Player bulma kısmı eklenecek.
            Player homePlayer = home.findPlayer();
            Player awayPlayer = away.findPlayer();
            
            double minValueForHomePlayer = (homePlayer.value * 0.4) + (home.advantage * 0.6);
            double minValueForAwayPlayer = (awayPlayer.value * 0.4) + (away.advantage * 0.6);
            
            double rndValueForAwayPlayer = (Math.random() * ((100 - minValueForAwayPlayer) + 1)) + minValueForAwayPlayer;
            double rndValueForHomePlayer = (Math.random() * ((100 - minValueForHomePlayer) + 1)) + minValueForHomePlayer;
            double rndValueForHomeKeeper = (Math.random() * ((100 - minValueForHomeKeeper) + 1)) + minValueForHomeKeeper;
            double rndValueForAwayKeeper = (Math.random() * ((100 - minValueForAwayKeeper) + 1)) + minValueForAwayKeeper;
            
            if(i % 2 == 1){
                System.out.println("\n>> "+ homePlayer.playerName + " from " + home.teamName + " took a shot.");
                if(rndValueForHomePlayer > rndValueForAwayKeeper){
                    homeScore++;
                    System.out.println("-> It was a goal.\n");
                    homePlayer.addGoal();
                    System.out.printf("%-5s : %-5s\n", home.teamName, away.teamName);
                    System.out.printf("%-2d : %-2d\n", homeScore, awayScore);
                }
                else{
                    System.out.println("-> Goal missed.\n");
                    System.out.printf("%-5s : %-5s\n", home.teamName, away.teamName);
                    System.out.printf("%-2d : %-2d\n", homeScore, awayScore);
                }
            }
            else{
                System.out.println("\n>> "+ awayPlayer.playerName + " from " + away.teamName + " took a shot.");
                if(rndValueForAwayPlayer > rndValueForHomeKeeper){
                    awayScore++;
                    System.out.println("-> It was a goal.\n");
                    awayPlayer.addGoal();
                    System.out.printf("%-5s : %-5s\n", home.teamName, away.teamName);
                    System.out.printf("%-2d : %-2d\n", homeScore, awayScore);
                }
                else{
                    System.out.println("-> Goal missed.\n");
                    System.out.printf("%-5s : %-5s\n", home.teamName, away.teamName);
                    System.out.printf("%-2d : %-2d\n", homeScore, awayScore);
                }
            }
        }
        saveResult(homeScore, awayScore, home, away);
        System.out.println("------------------------------------");
    }
    
    public void saveResult(int homeScor, int awayScor, Team home, Team away){
        result = new MatchResult(homeScor, awayScor, home, away);
    }
    
}
