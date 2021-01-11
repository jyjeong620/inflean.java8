package inflean.java8.Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE_PARAMETER) // 제너릭 타입앞에 사용할수있게 해주는것
@Target(ElementType.TYPE_USE)       // 타입선언하는 모든곳에 사용가능하다
@Repeatable(ChickenContainer.class)
public @interface Chicken {
//    String value();
}
