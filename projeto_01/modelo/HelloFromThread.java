package modelo;

public class HelloFromThread implements Runnable {
    private int tId;

    public HelloFromThread(int id) {
        this.tId = id;
    }

    @Override
    public void run() {
        System.out.println("Hello da Thread no: " + tId);
    }
}

