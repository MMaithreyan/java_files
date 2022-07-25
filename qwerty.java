import java.util.*;

public class qwerty {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);

    int a[]=new int [5];

    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);

    for(int j=0;j<=a.length;j++){
        System.out.print(a[j]);
    }

    }
}
