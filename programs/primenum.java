package programs;

import java.util.Scanner;

public class primenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("NOt a prime mumber");
        }
    }
    
}
