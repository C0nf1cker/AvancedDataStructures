public class ArrayQueue<E> implements Queue<E>{
    private Object [] q;
    private int head;
    private int tail;
    private int size;
    private int maxSize;

    public ArrayQueue(int cap){
        this.maxSize = cap;
        this.size = 0;
        this.head = 0;
        this.tail = 0;
        this.q = new Object[cap];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public E front() {
        if (!this.isEmpty()){
            return (E) q[this.head];
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    private Object[] copyArrayToDoubleArray(Object[] q, Object[] doubleArray) {
        for (int i = 0; i < maxSize; i++) {
            doubleArray[i] = q[i];
        }
        return doubleArray;
    }

    private void increaseTail() {
        if (tail + 1 == maxSize){
            if(this.size == maxSize){
                this.tail++;
                Object [] doubleArray = new Object[maxSize * 2];
                this.q = copyArrayToDoubleArray(q, doubleArray);
                maxSize = maxSize * 2;
            }else{
                this.tail = 0;
            }
        } else {
            this.tail++;
        }
    }

    @Override
    public void enqueue(E element) {
        this.q[this.tail] = element;
        this.size++;
        increaseTail();
    }

    private void increaseHead() {
        if (head + 1 == maxSize){
            if(this.size == maxSize){
                this.head++;
            }else{
                this.head = 0;
            }
        } else {
            this.head++;
        }
    }

    @Override
    public E dequeue() {
        if (!this.isEmpty()){
            Object elem = this.q[this.head];
            this.q[this.head] = null;
            this.size--;
            increaseHead();
            return (E)elem;
        } else{
            throw new RuntimeException("Queue is empty");
        }
    }
}
