package zad1;

import java.util.ArrayList;
import java.util.List;

public class Letters {
    List<Thread> threadList = new ArrayList<>();
    public Letters(String str) {
        for (char letter: str.toCharArray()
             ) {
            threadList.add(new Thread(String.valueOf("Thread "+letter)){
                @Override
                public void run() {
                    try {
                        while (!currentThread().isInterrupted()) {
                            System.out.print(letter);
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                    }
                }
            });
        }
    }

    public Iterable<? extends Thread> getThreads() {
        return threadList;
    }
}
