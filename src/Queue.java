public interface Queue<E>{
    /**
     * Returns the number of elements in the queue.
     * @return number of elements in the queue.
     */
    int size();
    /**
     * Returns whether the queue is empty or not.
     * @return true if the queue is empty, false otherwise.
     */
    boolean isEmpty();
    /**
     * Inspects the element at the front of the queue.
     * @return element at the front of the queue.
     */
    E front();
    /**
     * Inserts an element at the rear of the queue.
     * @param element new element to be inserted.
     */
    void enqueue(E element);
    /**
     * Removes the element at the front of the queue.
     * @return element removed.
     */
    E dequeue();

}
