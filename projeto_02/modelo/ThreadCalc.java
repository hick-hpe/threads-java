package projeto_02.modelo;

public class ThreadCalc implements Runnable {

    private int tId;
    private double[] vet;
    private int pedaco;
    private int inicio;
    private int fim;
    private int extra;
    
    public ThreadCalc(int id, double[] vetEntrada, int cpu_threads) {
        this.tId = id;
        this.vet = vetEntrada;
        
        pedaco = (int) Math.floor(vet.length/cpu_threads);
        extra = vet.length % cpu_threads;

        if (id < extra) {
            inicio = tId * (pedaco+1);
            fim = inicio + pedaco;
        } else {
            inicio = extra * (pedaco + 1) + (tId - extra) * pedaco;
            fim = inicio + pedaco - 1;
        }

        System.out.printf("T-%d [%d,%d]\n", tId, inicio, fim);
    }

    @Override
    public void run() {
        for (int i = inicio; i <= fim; i++) {
            vet[i] = tId;
        }
    }
    
}
