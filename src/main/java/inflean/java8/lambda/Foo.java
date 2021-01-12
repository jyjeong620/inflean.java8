package inflean.java8.lambda;

import java.util.function.*;

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

        /* Function 인터페이스를 implement 하지말고 바로 람다형식으로 받아서 사용가능 */
        Function<Integer, Integer> plus10_2 = (i) ->i +10;
        System.out.println(plus10_2.apply(1));

        /* return 타입이 없는 경우 Supplier , 한줄일경우 밑에처럼 줄여서 사용가능*/
        Supplier<Integer> get10 = () -> 10;

        /*
            BiFunction 의 경우 첫번째 두번재 인자를 받아와 세번쨰 인자 타입으로 return 해주는것
            인자차입이 같을경우 BinaryOperator로 대체 가능
         */
        BiFunction<Integer, Integer, Integer> get20 = (a,b) -> a + b;
        BinaryOperator<Integer> get20_1 = (a,b) -> a + b;



        Foo foo = new Foo();
        foo.run();
    }
    private void run(){
        /* 로컬 클래스나 익명 클래스와 람다의 차이점
         * 로컬 클래스와 익명 클래스는 쉐도잉이 가능, 람다는 쉐도잉 불가
         * 쉐도잉이란 클래스 내부에 같은변수명이 새로 선언될 경우 가려짐
         */
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBasNumber(){
                int baseNumber = 20; // <- 쉐도잉이 된것
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
//            int baseNumber = 20 ; // <- 람다의 경우 쉐도잉이 안됨
            System.out.println(i+baseNumber);
        };

        printInt.accept(10);
    }
}
