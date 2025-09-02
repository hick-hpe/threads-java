package atividades;

import modelo.HelloFromThread;

public class HelloMaster {
    public void letsGetsSomeHellos(int nThreads) {
        int nCPUs = Runtime.getRuntime().availableProcessors();
        System.out.println("CPUs: " + nCPUs);

        Thread[] threads = new Thread[nThreads];

        for (int i = 0; i < nThreads; i++) {
            Thread objThread = new Thread(new HelloFromThread(i+1));
            threads[i] = objThread;
            objThread.start();
            
        }

        System.out.println("Thread(s) criadas!");
    }
}
