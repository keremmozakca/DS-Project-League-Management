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
            this.rear.next = m;
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
            this.front = this.front.next;
            size--;
            return rFront;
        }
    }
    
    public void printQueue(){
        if(!isEmpty()){
            Match current = this.front;
            while(current != null){
                System.out.print(current.home + (current.next != null ? " -> " : ""));
                current = current.next;
            }
            System.out.println();
        }
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
}
