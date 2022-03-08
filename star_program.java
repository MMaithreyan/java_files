import java.util.Scanner;

public class star_program {

    public static void main(String[] args) {
      
      try (Scanner myObj = new Scanner(System.in)) {
        int a=myObj.nextInt();

         for(int i=0 ; i<a ; i++){

            for(int j=0 ; j<=i ; j++){

              System.out.print("*");

            }
            System.out.println(" ");
 }
      }
}
}


//  * 
//  ** 
//  *** 
//  **** 
//  *****