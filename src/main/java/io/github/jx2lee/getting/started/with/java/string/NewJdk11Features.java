package io.github.jx2lee.getting.started.with.java.string;

import java.util.stream.Stream;

public class NewJdk11Features {
    private final String multilineString = "jx2lee helps \n \n developers \n explore Java.";

    public NewJdk11Features() {
    }

    public boolean blankInString(String s) {
        /**
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#isBlank()
         * isBlank: 빈 문자열 혹은 공백으로 이루어진 문자열이면 True 반환
         * isEmpty 는 문자열 길이를 기준으로 빈 문자열인 경우에만 0을 반환
         *  두 method 차이는 알고 있으면 좋을 것 같다.
         */
        return s.isBlank();
    }

    public Stream<String> getStreamByLine() {
        /**
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#lines()
         */
        return multilineString.lines();
    }
    public String repeatString(String s, int repeatCount) {
        /**
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#repeat(int)
         */
        return s.repeat(repeatCount);
    }

    public String stripString(String s) {
        /**
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#strip()
         */
        return s.strip();
    }

    public String stripStringLeading(String s) {
        /**
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#stripLeading()
         */
        return s.stripLeading();
    }
    public String stripStringTrailing(String s) {
        /**
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#stripTrailing()
         */
        return s.stripTrailing();
    }
}
