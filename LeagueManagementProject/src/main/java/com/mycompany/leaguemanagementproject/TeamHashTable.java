package com.mycompany.leaguemanagementproject;
public class TeamHashTable {
    public Team[] table;
    public int prime;
    public int size;
    
    public TeamHashTable(int capacity){
        this.prime = 23;
        
        this.table = new Team[capacity];
        
        for(int i = 0; i < capacity; i++){
            table[i] = null;
        }
        
        size = 0;
    }
    
    public void putLinear(Team t){
        int index = hash(t.shortName);
        int originalIndex = index;
        
        while(table[index]!= null){
            if(t.equals(table[index])){
                System.out.println("Shortname already exist: " + t.shortName);
                return;
            }
            index = (index + 1) % table.length;
            if(index == originalIndex){
                System.out.println("Team table is full");
                return;
            }
        }
        
        table[index] = t;
        size++;
    }
    
    public int hash(String shortName){
        int sumHash = 0;
        for(int i = shortName.length() - 1; i > -1; i--){
            int ch = (int)(shortName.charAt(i));
            sumHash += ch * Math.pow(32, shortName.length() - 1 - i);
        }
        
        return (sumHash % this.table.length) % this.prime;
    }
    
    public void displayTeamTable(){
        System.out.println("Team Table:");
        for(int i = 0; i < this.table.length; i++){
            System.out.println(i + ": " + (table[i] != null ? table[i].teamName : "null"));
        }
    }
}
