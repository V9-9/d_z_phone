public interface Informable {

    void info();

    default void infoDefault() {
        System.out.println("Default info");
    }

}