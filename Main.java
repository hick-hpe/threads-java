import atividades.HelloMaster;

public class Main {
    public static void main(String[] args) {
     HelloMaster hm = new HelloMaster();

     int nTHREADS = Integer.parseInt(args[0]);
     hm.letsGetsSomeHellos(nTHREADS);
    }
}

