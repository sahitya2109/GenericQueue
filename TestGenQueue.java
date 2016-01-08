class TestGenQueue{

    public static void main(String[] args){
        GenQueue<Integer> testQueue = new GenQueue<Integer>();
        testQueue.enqueue(10);
        testQueue.enqueue(20);
        System.out.println("Queue size is " + testQueue.queueSize());
        System.out.println("Queue front is " + testQueue.front());
        testQueue.dequeue();
        System.out.println("Queue size is " + testQueue.queueSize());
        System.out.println("Queue front is " + testQueue.front());
    }
}