package inflean.java8.Method;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        /* UnaryOperator : 입력값와 출력값의 타입이 같을경우 */
        UnaryOperator<String> hi = Greeting::hi;
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("jyjeong"));

        /* Supplier : 리턴값이 없을경우 */
        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        Function<String, Greeting> jyjeongGreeting = Greeting::new;
        Greeting jyjeong = jyjeongGreeting.apply("jyjeong");
        System.out.println(jyjeong.getName());

        String[] names = {"jyjeong", "jjy", "test"};
        Arrays.sort(names, String::compareToIgnoreCase);  //임의의 객체 인스턴스 참조
        System.out.println(Arrays.toString(names));
    }
}
