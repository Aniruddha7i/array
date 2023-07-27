import java.util.Scanner;
public class Sharch_a_number_in_array {
    public static void main(String[] args) {
        // define a array
        int[] arr = {5,5,88,21,20,27,80};

        // Take input
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int t=0;
        // Sherching process
        for(int i=0; i<arr.length;i++){
            if(arr[i]==num){
                System.out.println(num+" is present");
                t=0;
                break;
            }

            else{
                t=1;
                continue;
            }

        }

        if(t==1){
            System.out.println("Not present");
        }
    }
}
