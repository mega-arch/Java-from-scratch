//simple calculator using loop and switch case

import java.util.Scanner;

public class P8{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char Con;
        
        do{
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter your choice:");
            int choice=sc.nextInt();
            System.out.println("Enter a & b: ");
            int a= sc.nextInt();
            int b= sc.nextInt();
            calculator(choice, a, b);       // passed the values 
            System.out.println("Want to continue?(Y or N):");
            Con= sc.next().charAt(0);  
        } while(Character.toUpperCase(Con)=='Y'); 
}
    static void calculator(int choice, int a, int b){ // added parameters

        switch(choice){
            case 1:
            System.out.println("Sum is"+(a+b));break;
            case 2:
            System.out.println("Difference is"+(a-b));break;
            case 3:
            System.out.println("Product is"+(a*b));break;
            case 4:
            System.out.println("Quotient is"+(a/b));break;
            default:
            System.out.println("Invalid choice");
        }
              
    }
}