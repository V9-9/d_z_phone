public interface Informable<T> {

    default void info(T data){
        System.out.println("Information: " + data.toString());
    }
}