import java.util.NoSuchElementException;

class GenQueue<E> {

    private QueueNode<E> front;
    private QueueNode<E> rear;
    private Integer nodeCount;

    private final Integer MAX_CAPACITY = 100;

    public GenQueue(){
        front = null;
        rear = null;
        nodeCount = 0;
    }

    public E front(){
        if(front != null){
            return front.elem;
        }else {
            throw new NoSuchElementException("Queue Undeflow");
        }
    }

    public void enqueue(E e){
        if(nodeCount == MAX_CAPACITY){
            throw new RuntimeException("Queue Max Capacity Reached");
        }else{
            QueueNode<E> newNode = new QueueNode<E>(e);
            if(rear == null){
                front = newNode;
                rear = newNode;
            }else {
                rear.next = newNode;
                rear = newNode;
            }
            nodeCount++;
        }
    }

    public void dequeue(){
        if(this.isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }else {
            if (nodeCount == 1){
                front = null;
                rear = null;
            }else{
                front = front.next;
            }
            nodeCount--;
        }
    }

    public Integer queueSize(){
        return nodeCount;
    }

    public Boolean isEmpty(){
        return (nodeCount == 0) ;
    }

}