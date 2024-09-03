package OOP.Encapsulation;

public class EncapsulationINFO {

    public static void main(String[] args) {
        /*
         * Access Modifiers:
         * public        Accessible everywhere
         * private       Only accessible within the class itself
         * protected     Accessible within the class, other classes in the same package, and all subclasses
         * No Modifiers  Same as protected, except not accessible in a subclass in different packages
         *
         *
         * */

        //Student 1st example of encapsulation
        Student student1 = new Student();
        student1.setFirstName("Angel");
        System.out.println(student1.getFirstName());

        Student student2 = new Student();
        student2.setGradeLevel(1);
        System.out.println(student2.getGradeLevel());

        //-------------------------------------------------------------------
        //rectangle is the 2nd example of encapsulation
        Rectangle rec = new Rectangle(20,15);
        rec.setLength(10);
        System.out.println(rec.getArea());

        System.out.println(rec.getLength());
        System.out.println(rec.getWidth());


    }
}
