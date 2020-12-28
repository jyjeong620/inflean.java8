package inflean.java8;

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
    }
}
