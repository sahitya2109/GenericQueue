class QueueNode<E> {

    E elem;
    QueueNode next;

    public QueueNode(E e){
        this.elem = e;
        this.next = null;
    }
}