public class Queue <E> extends LinkedList <E>
{
    public Queue() {}
    
    public E enqueue(E obj) {
        addLast(obj);
        return obj;
    }
    
    public E dequeue() {
        return removeFirst();
    }
    
    public E getFront() {
        return getFirst();
    }
    
    public E getEnd() {
        E obj = removeLast();
        addFirst(obj);
        return obj;    
    } 

}
