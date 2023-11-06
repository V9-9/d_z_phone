public interface Informable<T> {

    default void infoD(){
        System.out.println("There is no information at this stage");
    }

    void inform(T mes);
}