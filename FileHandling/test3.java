
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("ornek.txt");
		char veriler[] = new char[((int) f.length())];
		try{
			f.createNewFile();
			FileWriter yazdir = new FileWriter(f);
			String yazilacak = "bu bir deneme yazisidir.";
			String yaz = "This is Java programming lecture ";
			yazdir.write(yazilacak);
			//yazdir.close(); kapitirsak stream closed diye hata verecektlr
			yazdir.write(yaz);
			yazdir.close();
			FileReader f2 = new FileReader(f);
			f2.read(veriler);
			String okunan = new String(veriler);
			System.out.println(okunan);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}

