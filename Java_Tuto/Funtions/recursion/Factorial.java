class Factorial
{
    public static void main(String[] args) {
        
    }


    public static int facto(int x) {
        
        if ( x <= 1)
            return 1;
        
        else
            return x * facto(x-1);
    }
}