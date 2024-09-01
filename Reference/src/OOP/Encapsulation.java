package OOP;

public class Encapsulation {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Angel");
        System.out.println(student1.getFirstName());

        /*
        * Access Modifiers:
        * public        Accessible everywhere
        * private       Only accessible within the class itself
        * protected     Accessible within the class, other classes in the same package, and all subclasses
        * No Modifiers  Same as protected, except not accessible in a subclass in different packages
        *
        *
        * */
    }
}
