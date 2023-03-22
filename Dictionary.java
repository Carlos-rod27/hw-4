public class Dictionary<S, T> implements IDictionary<S, T> {
    private Nodetwo<S, T> head;

    public Dictionary() {// creates an empty linked list
        this.head = null;
    }

    @Override
    public boolean isEmpty() {// the method will state if the list is empty
        return (this.head == null);
    }

    // will add a node to the list with a key and a value and if the key is the same
    // when added then it will replace
    // the value of that specific key
    @Override
    public void add(S key, T value) {
        Nodetwo<S, T> newNode = new Nodetwo<S, T>(key, value);
        if (this.isEmpty()) {
            head = newNode;
        } else {
            if (head.getKey().equals(key)) {
                head = newNode;
            } else {
                Nodetwo<S, T> cur = head;
                head = newNode;
                head.setNext(cur);
            }
        }

    }

    // this will remove the node from the list based on the key that is entered
    // and will throw an exception if the the list is empty and you are trying to
    // remove something that is not there.
    @Override
    public void remove(S key) throws DictionaryException {
        Nodetwo<S, T> currentValue = head;
        Nodetwo<S, T> lastValue = head;
        if (this.isEmpty()) {
            throw new DictionaryException("This list is empty! Remove on unsuccessful.");
        } else if (!isEmpty() && head.getKey().equals(key)) {
            head = head.getNext();
        } else {
            while (currentValue != null) {
                if (currentValue.getKey().equals(key)) {
                    lastValue.setNext((currentValue.getNext()));
                    currentValue.setNext(null);
                }
                lastValue = currentValue;
                currentValue = currentValue.getNext();
            }
        }

    }

    // this will grab the value from the key that is entered, and will throw an
    // exception
    // if you are trying to get a value from a key that does not exception
    @Override
    public T getValue(S key) throws DictionaryException {
        Nodetwo<S, T> curryHead = head;
        if (this.isEmpty()) {
            throw new DictionaryException("This list is empty! getValue was unsuccessful.");
        } else {
            while (curryHead != null) {
                if (curryHead.getKey().equals(key))
                    return curryHead.getValue();
                curryHead = curryHead.getNext();
            }
            return null;
        }
    }

    @Override
    public void clearDictionary() {// this will clear the list completely.
        this.head = null;
    }

    // @Override
    /*
     * public String toString() {
     * if(this.isEmpty()){
     * return "[]";
     * }
     * String s = "[";
     * Nodetwo<S,T> current = this.head.getNext();
     * while (current != this.head) {
     * s = s + current.getKey().toString() + "| " + current.getValue().toString() +
     * ", ";
     * current = current.getNext();
     * }
     * s = s + this.head.getKey() + this.head.getValue() + "]";
     * return s;
     * }
     */

}
