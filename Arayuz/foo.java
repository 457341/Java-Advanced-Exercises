import java.awt.*;
import javax.swing.*;
public class foo{
    public static void main(String [] args){
        JFrame pencere = new JFrame("Butonlar ornegi");
       pencere.setSize(230,200);
       //pencere.setVisible(true); bu satr her zaman en sonda yazilmali cunku bouyutu dogru gostermiyor.........
        pencere.setLayout(new FlowLayout());//pencere.setLayout(new GridLayout(1,2)); bu da olabilir....
        JLabel label = new JLabel("isim-soyisim: ");
        pencere.add(label);
        JTextField txt = new JTextField(10);
        pencere.add(txt); 
        pencere.setLayout(new FlowLayout());
        JLabel label2 = new JLabel("Cinsiyet: ");
        JRadioButton rb = new JRadioButton("Erkek");
        JRadioButton rb2 = new JRadioButton("Bayan");
        pencere.add(label2);
        pencere.add(rb);
        pencere.add(rb2);
        pencere.add(new JLabel("Kayit yaptirmak istegdiniz kurslar:"));
        pencere.setLayout(new FlowLayout());
        pencere.add(new JLabel("Resim"));
        pencere.add(new JCheckBox());
        pencere.add(new JLabel("Gitar"));
        pencere.add(new JCheckBox());
        pencere.add(new JLabel("Dans"));
        pencere.add(new JCheckBox());

        //pencere.setBounds(50,50,230,200);
       // pencere.setSize(230,200);
       pencere.setVisible(true);


        //pencere.add(new TextArea());

    //pencere.pack();
    }
}