package com.mycompany.leaguemanagementproject;
import java.util.Scanner;
public class LeagueManagementProject {

    public static void main(String[] args) {
        SuperLeagueManagement s = new SuperLeagueManagement();
        //s.matchQueue.printQueue();
        
        s.PlayNextMatch();
        System.out.println("");
        s.PlayNextMatch();
        
        /*TeamHashTable table = new TeamHashTable(41);
        Team t1 = new Team("Galatasaray", "GS", 100);
        Team t2 = new Team("Fenerbahçe", "FB", 99);
        Team t3 = new Team("Beşiktaş", "BJK", 98);
        Team t4 = new Team("AdanaSpor", "ADS", 97);
        Team t5 = new Team("KonyaSpor", "KS", 96);

        table.putLinear(t1);
        table.displayTeamTable();
        table.putLinear(t2);
        table.displayTeamTable();
        table.putLinear(t3);
        table.displayTeamTable();
        table.putLinear(t4);
        table.displayTeamTable();
        table.putLinear(t5);
        table.displayTeamTable();*/
        
        /*Player p1 = new Player("Ali", 1, "GoalKeeper", 100);
        Player p2 = new Player("Ahmet", 2, "dsdasds", 100);
        Player p3 = new Player("Cabbar", 3, "adsasdasd", 100);
        Player p4 = new Player("Yasin", 4, "adasdasdasd", 100);
        Player p5 = new Player("Niyazi", 5, "dasdasdasdas", 100);
        
        PBinarySearchTree tree = new PBinarySearchTree();
        tree.insert(p1);
        tree.insert(p2);
        tree.insert(p3);
        tree.insert(p4);
        tree.insert(p5);
        
        String a = tree.findPlayerByBinarySearchTree(3);
        System.out.println(a);*/
        
        /*
        MaxHeap heap = new MaxHeap(15);
        
        heap.insert(0);
        heap.insert(40);
        heap.insert(4);
        heap.insert(4);
        heap.insert(32);
        heap.insert(24);
        heap.insert(2);
        heap.insert(3);
        heap.insert(11);
        heap.insert(12);
        heap.insert(100);
        heap.insert(1);
        
        heap.printHeapSorted();
        
        */
        
        
        /*
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Welcome to the League Management System! Plese select a operation.");
            System.out.println("Enter 1 to play match.");
            System.out.println("Enter 2 to view leader table.");
            System.out.println("Enter 3 to view all teams.");
            System.out.println("Enter 4 to find player.");
            System.out.println("Enter 5 to exit from the system.");
            
            int choice = sc.nextInt();            
            sc.nextLine();
            
            switch(choice){
                case 1:
                    s.PlayNextMatch();
                    while(true){
                        System.out.println("Enter for next match.");
                        String input = sc.nextLine();
                        if(input.isEmpty()){
                            s.PlayNextMatch();
                        }
                        else
                            break;
                        }
                    break;
                case 2:
                    System.out.println("Lider tablosunu görüntüleme işlemi gelecek");
                    break;
                case 3:
                    System.out.println("Hash map ile ilgili taraf gelecek superleaguemanagementte eklenip");
                    break;
                case 4:
                    System.out.println("Binary search three player ile ilgili taraf gelecek superleaguemanagementte eklenip");
                    break;
                case 5:
                    System.out.println("Existing...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        */
        
        
        while(!s.matchQueue.isEmpty()){
            s.PlayNextMatch();
        }
        
        s.showLeaderTable();
    }
    
}
