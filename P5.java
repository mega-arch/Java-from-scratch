import java.util.Scanner; 

public class P5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur string:");
        String name= sc.nextLine();
        vowel(name); 

        }
    static void vowel(String name){ 

        name=name.toLowerCase();

        for (int i=0;i<name.length();i++){

            char ch = name.charAt(i);
            switch(ch){
                case 'a': 
                case 'e':
                case 'i': 
                case 'o': 
                case 'u': 
                System.out.println("is a vowel");break;

                default: System.out.println("not a vowel");

    }
        
    }
    
}
}
