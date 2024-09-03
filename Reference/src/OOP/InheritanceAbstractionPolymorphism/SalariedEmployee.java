package OOP.InheritanceAbstractionPolymorphism;

public class SalariedEmployee extends Employee {


    public SalariedEmployee(String firstName, String lastName, double pay) {
        //super refers to the class you are referring from in this case Employee
        super(firstName, lastName, pay);
    }

    @Override
    public double calculatePay() {
        return getPay() * 80;
    }
}
