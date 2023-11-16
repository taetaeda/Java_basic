package etc.lambda;


@FunctionalInterface // 해당 인터페이스가 람다 표현식으로 객체 생성이 가능한 인터페이스인지를 검사
// 이거 적용 후 에러나지 않으면 람다식으로 사용할 수 있다~ 라는 뜻
public interface ApplePredicate {

    // 사과를 전달받으면 조건에 맞는 검사를 수행하는 메서드
    boolean test(Apple apple);
}
