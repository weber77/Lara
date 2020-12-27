import java.util.*;
public class Day
{ 
        Day  (){}
        final static int SUN = 0;
        final static int MON = 1;
        final static int TUE = 2;
        final static int WED = 3;
        final static int THU = 4;
        final static int FRI = 5;
        final static int SAT = 6;                 

        public int ourDay;         

        public Day(int ourDay)
        {this.ourDay = ourDay;}

        public void setDay(int ourDay)
        {this.ourDay = ourDay;}         

        public int getDay()
        {return ourDay;}

        public int nextDay()
        {
            if (ourDay == SAT)
            {return SUN;}

            else {ourDay = (ourDay + 1) % 7;}            
            return ourDay;           
        }                  

        public int previousDay() 
        {
            if (ourDay == 0)
            {return SAT;}

            else {ourDay = (ourDay - 1) % 7;}        
            return ourDay;           
        }       

        public int futureDay(int ourDays) 
        {return ((ourDay + ourDays) -1 ) % 7;}

        public String toString()        
        {
            switch (this.ourDay) 
               {
                  case SUN:
                        return "Sunday";
                  case MON:
                        return "Monday";
                  case TUE:
                        return "Tuesday";
                  case WED:
                        return "Wednesday";
                  case THU:
                        return "Thursday";
                  case FRI:
                        return "Friday";
                  case SAT:
                        return "Saturday";
                }
                  return "";
        }    

        public static void main(String[] args) 
        {
                Day myDay = new Day(MON);                
                System.out.print("The current day: " + myDay);                
                System.out.println();
                myDay.setDay(myDay.previousDay());
                System.out.print("The previous day: " + myDay);                               
                System.out.println();
                myDay.setDay(myDay.nextDay());                
                myDay.setDay(myDay.nextDay());
                System.out.print("The next day: " + myDay);              
                System.out.println();                               
                myDay.setDay(myDay.futureDay(10));
               // System.out.print("10 days later: " + outDay);               
                //System.out.println();  
                
                
                Day temp = new Day(SUN);                
                System.out.print("\nThe current day: " + temp);                
                System.out.println();
                temp.setDay(temp.previousDay());
                System.out.print("The previous day: " + temp);                               
                System.out.println();
                temp.setDay(temp.nextDay());                
                temp.setDay(temp.nextDay());
                System.out.print("The next day: " + temp);              
                System.out.println();                               
                temp.setDay(temp.futureDay(10));
               // System.out.print("10 days later: " + outDay);               
               // System.out.println();               
        }       
}