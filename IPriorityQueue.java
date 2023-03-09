public interface IPriorityQueue<T> {
    public boolean isEmpty();

    public void add(int priority, T item);

    public T removeTopPriority() throws PQException;

    public T peekTopPriority() throws PQException;

}