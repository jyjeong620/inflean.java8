package inflean.java8.Interface;

public interface Bar extends Foo{

    default void printNameUpperCase() {
        System.out.println("Bar");
    }
}
