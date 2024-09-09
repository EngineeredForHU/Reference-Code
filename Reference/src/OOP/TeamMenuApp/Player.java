package OOP.TeamMenuApp;

public class Player {

    private String name;
    private String position;
    private String specialty;

    //constructors
    public Player(String name, String position, String specialty){
        this.setName(name);
        this.position = position;
        this.specialty = specialty;
    }

    //method that describes the player
    public void describePlayer(){
        System.out.println("Player Name: " + name + "\nPosition: "+position+"\nSpecialty: " + specialty+"\n");
    }


    //-----------------------------------------------------------------------------------------------------------------
    //                                    Getters/Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        //Checks if name is NULL or Empty and if Name is TOO long.
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty!, TRY AGAIN!");
        } else if (name.length() > 15) {
            throw new IllegalArgumentException("name is too long, TRY AGAIN!");
        }
        this.name = name;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
