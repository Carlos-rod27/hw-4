public class PriorityQueue<T> implements IPriorityQueue<T> {
    private Node<T> front;

    @Override
    public boolean isEmpty() {
        return (this.front == null);
    }

    @Override
    public void add(int priority, T item) {
        Node<T> newNode = new Node<T>(priority, item);
        if (isEmpty()) {
            this.front = newNode;
        } else {
            Node<T> currentNode = this.front;
            Node<T> lastNode = null;
            while (currentNode != null) {
                if (currentNode.getPriority() < priority) {
                    break;
                }
                lastNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (lastNode == null) {
                newNode.setNext(front);
                this.front = newNode;
            } else {
                lastNode.setNext(newNode);
                newNode.setNext(currentNode);
            }
        }
    }

    @Override
    public T removeTopPriority() throws PQException {
        if (this.isEmpty()) {
            throw new PQException("This queue is empty!");
        } else {
            T item = front.getItem();
            this.front = front.getNext();
            return item;
        }
    }

    @Override
    public T peekTopPriority() throws PQException {
        if (this.isEmpty()) {
            throw new PQException("This queue is empty");
        } else {
            return this.front.getItem();
        }
    }

    @Override
    public String toString() {String s = "[";
    Node<T> current = this.front;
    while (current != null) {
        s = s + current.getItem().toString();
        if (current.getNext() != null)
            s += ", ";
        current = current.getNext();
    }
    return s + "]";
    }

}
