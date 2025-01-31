public class P4 {
    static void ternary_op(int a){
        boolean b= (a<15)?true:false; //ternary operator
        System.out.println(b);
    }
    static void print_n_num(int i){
        for(;i<10;){
            System.out.println(i);
            i++;
        }
    }

    static void access_array(int a[]){
        for (int temp:a){
            System.out.println(temp);
            temp++;
        }
    }

    static void range_of_2values(){
        for(int i=1,j=5;i<=5;i++,j--){
            System.out.println(i+" "+j);
        }
    }

    public static void main(String[] args) {
        ternary_op(10);
        print_n_num(1);
        access_array(new int[] {1,2,3});
        range_of_2values();

    }
    
}


