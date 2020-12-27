public class AckermannTest
{
    public static void main(String[] args) {
        
        System.out.println("Ackermann(0, 0): " + Ackermann(0, 0));
        System.out.println("Ackermann(0, 1): " + Ackermann(0, 1));
        System.out.println("Ackermann(1, 1): " + Ackermann(1, 1));
        System.out.println("Ackermann(3, 2): " + Ackermann(3, 2));
    }

    public static int Ackermann(int m, int n)
    {
        if( m == 0)
            return (n + 1);
        
        if( n == 0)
            return Ackermann(m -1, 1);
        
        return Ackermann(m-1, Ackermann(m, n-1));
    }
}