package projeto_02.atividades;

import projeto_02.modelo.ThreadCalc;

public class ThreadMaster {

    public void letDoSomeCalc() {
        final int TAM_VET = 13;
        final int CPU_THREADS = 4;
        
        double[] vet = new double[TAM_VET];
        Thread[] th = new Thread[CPU_THREADS];

        for (int i = 0; i < CPU_THREADS; i++) {
            th[i] = new Thread(new ThreadCalc(i, vet, CPU_THREADS));
            th[i].start();
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.print((int) vet[i] + " ");
        }
        System.out.println();
    }
}
