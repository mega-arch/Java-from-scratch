//Check palindrome using StringBuilder()
import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter word: ");
        String word= sc.next();
        StringBuilder sb= new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            sb.append(word.charAt(i));
        }
        System.out.println("Reversed word is " +sb);
        if (word.equalsIgnoreCase(sb.toString())){
            System.out.println(word+" is a palindrome");
        }
        else
        System.out.println(word+" is not a palindrome");

        
    } 
}
