package io.github.jx2lee.getting.started.with.java.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FactoryMethodTest {
    @Test
    @DisplayName("of: type 별 collection 을 of 메서드로 쉽게 생성할 수 있다")
    void mainTest() {
        // given
        FactoryMethod factoryMethod = new FactoryMethod();

        // when
        List<Integer> list = factoryMethod.getList();
        Map<String, Integer> map = factoryMethod.getMap();
        Set<Integer> set = factoryMethod.getSet();

        // then
        assertInstanceOf(List.class, list);
        assertInstanceOf(Map.class, map);
        assertInstanceOf(Set.class, set);
    }
}
