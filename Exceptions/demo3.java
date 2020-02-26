import java.io.*;
public class demo3{
    public void calis(){
        try{
           cokClais();
           System.out.println("clais ");
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println(e);
        }
    }
    public void cokClais() throws Exception{
        File f = new File("ornek.txt");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        System.out.println(bf.readLine());
            
    }
    public static void main(String [] arhs){
        demo3 de = new demo3();
        de.calis();

    }
}