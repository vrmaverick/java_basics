class HelloWorld {
    public static void main(String[] args) {
        int num1 = 10;
        float num2 = 8.4f;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(8%3);//For modulous
        
        System.out.println(num1+=1); //incremental operators
        System.out.println(num1-=1); //decremental operators
        System.out.println(num1*=2); 
        System.out.println(num1/=2); 
        
        //Postfix incremtal 
        System.out.println(num1++); // First prints then adds 
        System.out.println(num1); 
        
        System.out.println(--num1); // First decrements then prints
    }
}
