package inflean.java8.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class App {
    public static void main(String[] args) {
        Foo foo = new DefaultFoo("jyjeong");
        foo.printName();
        foo.printNameUpperCase();

        List<String> name = new ArrayList<>();

        name.add("jyjeong");
        name.add("test");
        name.add("foo");

        name.forEach(System.out::println); //for 문 대용

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> stringSpliterator = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("==================");
        while (stringSpliterator.tryAdvance(System.out::println));


    }
}
