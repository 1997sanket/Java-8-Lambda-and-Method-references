import java.util.function.Function;

/*
    You may have come across some syntax like "String::toUpperCase". 

    What is happening here ?
    toUpperCase is a non static method in String class. 
    So how the syntax looks like it's being used as a static method.

    THE ANSWER is 
            There are 3 types of method references according to the documentation.
            1. One that works with static methods.
            2. One that works with non static methods.
            3. When a non static method uses syntax of a static method. 
                    Because an argument of that class type is passed and the non static method
                    is called by using that argument.
                    Eg: Here the "toUpperCase" method is being called by the argument which we will pass
                        to the method of the functional interface.
*/

public class MethodReferenceArbitrary {

    private static void convertToUpperCase(Function<String, String> f) {

        String name = f.apply("sanket");
        System.out.println(name);
    }

    public static void main(String[] args) {

        convertToUpperCase(String::toUpperCase);
        /*
         * Here even though toUpperCase is a non static method.
         * The syntax used is one that of static method.
         * Because here toUpperCase is being called by the String argument "sanket" that
         * is passed in the function.
         */
    }
}
