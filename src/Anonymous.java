//We can pass Anonymous Runnable class. This makes the code more concise.

public class Anonymous {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
            }

        });

        t.start();
    }
}
