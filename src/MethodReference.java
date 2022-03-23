/*  
    Suppose the logic that our run() method will perform is already written in our program somewhere as a method.
    We can directly use that logic by sending the reference of that method to the functional interface.

    Representation_1: Runnable runnable = MethodReference::printOnetoTen (when the method is static)
    Representation_2: Runnable runnable = methodReference::print1to10 (when the method is non static)

    Rules while using method reference:
    1. The arguments of the functional interface and the method reference we are passing should match.
    2. Return type or Access modifier doesn't matter.

    Main reason to go for method reference is "to reuse the already written logic"
*/

public class MethodReference {

    private static void printOnetoTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private void print1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(MethodReference::printOnetoTen);
        t1.start();

        t1.join(); // so that our main waits till t1 thread is finished.
        System.out.println("----------------------------");

        MethodReference methodReference = new MethodReference();

        Thread t2 = new Thread(methodReference::print1to10);
        t2.start();
    }
}
