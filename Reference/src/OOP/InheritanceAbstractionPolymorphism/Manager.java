package OOP.InheritanceAbstractionPolymorphism;

public class Manager extends Employee{
    private double bonusPercentage;

    public Manager(String firstName, String lastName, double pay, double bonusPercentage){
        //super refers to the class you are referring from in this case Employee
        super(firstName,lastName,pay);
        //this refers to bonusPercentage
        this.bonusPercentage = bonusPercentage;
    }

    //overrides calculate pay from Employee.
    @Override
    public double calculatePay() {
        return getPay() * 80 * bonusPercentage;
    }
}
