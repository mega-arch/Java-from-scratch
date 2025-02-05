// gcd of num & optimized approach of euclideon 
public class P10 {
    static void gcd(){
        int a=10,b=15;
        int min=Math.min(a,b);
        for (int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
            System.out.println(i);
            }
            break;
        }
    }
//basics of types of methods
    static void display(){ //called function
        int a=10,b=15;
        System.out.print(a+" ");
        System.out.println(b);
    }
//cleaning input string removing symbols and converting them to lowercase
    static void clean(){
        String inp="he@3LlO";
        inp=inp.replaceAll("[^a-zA-Z]","").toLowerCase();
        System.out.println("Cleaned:"+inp);

    }
    public static void main(String[] args) {
        System.out.println("Find GCD of a no.: ");
        gcd();
        System.out.println("Giving example of method types: ");
        display();
        System.out.println("Cleaning input string removing spl symbols and converting to lowercase");
        clean();
    }
    
}