package com.mycompany.leaguemanagementproject;
public class MQueue {
    public Match front;
    public Match rear;
    public int size;
    public int currentWeek;
    private int matchCount;
    
    public MQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.currentWeek = 0;
        this.matchCount = 0;
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
            if(++this.matchCount == 9){
                this.matchCount = 0;
                this.currentWeek++;
            }
            return rFront;
        }
    }
    
   public void printQueue() {
        if (!isEmpty()) {
            Match current = this.front; 
            int weekCounter = currentWeek; 
            int matchesPerWeek = 9; 
            int matchCounter = 0; 

            int totalMatchesPlayed = this.size - matchCounter; 
            int remainingMatchesInCurrentWeek = totalMatchesPlayed % matchesPerWeek;

            if (remainingMatchesInCurrentWeek > 0) {
                System.out.println("\nWEEK " + (weekCounter + 1) + "\n");
                for (int i = 0; i < remainingMatchesInCurrentWeek && current != null; i++) {
                    System.out.println(current.home.teamName + " and " + current.away.teamName);
                    current = current.nextMatch; 
                    matchCounter++; 
                }
                weekCounter++; 
            }       
            
            while (current != null) {            
                System.out.println("\nWEEK " + (weekCounter + 1) + "\n");
                for (int i = 0; i < matchesPerWeek && current != null; i++) {
                    System.out.println(current.home.teamName + " and " + current.away.teamName);
                    current = current.nextMatch; 
                    matchCounter++; 
                }
                weekCounter++; 
            }
        }
        System.out.println("");
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
}
