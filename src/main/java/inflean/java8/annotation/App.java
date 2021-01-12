package inflean.java8.annotation;

import java.util.Arrays;
import java.util.List;


@Chicken
public class App {
    public static void main(String[] args) throws @Chicken RuntimeException{
        List<@Chicken String> names = Arrays.asList("jyjeong");
    }

    static class FeelsLikeChicken<@Chicken T> {

        public static <@Chicken C> void print(C c){
            System.out.println(c);
        }
    }
}
