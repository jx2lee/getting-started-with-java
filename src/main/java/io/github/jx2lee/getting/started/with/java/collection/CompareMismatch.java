package io.github.jx2lee.getting.started.with.java.collection;

import java.util.Arrays;

public class CompareMismatch {
    private final int[] firstIntArray = new int[] {1, 2, 3};
    private final int[] lastIntArray = new int[] {2, 2, 3};

    public CompareMismatch() {
    }

    public int getCompare() {
        /**
         * https://docs.oracle.com/javase/9/docs/api/java/util/Arrays.html#compare-int:A-int:A-
         * Arrays.equals(a, b) == (Arrays.compare(a, b) == 0)
         * equals 랑 비슷하지만 결과값을 int 로 반환
         *  first array 가 사전 순으로 적으면 응수 & 사전 순으로 크면 양수
         *  예제는 firstIntArray 가 사전순으로 빠르기 때문에 음수 반환
         */
        return Arrays.compare(firstIntArray, lastIntArray);
    }

    public int getMismatch() {
        /**
         * https://docs.oracle.com/javase/9/docs/api/java/util/Arrays.html#mismatch-int:A-int:A-
         * 두 배열 간 다른 값의 index 반환
         *  예제는 0을 반환
         */
        return Arrays.mismatch(firstIntArray, lastIntArray);
    }
}
