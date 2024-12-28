package com.mycompany.leaguemanagementproject;
public class MaxHeap {
    public int maxSize;
    public int[] heap;
    public int currentSize;
    
    public Team[] teamHeap;   
    
    public MaxHeap(int maxSize){
        this.heap = new int[maxSize];
        this.teamHeap = new Team[maxSize];
        this.currentSize = -1;
        this.maxSize = maxSize;
    }
    
    public int parent(int i){
        return (i - 1) / 2;
    }
    
    public  int leftChild(int i) {
        return 2*i + 1;
    }

    public  int rightChild(int i) {
        return 2*i + 2;
    }
    
    public void insert(Team team) {
        if (currentSize == maxSize - 1) {
            System.out.println("The heap is full. Cannot insert");
            return;
        }

        currentSize++;
        this.heap[currentSize] = team.totalPoint;
        this.teamHeap[currentSize] = team;
        int temp;
        Team tTemp;
        
        int currentIndex = currentSize;
         
        while (this.heap[this.parent(currentIndex)] < this.heap[currentIndex]) {
            temp = heap[currentIndex]; 
            tTemp = teamHeap[currentIndex];
            heap[currentIndex] = heap[parent(currentIndex)];
            heap[parent(currentIndex)] = temp;
            
            teamHeap[currentIndex] = teamHeap[parent(currentIndex)];
            teamHeap[parent(currentIndex)] = tTemp;
            
            currentIndex = this.parent(currentIndex);
        }
    }
    
    public void maxHeapify(int i){
        int left = this.leftChild(i);

        int right = this.rightChild(i);

        int biggest = i;

        if (left <= currentSize && heap[left] > heap[biggest]) {
            biggest = left;
        }

        if (right <= currentSize && heap[right] > heap[biggest]) {
            biggest = right;
        }

        if (biggest != i) {
            int temp = heap[i];
            heap[i] = heap[biggest];
            heap[biggest] = temp;
                       
            Team tTemp = teamHeap[i];
            teamHeap[i] = teamHeap[biggest];
            teamHeap[biggest] = tTemp;
            
            maxHeapify(biggest);
        }
    }
    
    public void maxHeapifyTemp(int[] heap, int size, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int biggest = i;

        if (left <= size && heap[left] > heap[biggest]) {
            biggest = left;
        }

        if (right <= size && heap[right] > heap[biggest]) {
            biggest = right;
        }

        if (biggest != i) {
            int temp = heap[i];
            heap[i] = heap[biggest];
            heap[biggest] = temp;

            maxHeapifyTemp(heap, size, biggest);
        }
    }

    public Team extractMax() {
        if(currentSize < 0){
            System.out.println("Heap is empty!");
        }
        
        int maxItem = this.heap[0];
        Team maxTeam = this.teamHeap[0];

        this.heap[0] = this.heap[currentSize];
        this.teamHeap[0] = this.teamHeap[currentSize];
        
        currentSize = currentSize - 1;

        maxHeapify(0);
        return maxTeam;
    }
    
    public int getMax(){
        return heap[0];
    }
       
    public void printHeap() {
        for (int i = 0; i <= currentSize ; i++) {
            System.out.println(heap[i] + " ");
        }
        System.out.println();
    }
    
    public void printHeapSorted(){
        int[] tempHeap = new int[maxSize];
        System.arraycopy(heap, 0, tempHeap, 0, currentSize + 1);
        int tempSize = currentSize;
        
        System.out.println("Sorted: ");
        while(tempSize >= 0){
            System.out.println(tempHeap[0] + " ");
            tempHeap[0] = tempHeap[tempSize];
            tempSize--;
            
            maxHeapifyTemp(tempHeap, tempSize, 0);
        }
        System.out.println();
    }
}
