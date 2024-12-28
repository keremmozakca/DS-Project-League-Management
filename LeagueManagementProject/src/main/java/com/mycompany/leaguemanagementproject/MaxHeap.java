package com.mycompany.leaguemanagementproject;
public class MaxHeap {
    public int maxSize;
    public int[] heap;
    public int currentSize;
    
    public MaxHeap(int maxSize){
        this.heap = new int[maxSize];
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
    
    public void insert(int score) {
        if (currentSize == maxSize - 1) {
            System.out.println("The heap is full. Cannot insert");
            return;
        }

        currentSize++;
        this.heap[currentSize] = score;
        int temp;

        int currentIndex = currentSize;
         
        while (this.heap[this.parent(currentIndex)] < this.heap[currentIndex]) {
            temp = heap[currentIndex]; 
            heap[currentIndex] = heap[parent(currentIndex)];
            heap[parent(currentIndex)] = temp;
            currentIndex = this.parent(currentIndex);
        }
    }
    
    public void maxHeapify(int i){
        int left = this.leftChild(i);

        int right = this.rightChild(i);

        int biggest = i;

        // check if the left node is smaller than the current node
        if (left <= currentSize && heap[left] > heap[biggest]) {
            biggest = left;
        }

        // check if the right node is bigger than the current node 
        // or left node
        if (right <= currentSize && heap[right] > heap[biggest]) {
            biggest = right;
        }

        // swap the biggest node with the current node 
        // and repeat this process until the current node is bigger than 
        // the right and the left node
        if (biggest != i) {
            int temp = heap[i];
            heap[i] = heap[biggest];
            heap[biggest] = temp;
            maxHeapify(biggest);
        }
    }

    // deletes the max item and return
    public int extractMax() {
        if(currentSize < 0){
            System.out.println("Heap is empty!");
        }
        
        int maxItem = this.heap[0];

        // replace the first item with the last item
        this.heap[0] = this.heap[currentSize];
        currentSize = currentSize - 1;

        // maintain the heap property by heapifying the 
        // first item
        maxHeapify(0);
        return maxItem;
    }
    
    public int getMax(){
        return heap[0];
    }
       
    // prints the heap
    public void printHeap() {
        for (int i = 0; i <= currentSize ; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
