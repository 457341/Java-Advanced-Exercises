import java.io.*;

public class test2{
    public static void main(String [] args){
        File f = new File("sinav.txt");
        char okunan[] = new char[(int)f.length()];
         byte okunan2[] = new byte[(byte)f.length()];
        try {
            
            f.createNewFile();
            InputStream in = new FileInputStream(f);
            OutputStream out = new FileOutputStream(f);
           
           FileReader fr = new FileReader(f);
           FileWriter fw = new FileWriter(f);
            //in.read(b);
            String isim = "manzoor hussain .";
            String info = "from Pakistan  ";
            String str2 =  "Bu java dersidir";

            out.write(isim.getBytes());
            out.write(info.getBytes());
            //out.close();

            in.read(okunan2);
            in.close();

            fw.write(str2);
            fw.close();

            fr.read(okunan);
            fr.close();
            
            

            //out.write(info.getBytes());
            //in.read(okunan2);

            String str = new String(okunan2);
            String str3 = new String(okunan);
            System.out.println(str);System.out.println(str3);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}