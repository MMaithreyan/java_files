package programs;

public class fiboseries {
    public static void main (String[] args){
        int st=0, end=1;

        System.out.print(st+" "+end);

        for(int i=0 ; i<10 ; i++){
            int sum=st+end;
            st=end;
            end = sum;
            System.out.print(" "+sum);
        }
    }
    
}
