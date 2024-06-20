// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Variables
        String name = "Vedant";
        int age = 20; //Only whole number
        System.out.println("Hii "+name +"Your Age is " +age);
        
        //Minimum and maximum value that can be stored in the  integer can be determined
        int max = Integer.MAX_VALUE;//This is max value of the integer so if we wadd one it will overflow and throw error
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);//It will add in print statement if we write max+min directly
        
        byte byte_max = Byte.MAX_VALUE;
        byte byte_min = Byte.MIN_VALUE;
        System.out.println(byte_max);
        System.out.println(byte_min);
        
        long long_max =Long.MAX_VALUE;
        long long_min =Long.MIN_VALUE;
        System.out.println(long_max);
        System.out.println(long_min);
        
        long vara = 2147483647887L; //indicates long it is madatory
        
        short short_max = Short.MAX_VALUE;
        short short_min = Short.MIN_VALUE;
        System.out.println(short_max);
        System.out.println(short_min);
        
        System.out.println("Thus We can see the whole numbers can be further categorized  in 4 diffrent datatypes according to the size : \n byte<short<int<long ");
        
        float flt = 3.14f;// putting f is necessary
        Double dbl = 3.14;
        
        float flt_max = Float.MAX_VALUE;
        float flt_min = Float.MIN_VALUE;
        System.out.println(flt_max);
        System.out.println(flt_min);
        
        Double dbl_max = Double.MAX_VALUE;
        Double dbl_min = Double.MIN_VALUE;
        System.out.println(dbl_max);
        System.out.println(dbl_min);
        
        System.out.println("If We want Precesion we must use Double else we must use float");
        
        char letter = 'A';
        System.out.println("We can use char scenarios like when we ant to get which key is pressed by the user and char does not store a string it only stores a charecter");
        boolean isActive = false;
        System.out.println(letter+" "+isActive);
        
    }
}
