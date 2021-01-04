package inflean.java8.Lambda;

@FunctionalInterface
public interface RunSomething {
    void doIt();

    static void printName() {
        System.out.println("jyjeong");
    }

    default void printAge() {
        System.out.println("30");
    }

}
