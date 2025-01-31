//Patterns
public class P7 {
    public static void main(String[] args) {
        Same_num_in_row();
        System.out.println();
        Five_five_symbol();
        System.out.println();
        Pyramid();
    }
    static void Same_num_in_row(){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();

    }
}
    static void Five_five_symbol(){
        int n=5;
        for (int i=5;i<=1;i--){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

    }
        
}
    static void Pyramid(){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i*2+1;j++){
                System.out.print("* ");
            }
            System.out.println();

    }
        
}
}
