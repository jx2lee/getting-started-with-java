package io.github.jx2lee.getting.started.with.java.variable;

public class VarClass {
    public VarClass() {
    }
    public int getVarVariable() {
        /**
         * https://developer.oracle.com/java/jdk-10-local-variable-type-inference.html
         * var: (지역변수) Type 없이 변수 설정
         * 지역변수만 적용하기 때문에 field 나 parameter 로 사용할 수 없다.
         **/
        var intValue = 10;
        return intValue;
    }
}
