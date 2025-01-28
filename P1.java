import java.util.Scanner;
public class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in); //object for scanner class to read input from user 
        float a, b;
        System.out.println("enter a & b:");
        a= sc.nextFloat(); //take user input as float value
        b= sc.nextFloat();
        float sum= a+b; 
        System.out.printf("sum is: %.3f%n",sum); //".3" used to format or rounding a number 3 decimal places after period. "f" used to format float or double value "n" default newline character
        sc.close();
    }
}