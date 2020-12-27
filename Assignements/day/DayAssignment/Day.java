
import java.util.*;

public class Day {
    public static ArrayList<String> names = new ArrayList<>(){
        { 
            add("Monday");
            add("Tuesday");
            add("Wednesday");
            add("Thursday");
            add("Friday");
            add("Saturday");
            add("Sunday");
        }
    };

    public static String today;

    Day(String dayName) {
        today = dayName;
    }

    public static String getToday() {
        return today;
    }

    public void setToday(String dayName) {
        today = dayName;
    }


    public static String previousDay() {

        int currentIndex = names.indexOf(getToday());
        if( currentIndex - 1  == -1)
            return names.get(6);
        else
            return names.get(currentIndex - 1);
    }

    public static String nextDay() {
        int currentIndex = names.indexOf(getToday());
        if( currentIndex + 1  == 7)
            return names.get(0);
        else
            return names.get(currentIndex + 1);
    }

    public static String calculateDay(int x) {

        String day = getToday();

        int currentIndex = names.indexOf(getToday());

        for (int i = 0; i < x; i++) {

            day = names.get(currentIndex);

            if (currentIndex == 6)
                currentIndex = 0;
            else
                currentIndex++;
        }

        return day;
    }

    public static void print() {
        System.out.println(getToday());
    }

    
}

/*
Mon - 1
Tue - 2
Wed - 3 index = 3  + 13....13%7 = 6
Thu - 4
Fri - 5
Sat - 6
Sun - 7

*/