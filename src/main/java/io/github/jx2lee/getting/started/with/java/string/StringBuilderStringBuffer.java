package io.github.jx2lee.getting.started.with.java.string;

public class StringBuilderStringBuffer {
    /**
     * StringBuilder & StringBuffer 로 연산 시간을 측정하기 위한 Class
     */
    private long startTime;
    private long endTime;

    public void startClock() {
        startTime = System.nanoTime();
    }

    public void stopClock() {
        endTime = System.nanoTime();
    }

    public void printResultTime(String clockName) {
        System.out.printf("%s" + ": %.3f seconds %n",
                clockName, (endTime - startTime) / (double) 1_000_000_000);
    }
}
