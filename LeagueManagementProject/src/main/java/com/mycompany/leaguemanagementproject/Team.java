package com.mycompany.leaguemanagementproject;
public class Team{
    public String teamName;
    public String shortName;
    public playerList teamPlayers;
    public PBinarySearchTree playertree;
    public Player rootPlayer;
    
    public int totalPoint;
    public int goalDiff;
    
    public int advantage;
    public Team nextTeam;
    
    public Team(String teamName, String shortName, int advantage){
        this.teamName = teamName;
        this.shortName = shortName;
        this.totalPoint = 0;
        this.goalDiff = 0;
        this.advantage = advantage;
        this.teamPlayers = new playerList();
        this.playertree = new PBinarySearchTree();
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
    
    public Player findPlayerByBST(int playerId){
        PBinarySearchTree tree = new PBinarySearchTree();
        Player current = tree.root;
        
        while(current != null){
            if(current.playerID == playerId){
                return current;
            }
            else if(playerId < current.playerID){
                current = current.leftPlayer;
            }
            else{
                current = current.rightPlayer;
            }
        }
        
        return null;        
    }
}
