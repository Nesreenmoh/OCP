
public class MyQueue {
    
    int queue[]= new int[5];
    int size;
    int front;
    int rear;
    
    
    // add element to the queue
    public void enQueue(int data){
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
        else {
            System.out.println("The queue is full");
        }
    }
    
    // remove data from the queue
    public int deQueue(){
        if(!isEmpty()){
            int data= queue[front];// save the value that i am going to remove
            front=(front+1)%5;
            size--;
            return data;
        }
        else
        {
            System.out.println("The queue is empty");
            return 0;
        }
        
    }

    // show the elements of the queue
    
    public void show(){
        System.out.println("Queue elements are ");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%5]+" ");
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return getSize()==0;
    }
    
    public boolean isFull(){
        return getSize()==5;
    }
    
}
