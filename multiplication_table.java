import java.util.*;
class multiplication_table {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();

        for(int i=1 ;i<=10 ; i++){
            System.out.println(a*i);
        }
    }
}
