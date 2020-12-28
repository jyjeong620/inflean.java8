package inflean.java8;

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
