
package com.mycompany.leaguemanagementproject;

public class playerList{   
    
    Player head;
    
    public playerList(){
        this.head = null;
    }
    
    public void newPlayer(Player player){
        if(this.head == null){
            this.head = player;
        }else{
            Player current = head;
            while(current.nextPlayer != null){
                current = current.nextPlayer;
            }
            current.nextPlayer = player;
        }
    }
    
}
