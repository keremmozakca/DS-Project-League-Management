
package com.mycompany.leaguemanagementproject;

public class Match {
    
    public Team home;
    public Team away;
    public Match next;
    
    public Match(Team home, Team away){
        this.home = home;
        this.away = away;
        this.next = null;
    }
    
    public void playMatch(){
        
    }
}
