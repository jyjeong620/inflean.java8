package inflean.java8.Interface;

public interface Foo {
    void printName();

    /**
     * default 를 이용하여 implement 하는 Class 에서 Overriding 하지 않아도 컴파일 에러가 나지 않게 할수있다.
     * @implSpec 이 구현체는 getNmae()으로 가져온 문자열을 대문자로 출력한다
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    static void printAnything() {
        System.out.println("Foo");
    }

    String getName();
}
