package io.github.jx2lee.getting.started.with.java.generic;

import io.github.jx2lee.getting.started.with.java.generic.domain.Noodle;

public class CategoryHelper {

    public void popNoodle(Category<? extends Noodle> category) {
        Noodle noodle = category.getT();

        // category.setT(new Noodle());
        // compile error 발생, 저장은 불가
    }

    public void pushNoodle(Category<? super Noodle> category) {
        category.setT(new Noodle());

        // Noodle noodle = category.getT();
        // compile error 발생, 가져오는 건 불가

    }
}
