import java.util.function.BiFunction;

/*
    Constructor Reference is used when the functional interface's method is supposed to return us an object.
    And we know Constructor is used for creating an object.
    So why not used the existing Constructor.

*/
class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id: " + id + " name: " + name;
    }
}

public class ConstructorReference {

    // BiFunction is a functional interface which takes two inputs and returns an
    // output (the first two generic types are inputs)
    // Here it is taking id and name as inputs and returning the Student object.
    private static Student getStudent(BiFunction<Integer, String, Student> f) {

        return f.apply(1, "sanket");
    }

    public static void main(String[] args) {

        /*
         * How to the BiFunction's apply method know which constructor to call ?
         * Since we have two constructors in the Student class.
         * Because, it detects how many arguments are passed in the overriden method of
         * the functional interface. If the argument match with any of the existing
         * constructors, then it will invoke that constructor.
         * 
         */
        Student s = getStudent(Student::new);
        System.out.println(s);
    }

}
