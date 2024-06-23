class HelloWorld {
    public static void main(String[] args) {
        Hello("Vedant",20);
        max(7,7);
    }
    public static void Hello(String name , int age){
        System.out.println("Hello "+ name);
        System.out.println("your age is "+ age);
    }
    public static int max(int n1, int n2){
        if (n1>n2){
        System.out.println(n1+" is Greater");
        return n1;
        }else if(n1<n2){
        System.out.println(n2+" is greater");
        return n2;
        }
        else{
        System.out.println("Both are equal");
        return n1;
        }
    }
    }
