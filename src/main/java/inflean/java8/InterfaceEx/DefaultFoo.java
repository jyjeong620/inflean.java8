package inflean.java8.InterfaceEx;

public class DefaultFoo implements Foo {

    String name;

    DefaultFoo(String name){
        this.name = name;
    }

    /* 이런식으로 default 메서드를 재정의 할수 있다. */
    @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
