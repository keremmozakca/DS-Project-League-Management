package com.mycompany.leaguemanagementproject;
public class PBinarySearchTree {
    Player root;
    
    public PBinarySearchTree(){
        this.root = null;
    }
    
    public void insert(Player p){
        if(root == null){
            this.root = p;
            return;
        }
        else{
            Player current = this.root;
            Player parent  = null;
            
            while(true){
                parent = current;
                if(current.playerID > p.playerID){
                    current = current.leftPlayer;
                    if(current == null){
                      parent.leftPlayer = p;
                      return;
                    }
                }else if(current.playerID < p.playerID){
                    current = current.rightPlayer;
                    if(current == null){
                        parent.rightPlayer = p;
                        return;
                    }
                } else{
                    return;
                }
                
            }
            
            
        }
    }

    public Player findPlayerByBinarySearchTree(int playerId){
        Player current = this.root;
        
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
