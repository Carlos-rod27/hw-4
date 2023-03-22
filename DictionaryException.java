public class DictionaryException extends RuntimeException {

    public DictionaryException(String Message) {//Dictionary exception is used for if the dictionary methods are not used
        super(Message);                         //correctly and sends out a message stating why
    }

}
