import java.util.*;
public class Array
{
	public static void main(String[] args) {
	    // Initialize an array of integers  
		int[] numbers={10,20,30,40,50};
		// Indexing of Array
        System.out.println("Element at index 0:"+numbers[3]);
        
        int sum = 0;
        for (int i = 0 ; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.println("Sum of the array of numbers is :"+sum);
        //Update The Array
        numbers[2]=35; 
        System.out.println("Updated element at index 2:"+numbers[2]);  
        
        //ArrayList datatype
        ArrayList<Integer> no = new ArrayList<>(List.of(10,20,30,40,50));
        // Indexing ArrayList
        System.out.println("The Fist Element of ArrayList can be Accessed using no.get(0)"+no.get(0));
        //Uses Java Streams to convert each Integer in the ArrayList to an int and then sums them up.
        //Integer::intValue is a method reference that converts Integer to int.
        int ssum = no.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements:"+ssum);
        //Updates the element at index 3 to 99.
        // no.set(5,35); // Out of bound cant add new element
        no.set(3,99);
        System.out.println("The Fourth Element of ArrayList can be Accessed using no.get(3)"+no.get(3));
                // Add a new element to the end of the ArrayList
        no.add(60);  // Adds the element 60 to the ArrayList
        System.out.println("Added element 60 to the ArrayList.");

        // Add a new element to the middle of the ArrayList
        no.add(3, 25);  // Adds the element 25 at index 3 (after the third element)
        System.out.println("Added element 25 at index 3 to the ArrayList.");

        // Iterate through the ArrayList using a for-each loop and print the elements
        System.out.println("Elements in the ArrayList:");
        for (int num : no) {  // For each element in the ArrayList
            System.out.println(num);
        }
	}
}

