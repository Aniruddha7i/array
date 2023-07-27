import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class cheak {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x,y;
        System.out.println("Enter one integer value: ");
        x=input.nextInt();
        System.out.println("Enter second integer value: ");
        y=input.nextInt();
        System.out.println("The product is: "+x*y);
    }
}
