public class LinkedQueue<E> implements Queue<E>{
    private class Node<E> implements position<E>{
        private Node next;
        private E element;

        public Node(Node<E> n,E elem){
            this.next = n;
            this.element = elem;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public E getElement() {
            return this.element;
        }
    }
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public LinkedQueue(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public E front() {
        if (!this.isEmpty()){
            return this.head.getElement();
        } else{
            throw new RuntimeException("Queue is empty");
        }
    }

    @Override
    public void enqueue(E element) {
        Node<E> n = new Node<>(null, element);
        if (!this.isEmpty()){
            n.setNext(this.tail.getNext());
            this.tail.setNext(n);
            this.tail = n;
        } else{
            this.tail = n;
            this.head = n;
        }
        this.size ++;
    }

    @Override
    public E dequeue() {
        E elem;
        if (!this.isEmpty()){
            if (head == tail){
                elem = head.getElement();
                head = null;
                tail = null;
            } else{
                elem = head.getElement();
                this.head = this.head.getNext();
            }
            this.size --;
        } else{
            throw new RuntimeException("Queue is empty");
        }
        return elem;
    }
}
