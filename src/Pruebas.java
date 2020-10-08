public class Pruebas {
    public static void main (String args[]) {
        ArrayQueue<Integer> q = new ArrayQueue<>(5);
        LinkedQueue<Integer> q1 = new LinkedQueue<>();
        /*int size = q.size();
        q.enqueue(1);
        q.enqueue(3);
        q.dequeue();
        q.dequeue();
        q.enqueue(8);
        q.enqueue(5);
        q.enqueue(7);
        q.dequeue();
        q.enqueue(1);
        q.dequeue();
        q.dequeue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(8);
        q.enqueue(5);
        q.enqueue(7);*/

        int size = q1.size();
        q1.enqueue(1);
        q1.enqueue(3);
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(8);
        q1.enqueue(5);
        q1.enqueue(7);
        q1.dequeue();
        q1.enqueue(1);
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(8);
        q1.enqueue(5);
        q1.enqueue(7);
    }
}
