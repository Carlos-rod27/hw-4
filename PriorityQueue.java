public class PriorityQueue<T> implements IPriorityQueue<T> {
    private Node<T> front;

    @Override
    public boolean isEmpty() {
        return (this.front == null);
    }

    @Override
    public void add(int priority, T item) {
        Node<T> newNode = new Node<T>(priority, item);
        if(isEmpty()){
            this.front = newNode;
        }
        else{
            this.front.setNext(newNode);
        }
        this.front = newNode;
    }

    @Override
    public T removeTopPriority() throws PQException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeTopPriority'");
    }

    @Override
    public T peekTopPriority() throws PQException {
        if (this.isEmpty()) {
            throw new PQException("This queue is empty");
        } else {
            return this.front.getItem();
        }
    }

}
