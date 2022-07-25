import java.util.*;

public class casa
{
   
    public static int c,d,v;

    public static  int newdenom = 0;
   
    public static  int sum = 0;
   
   
   

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

c = scanner.nextInt();
d = scanner.nextInt();
v = scanner.nextInt();

int[] coins = new int[d];
for(int i=0;i<d;i++){
       coins[i] = scanner.nextInt();
   }
   
   min(v,coins);
}


    public static void min(int v,int[] coins){
        int[] coinList = new int[10];
       
        int i, k = 0;
 
    for ( i = d - 1; i >= 0; i--) {
        while (v >= coins[i]) {
            v -= coins[i];
            // Add coin in the list
            coinList[k++] = coins[i];
        }
    }
 
    for ( i = 0; i < k; i++) {
        // Print
        sum += coinList[i];
       
    }
       
       
        if(sum != v){
            System.out.println(newdenom);
        }
    }
}