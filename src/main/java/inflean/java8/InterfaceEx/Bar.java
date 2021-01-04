package inflean.java8.InterfaceEx;

public interface Bar extends Foo{

    default void printNameUpperCase() {
        System.out.println("Bar");
    }
}
