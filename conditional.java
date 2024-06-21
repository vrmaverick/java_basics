import java.util.Scanner;
public class Main{
// public static Scanner scanner = new Scanner(System.in) // For taking inputs
public static void main(String [] args){
    int age = 6;
    if (age>=18){
        System.out.println("You can Drive a Car");
        //Once executed the code exits
    }
    else if(age>=15){
        System.out.println("You can Drive a Scooty");
        
    }
    else{
         System.out.println("You can't Drive for " +(15-age)+" more years");
    }

    boolean isActive = true;
    boolean isConnected = false;
    if(isActive==true){
        System.out.println("The user is Active");
    }
    // if(!(isConnected==true)){ // redundant ==true
    if(!(isConnected)){ //Not operator
        System.out.println("The user is Not Connected");
    }
    
    int Score = 100 ; 
    if(Score >= 100 && isActive){
        System.out.println("Great Work !!! Proceed to Next Level");
    }else{
        System.out.println("You are on same level");
    }
    // Switch case 
    Scanner input = new Scanner(System.in);
    
    int time = input.nextInt();
    switch(time) {
        case 10 :
            System.out.println("It is morning 10am go to the Gym");
            break;
        case 13 :
            System.out.println("It is 1pm in the afternoon have Lunch");
            break;
        case 20 :
            System.out.println("It is 8pm have Dinner and sleep");
            break;
            //Alternative approach for multilined code
        // case 20 ->{
        //     System.out.println("It is 8pm have Dinner and sleep");
        //     break;}
        default :
            System.out.println("No reminders Scheduled");
            break;
    }
    
}
}
