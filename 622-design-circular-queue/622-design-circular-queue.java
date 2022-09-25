class MyCircularQueue {
    int a[];
    int n;
    int front = -1, rear = -1;
    
    
    public MyCircularQueue(int k) {
        n = k;
        a= new int[k];    
    }
    
 
    public boolean enQueue(int value) {

        if(isFull()){
            return false;
        }
        
        if(front == -1)
        {
            front = 0;
        }
    
        rear = (rear+1)%n;
        a[rear] = value;
        
        
        return true;
    }
    
    public boolean deQueue() 
    {
        if(isEmpty())
        {
            return false;
        }
        
        
        int result = a[front];
        if(front == rear)
        {
            front = rear= -1;
        }
        
        else
        {
    
            front = (front+1)%n;
        }
        
        return true;
    }
    
    
    //fornt positin in array
    public int Front() {
        
        if(front == -1)
        {
            return -1;
        }
        
        return a[front];
    }
    
     //return position on queue to array
    public int Rear() {
        
         if(rear == -1)
        {
            return -1;
        }
        
        return a[rear];
    }
    
    //check that array is empty
    public boolean isEmpty() {
        if(front == -1)
        {
            return true;
        }
        
        return false;
    }
    
    //check that the array is full or not 
    public boolean isFull() {
        if((rear+1)%n == front)
        {
            return true;
        }
        
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */