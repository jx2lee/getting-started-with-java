package io.github.jx2lee.getting.started.with.java.generic;

import io.github.jx2lee.getting.started.with.java.generic.domain.Noodle;
import io.github.jx2lee.getting.started.with.java.generic.domain.Pasta;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GenericTest {
    @Test
    @DisplayName("제네릭 메서드 테스트")
    void genericMethodTest() {
        Category<Noodle> noodleCategory = new Category<>();
        noodleCategory.setT(new Noodle());
        noodleCategory.printClassName(new Pasta());
    }

    @Test
    @DisplayName("extends: Noodle 하위 타입이 아닌 경우 컴파일 에러 발생")
    void compileErrorUsingCoke() {
        // io.github.jx2lee.getting.started.with.java.generic.restrict.NoodleCategory<Pasta> noodleNoodleCategory =
        //         new io.github.jx2lee.getting.started.with.java.generic.restrict.NoodleCategory<>();

        io.github.jx2lee.getting.started.with.java.generic.restrict.NoodleCategory<Pasta> noodleCategory =
                new io.github.jx2lee.getting.started.with.java.generic.restrict.NoodleCategory<>();

        noodleCategory.setT(new Pasta());
        noodleCategory.printClassName(new Noodle());
    }
}
