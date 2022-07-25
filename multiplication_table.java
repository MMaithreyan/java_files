import java.util.*;
class multiplication_table {
    public static void main(String args[] ) throws Exception {
        
        Scanner obj=new Scanner(System.in);
        
        int a=obj.nextInt();

        for(int i=1 ;i<=10 ; i++){
            System.out.println(i + "*" + a + "=" + a*i);
        }
    }
}
