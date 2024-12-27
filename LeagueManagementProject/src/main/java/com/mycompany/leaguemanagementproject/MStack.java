package com.mycompany.leaguemanagementproject;
public class MStack {
    public Match[] matchResults;
    private Team[] teams;
    public int top;
    public int top_;
    
    public MStack(int size){
        this.matchResults = new Match[size];
        teams = new Team[size];
        this.top = -1;
        this.top_ = 0;
    }
    
    public void push(Match m){
        if(this.isFull()){
            System.out.println("Stack is full!");
        }
        else{
            top++;
            matchResults[top] = m;
        }
    }
    
    //@Override
    public void push_(Team team){
        if(top_ + 1 < this.teams.length){
            teams[top_++] = team;
        }
    }
    
    public Match pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }
        else{
            return matchResults[top--];
        }
    }
    //Override
    public Team pop_(){
        if(top_ > 0){
            return teams[top_--]; 
        }
        return null;
    }
    
    public boolean isFull(){
        return top == matchResults.length - 1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public void printStack(){
        for(int i = top; i > -1; i--){
            if(i == top){
                System.out.println("");
            }
            System.out.print(matchResults[i] + " ");
        }
    }
}
