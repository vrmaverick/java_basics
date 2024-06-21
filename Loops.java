import java.util.Scanner;
public class Main{
// public static Scanner scanner = new Scanner(System.in) // For taking inputs
public static void main(String [] args){
for (int i = 100;i>=0;i--){
    if(i==30){
        break; // the loop will be exited so only 100 to 31 will be printed 
    }
    else if (40<=i && i<=50){ 
        continue;// the loop not exited but code below is skipped so 40 to 50 no. wont be printed
    }
    System.out.println(i);
    
}
}
}
