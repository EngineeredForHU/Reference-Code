package OOP.InheritanceAbstractionPolymorphism;

public class HourlyEmployee extends Employee {

    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
        //super refers to the class you are referring from in this case Employee
        super(firstName, lastName, pay);

        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculatePay() {
        return getPay() * hoursWorked;
    }
}
