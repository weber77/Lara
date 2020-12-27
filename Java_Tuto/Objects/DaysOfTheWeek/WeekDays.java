
public class WeekDays {

    // Attributes
    String name;
    int number;

    //Constructor
    WeekDays(){} //Default constructor. NB: If you don't specify a default constructor,
                 // JVM will create one for you at runtime

    WeekDays(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for name
    public String getName() {
        return name;
    }

    //setter method for number
    public void setNumber(int number) {
        this.number = number;
    }

    // getter method for number
    public int getNumber() {
        return number;
    }
}
