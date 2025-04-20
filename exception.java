 // write the program to access the array index beyond
// public class exception {
//     public static void main(String[] args){
//         int [] array={1, 2,3, 4, 5};

//         try {
            
//             System.out.println("Accessing element at index 5: " + array[6]);
//         } 
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Error: Attempted to access an invalid array index.");
//         } 
        
//     }
// }



// write the exception handling for the number 
import java.util.Scanner;
public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Enter the first number :");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number :");
        int number2 = scanner.nextInt();

        int result = number1/number2;

        System.out.println("the result:"+result);

        }
        
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter numeric values.");
        } 
       
        finally {
            System.out.println("Program execution completed.");
            scanner.close(); 
        }
    }

}