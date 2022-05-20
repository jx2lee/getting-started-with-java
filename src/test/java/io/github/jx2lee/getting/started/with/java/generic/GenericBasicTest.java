package io.github.jx2lee.getting.started.with.java.generic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericBasicTest {
    @Test
    @DisplayName("제네릭 미사용")
    void noGenericTest() {
        // given
        List stringList = new ArrayList();

        // generic 이 없는 경우 casting 이 필요함
        // when
        stringList.add("test");
        stringList.add(1);

        // then
        Assertions.assertThat(stringList.get(0)).isEqualTo("test");
        Assertions.assertThatThrownBy(() -> {
            String resultIntToString = (String) stringList.get(1);
        }).isInstanceOf(ClassCastException.class);
    }

    @Test
    @DisplayName("제네릭 사용")
    void arrayListIntegerNotChildListObject() {
        // List<Object> objectList = new ArrayList<Integer>();

        // 위 코드는 컴파일 에러가 발생
        // object 는 Integer 의 상위타입 아닌가?
        // -> 제네릭에서는 List<Object> 와 ArrayList<Integer> 는 아무 상관이 없다.
        // 고로 컴파일 에러가 발생한다.
    }
}
