public interface Callable<T> {

    void receiveCall(T name) throws NameException;

}