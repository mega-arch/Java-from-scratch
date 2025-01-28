import java.util.Scanner;
public class P2{
    public static void main(String a[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter year:");
        int year= sc.nextInt();
            if ((year%4==0 && year%100!=0) || (year%400==0)) { //if a year div either by 4 (for non centurian year) or 400 but not div for 100 is leap year
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+" is not a leap year");
            }
        }
    }
