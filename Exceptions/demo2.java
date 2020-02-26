import java.io.*;
public class demo2{
    public void calis(int arr[]){
        try{
            for(int i = 0;i<5;i++){
                System.out.println(arr[i]);
            }
        }catch(Exception e){
                System.out.println("Error: "+e);
        }
            
        System.out.println("It is finished");
            
    }
    public static void main(String [] args){
        demo2 d = new demo2();
        int arr[] = {1,2,3,4};
        d.calis(arr);
      
    }
}