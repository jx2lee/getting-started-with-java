package io.github.jx2lee.getting.started.with.java.variable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VarClassTest {

    @Test
    @DisplayName("var 변수")
    void varTest() {
        // given
        VarClass varClass = new VarClass();

        // when
        int value = varClass.getVarVariable();

        // then
        Assertions.assertInstanceOf(Integer.class, value);
        System.out.println("varValue = " + value);
    }
}
