package OOP.InheritanceAbstractionPolymorphism;

public class InheritanceAbstractionPolymorphismINFO {

    /*
    * Encapsulation -- Data Security -- binding related data and methods together into objects -- data hiding (Hide he unnecessary).
    *
    * Inheritance -- Code Reusability -- acquiring the existing functionality of a parent class, with the ability to add
    * additional functionality and features into the child class -- an object can inherit some properties and methods from another object.
    *
    * Polymorphism -- Many forms -- A single object can have multiple behaviors , or responds in different ways to the same function.
    *
    * Abstraction -- Present a simplified view -- Hide the complexity from the user (show only what is necessary).
    *
    * */


    public static void main(String[] args) {
        Employee salary = new SalariedEmployee("Angel", "perez",2500.00);
        Employee Hourly = new HourlyEmployee("joe","smith", 15.00,75.6);
        Employee manager =  new Manager("Rob","link",4500.00,15.5);

        System.out.println( salary.getInformation() + " \n" + "Pay: $"+ salary.calculatePay());
        System.out.println( "\n" + Hourly.getInformation() + " \n" + "Pay: $"+ Hourly.calculatePay());
        System.out.println( "\n" + manager.getInformation() + " \n" + "Pay: $"+ manager.calculatePay());





    }
}
