package inflean.java8.interfaceex;

public interface Bar extends Foo{

    default void printNameUpperCase() {
        System.out.println("Bar");
    }
}
