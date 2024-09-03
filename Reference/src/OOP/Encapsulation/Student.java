package OOP.Encapsulation;

public class Student {
    static int numberOfStudent;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int gradeLevel;

    //---------------------------------------------------------------------------------------------------------------

    /*
     *                                                   Constructors
     * */
    public Student(){

    }

    //constructor 1 with only first and last name
    public Student(String firstName , String lastName){
        //this. references to firstName up top to the parameter in Student
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //constructor 2 with first name, last name, phone number, and gradeLevel
    public Student(String firstName, String lastName, String phoneNumber, int gradeLevel){
        //this. references to firstName up top to the parameter in Student
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gradeLevel = gradeLevel;

    }
    //----------------------------------------------------------------------------------------------------------------

    //                                               Public Methods

    public void intro(){
        System.out.println("Hello my name is: " + firstName + " " + lastName);
        System.out.println("I am in " + gradeLevel + " Grade");
        System.out.println("My phone number is " + phoneNumber);

    }
//---------------------------------------------------------------------------------------------------------------------
    /*
     *                                                Getters and Setters
     * */


    //setter for firstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //setter for lastName
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //setter for phoneNumber
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    //setter for gradeLevel
    public void setGradeLevel(int gradeLevel){
        this.gradeLevel = gradeLevel;
    }

    //getter for First Name
    public String getFirstName(){
        return firstName;
    }

    //getter for lastName
    public String getLastName(){
        return lastName;
    }

    //getter for phoneNumber
    public String getPhoneNumber(){
        return phoneNumber;
    }
    //getter for grade level
    public int getGradeLevel(){
        return gradeLevel;
    }

//--------------------------------------------------------------------------------------------------------------------
}
