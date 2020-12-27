
public class LaraNimer_PE_8_3
{
    public static void main(String[] args)
    {
        Day myDay = new Day("Monday");
        

        myDay.print();
        System.out.println(myDay.previousDay());
        System.out.println(myDay.nextDay());

        System.out.println();
        Day temp = new Day("Sunday");
        

        temp.print();
        System.out.println(temp.previousDay());
        System.out.println(temp.nextDay());
    }
}


