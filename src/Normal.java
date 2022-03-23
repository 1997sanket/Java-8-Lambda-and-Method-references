//Normal people starting a thread to do some job.

class Job implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Normal {
    public static void main(String[] args) throws Exception {

        Job j = new Job();
        Thread t = new Thread(j);
        t.start();
    }
}
