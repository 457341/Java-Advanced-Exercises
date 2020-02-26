import java.util.Scanner;
import java.io.*;
public class demo{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        
        try {
            int z = x/y;
            System.out.println("The output is: "+z);

        }catch(Exception e){
            System.out.println("Error found: "+e);
        }finally{
            System.out.println("The end");
        }
    }
}