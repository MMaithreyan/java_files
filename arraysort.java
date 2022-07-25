import java.util.Arrays;
import java.util.Scanner;

public class arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // int a=sc.nextInt();

        int arr[]=new int[50];

        for(int i=0 ;i<5;i++ ){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);

        for(int j=0 ; j<5 ; j++){
        System.out.println(arr[j]);
        }

    }
}