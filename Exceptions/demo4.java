import java.io.*;
public class demo4{
    public void calis( ) throws Exception{
       throw new Exception("Error found");
    }
    public static void main(String [] arhs){
        try {
            demo4 de = new demo4();
            de.calis();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getLocalizedMessage());
            System.out.println(ex.toString());
        }
        

    }
}