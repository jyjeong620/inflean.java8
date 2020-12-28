package inflean.java8;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {

//        RunSomething runSomething = new RunSomething(){
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };
        /* 위 코드를 람다형식으로 바꿀수 있음
           함수형 인터페이스에서 사용가능 Java8 이상부터
         */
        RunSomething runSomething = () -> System.out.println("Hello");

        /*
            위처럼 인터페이스를 만들필요없이 Plus10 Class 처럼
            Function 인터페이스를 implement 해서 사용가능
         */
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        /*
            Function 인터페이스를 implement 하지말고 바로 람다형식으로 받아서 사용가능능         */
        Function<Integer, Integer> plus10_2 = (i) ->i +10;
        System.out.println(plus10_2.apply(1));
    }
}
