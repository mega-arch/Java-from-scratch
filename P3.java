import java.util.Scanner;
public class P3{
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter no.:");
        int a= sc.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){ //a will be the nth term till which we need to add all the natural no. from 1-n
            sum+=i; //after each iteration value of i is increamented to add with the next natural no.
        }
        System.out.println("sum of natural no. is:"+sum);

    }
}