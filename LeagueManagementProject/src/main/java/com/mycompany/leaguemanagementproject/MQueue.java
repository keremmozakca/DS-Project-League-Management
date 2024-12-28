package com.mycompany.leaguemanagementproject;
public class MQueue {
    public Match front;
    public Match rear;
    public int size;
    
    public MQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    public void enqueue(Team home, Team away){
        Match m = new Match(home, away);
        
        if(this.rear == null){
            this.rear = m;
            this.front = m;
        }
        else{
            this.rear.nextMatch = m;
            this.rear = m;
        }
        
        size++;
    }
    
    public Match dequeue(){
        if(this.front == null){
            System.out.println("Queue is empty.");
            return null;
        }
        else{
            Match rFront = this.front;
            this.front = this.front.nextMatch;
            size--;
            return rFront;
        }
    }
    
    public void printQueue(){
        if(!isEmpty()){
            Match current = this.front;
            int weekCounter = 0;
            int matchCounter = 0;
            while(current != null){
                if(matchCounter % 9 == 0){
                    System.out.println("\nWEEK " + ((weekCounter + 1)) + "\n");
                    weekCounter++;
                }
                System.out.println(current.home.teamName + " and " + current.away.teamName);
                //(current.next != null ? " -> " : ""));
                current = current.nextMatch;
                matchCounter++;
            }
            System.out.println();
        }
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
}
