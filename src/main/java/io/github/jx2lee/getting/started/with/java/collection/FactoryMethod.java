package io.github.jx2lee.getting.started.with.java.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethod {
    /**
     * collection.of 로 Collection 을 생성할 수 있다. (JDK 9~)
     **/
    private final List<Integer> list = List.of(1, 2, 3);
    private final Map<String, Integer> map = Map.of("k1", 1, "k2", 2);
    private final Set<Integer> set = Set.of(1, 2, 3);

    public FactoryMethod() {
    }

    public List<Integer> getList() {
        return list;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public Set<Integer> getSet() {
        return set;
    }
}
