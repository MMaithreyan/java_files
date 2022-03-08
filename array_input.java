import java.util.*;
public class array_input {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

     int a=obj.nextInt();

        int array[]=new int[a];
        
        for(int i=0 ;i<a; i++){
            array[i]=obj.nextInt();
        }

        for(int j=0;j<a;j++){
            System.out.println(array[j]);
        }
    }
}