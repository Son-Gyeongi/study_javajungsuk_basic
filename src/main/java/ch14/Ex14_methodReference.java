package ch14;

import java.util.function.Function;
import java.util.function.Supplier;
// java.util.function - 자바에서 제공하는 함수형 인터페이스 모아놓은 거

public class Ex14_methodReference {
    public static void main(String[] args) {
        /* 메서드 참조 */
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        // 람다식을 메서드 참조로 바꾸기
//        Function<String, Integer> f = 클래스이름::메서드이름;
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("100")+200);

        /* 생성자의 메서드 참조 */
        // Supplier는 입력X, 출력O
//        Supplier<MyClass> s = () -> new MyClass();
        // 람다식을 메서드 참조로 바꾸기
        // Supplier<MyClass> s = 클래스이름::메서드이름;
//        Supplier<MyClass> s = MyClass::new; // 메서드는 없고 연산자 new가 있다.
//        MyClass mc = s.get();
//        System.out.println(mc);
//        System.out.println(s.get()); // 또 다른 MyClass객체가 만들어진다.

        // 생성자에 매개변수 값이 필요할 경우, MyClass(int iv) / Function으로 변경
//        Function<Integer, MyClass> f1 = (i) -> new MyClass(i);
        Function<Integer, MyClass> f1 = MyClass::new;

        MyClass mc1 = f1.apply(100);
        System.out.println(mc1.iv);
        System.out.println(f1.apply(200).iv);
        
        // 배열 생성 - 배열의 길이를 주어야 하기 때문에 꼭 Function으로 해야한다.
//        Function<Integer, int[]> f2 = (i) -> new int[i];
//        int[] arr = f2.apply(100);
////        System.out.println(f2.apply(100).length); // 배열 길이
//        System.out.println("arr.length = "+arr.length); // 배열 길이
        // 람다식을 메서드 참조로 바꾸기
        // Function<Integer, int[]> f2 = 클래스이름::메서드이름;
        Function<Integer, int[]> f2 = int[]::new; // 메서드 참조
    }
}

class MyClass {
    int iv;

    // 생성자
    MyClass(int iv) {
        this.iv = iv;
    }
}
