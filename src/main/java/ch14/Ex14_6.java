package ch14;

import java.io.File;
import java.util.stream.Stream;

/* 스트림의 중간연산 - 
    map() : 스트림의 요소에 저장된 값 중에서 원하는 필드만 뽑아내거나 특정 형태로 변환해야 할 때 사용,
    peek() : 연산과 연산 사이에 올바르게 처리되었는지 확인 */
public class Ex14_6 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"),
                new File("Ex1.bak"),
                new File("Ex1.java"),
                new File("Ex1"),
                new File("Ex1.txt"),
        };

        Stream<File> fileStream = Stream.of(fileArr); // 스트림을 생성

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println); // 모든 파일의 이름을 출력

        fileStream = Stream.of(fileArr); // 스트림을 다시 생성

        fileStream.map(File::getName) // Stream<File> -> Stream<String>
                .filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것은 제외
                .peek(s -> System.out.printf("filename=%s%n", s)) // 파일명을 출력한다. 중간 작업 결과 확인
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
                .peek(s -> System.out.printf("extension=%s%n", s)) // 확장자를 출력한다. 중간 작업 결과 확인
                .map(String::toUpperCase) // 모두 대문자로 변환
                .distinct() // 중복 제거
                .forEach(System.out::println); // JAVABAKTXT

        System.out.println();
    }
}
