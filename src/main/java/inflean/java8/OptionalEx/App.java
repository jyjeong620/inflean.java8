package inflean.java8.OptionalEx;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        boolean present = optional.isPresent();   //is Present존재 여부 확인
        System.out.println(present);

        /*
        OnlineClass onlineClass = optional.get();   //값을 가져올때 , 가급적이면 get을 사용하지않음
        System.out.println(onlineClass.getTitle());
         */
        optional.ifPresent(oc -> System.out.println(oc.getTitle()));

        OnlineClass onlineClass = optional.orElse(createNewClass()); // get처럼 값을 가져온다 하지만 없을경우 ()안에 처리
                                                                     // 하지만 createNewClass가 무조건 실행됨
        System.out.println(onlineClass.getTitle());

        OnlineClass onlineClass1 = optional.orElseGet(App::createNewClass); //위 같은 문제를 해결하기위해 orElseGet 사용
        System.out.println(onlineClass1.getTitle());

        optional.orElseThrow(); // 없을경우 에러를 발생시킨다 기본적으로 NoSuchElementException return
        optional.orElseThrow(IllegalAccessError::new); //이처럼 에러를 정해서 발생시킬수있다

        optional.flatMap(OnlineClass::getProgress);   //return 받는 값이 이미 Optional 일경우 flatMap을 통해 받아오면 된다


    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New Class", false);
    }
}
