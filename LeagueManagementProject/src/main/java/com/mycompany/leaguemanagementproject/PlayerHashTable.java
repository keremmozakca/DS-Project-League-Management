package com.mycompany.leaguemanagementproject;
public class PlayerHashTable {
    public int[] table;
    public int prime;
    public int size;
    
    public PlayerHashTable(int capacity){
        this.prime = 19;
        
        this.table = new int[capacity];
        
        for(int i = 0; i < capacity; i++){
            table[i] = -1;
        }
        
        size = 0;
    }
    
    public void putQuadratic(int key){
        int index = hash(key) % this.table.length;
        int originalIndex = index;
        int i = 1;
        
        while(table[index] != -1){
            if(table[index] == key){
                System.out.println("Key already exist: " + key);
                return;
            }
            
            index = hash(originalIndex + i * i) % this.table.length;
            i++;
            if(size == this.table.length){
                System.out.println("Player hash table is full!");
                return;
            }
        }
        this.table[index] = key;
        size++;
    }
    
    public int hash(int key){
        return key % this.prime;
    }
    
    public void displayPlayerTable(){
        System.out.println("Player Table:");
        for(int i = 0; i < this.table.length; i++){
            System.out.println(i + ": " + (table[i] != -1 ? table[i] : "null"));
        }
    }
}
