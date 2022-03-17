package io.github.jx2lee.getting.started.with.java.concurrency.ramen;

public class RamenCook extends Thread {
    private int ramenCount;
    private String[] burners = {"_", "_", "_", "_"};

    public RamenCook(int count) {
        ramenCount = count;
    }

    @Override
    public void run() {
        if (ramenCount == 0) {
            System.out.println("no more ramen..");
            return;
        }
        while (ramenCount > 0) {
            synchronized (this) {
                System.out.println("before ramenCount = " + ramenCount);
                ramenCount--;
                System.out.println("after ramenCount = " + ramenCount);
                System.out.println(Thread.currentThread().getName() + ": " + ramenCount + "개 남았습니다");
            }

            for (int i = 0; i < burners.length; i++) {
                if (!burners[i].equals("_")) {
                    continue;
                }

                synchronized (this) {
                    burners[i] = Thread.currentThread().getName();
                    System.out.println("                 " + Thread.currentThread().getName() + " : [" + (i + 1) + "]번 버너 ON");
                    showBurners();
                }

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (this) {
                    burners[i] = "_";
                    System.out.println("                                  " + Thread.currentThread().getName() + " : [" + (i + 1) + "]번 버너 OFF");
                    showBurners();
                }
                break;
            }

            try {
                Thread.sleep(Math.round(1000 * Math.random()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void showBurners() {
        StringBuilder builder = new StringBuilder();
        builder.append("                                                             ");
        // String stringToPrint = "                                                             ";
        for (int i = 0; i < burners.length; i++) {
            builder.append(" " + burners[i]);
        }
        System.out.println(builder);
    }
}
