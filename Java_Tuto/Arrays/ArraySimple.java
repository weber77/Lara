class ArraySimple
{
    public static void main(String[] args) {
        

        int[] a; // declaration
        a = new int[16]; // object creation 

        int[] b = { 1, 2, 5 ,6 };// you can't modify this

        for(int i=0; i < a.length; i++)
            a[i] = i*2; // init 
        
        System.out.printf("%s%8s\n", "Index", "Value");

        for (int i = 0; i < a.length; i++)
            System.out.printf("%5d%8d\n", i, a[i]);

        System.out.println();
        for (int i = 0; i < b.length; i++)
            System.out.printf("%5d%8d\n", i, b[i]);

    }
}