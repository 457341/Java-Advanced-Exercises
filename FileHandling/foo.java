import java.io.*;

public class foo{
    public static void main(String [] args){
        try {
            File f = new File("javaFile.txt");
            FileInputStream in = new FileInputStream("yazma.txt");
            if(f.createNewFile()){
                System.out.println("new file is created");
            }
            else{
                System.out.println("new file is not created");
            }
            String str = "manzoor hussain";
            in.write(str);
            f.getName();
             System.out.println(f.getName());
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
}