import java.util.*;
class my{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();

       String arr[]=new String[a];

       for(int i=0;i<=a;i++){
           arr[i]=sc.nextLine();
       }
   
       Arrays.sort(arr);
       
       for(int j=0;j<a;j++){
           System.out.println(arr[j]);
       }
    }
}