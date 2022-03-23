//Using Lambda to make it even more concise.
//Representation: Runnable runnable = ()-> {....}

public class Lambda {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        });

        t.start();
    }
}
