import java.io.*;

public class test{
    public static void main(String [] args){
        
        try {
            File f = new File("sinav.txt");
            f.createNewFile();
            FileInputStream in = new FileInputStream(f);
            FileOutputStream out = new FileOutputStream(f);
            byte b[] = new byte[(byte)f.length()];
            in.read(b);
            String isim = "manzoor hussain";
            out.write(isim.getBytes());
            out.close();
            String str = new String(isim);
            
            System.out.println(str);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}