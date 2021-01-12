package inflean.java8.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE_PARAMETER) // 제너릭 타입앞에 사용할수있게 해주는것
@Target(ElementType.TYPE_USE)       // 타입선언하는 모든곳에 사용가능하다
public @interface ChickenContainer {
    Chicken[] value();
}
