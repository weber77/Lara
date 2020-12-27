
public class Week {
    

    public static void main(String[] args) {
        

        WeekDays day1 = new WeekDays(); // decalre a new weekday object

        day1.setName("Monday");
        day1.setNumber(1);

        WeekDays day2 = new WeekDays("Tuesday", 2); // Using a custom constructor

        System.out.println("Day 1 of the week is: " + day1.getName());
        System.out.println("Day 2 of the week is: " + day2.getName());

        day2.setName("Wednesday");
        day2.setNumber(3);

        System.out.println("Day 2 of the week is: " + day2.getName());
    }
}
