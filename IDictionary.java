public interface IDictionary<S, T> {

    public boolean isEmpty();

    public void add(S key, T value);

    public void remove(S key) throws DictionaryException;

    public T getValue(S key) throws DictionaryException;

    public void clearDictionary();
}
