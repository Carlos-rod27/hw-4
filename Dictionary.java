public class Dictionary<S, T> implements IDictionary<S, T> {
    private Nodetwo<S, T> head;

    public Dictionary() {
        this.head = null;
    }

    @Override
    public boolean isEmpty() {
        return (this.head == null);
    }

    @Override
    public void add(S key, T value) {
        Nodetwo<S, T> newNode = new Nodetwo<S, T>(key, value);
        if(this.isEmpty()){
            this.head = newNode;
        }
        else{
            if(newNode.getKey() == head.getKey()){
            

        }
        }

        }
    

    @Override
    public void remove(S key) throws DictionaryException {
        Nodetwo current = new 
        if (this.isEmpty()) {
            throw new DictionaryException("This list is empty! Remove on unsuccessful.");
        } else {
            if(this.head.getKey().equals(key)){
                head = head.getNext();
            }else{

            }

        }
    }

    @Override
    public T getValue(S key) throws DictionaryException {
        if (this.isEmpty()) {
            throw new DictionaryException("This list is empty! getValue was unsuccessful.");
        } else {
            return this.head.getValue();
        }
    }

    @Override
    public void clearDictionary() {
        this.head = null;
    }

}
