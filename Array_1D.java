import java.util.Scanner;
public class Array_1D {
    public static void main(String[] args) {
        int[] arra1D= new int[5];
        Scanner in= new Scanner(System.in);

        for(int i=0;i<arra1D.length;i++){
            arra1D[i]=in.nextInt();
            
        }
        for(int j=0;j<arra1D.length;j++){
            System.out.print(arra1D[j]);

        }
        
    }
}
