import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class foo2{

    JFrame pencere = new JFrame("NOT hespalma");
    JTextField txt1,txt2,txt3;
    JLabel label1,label2,label3;
    JButton buton1,buton2;
    public foo2(){
        
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        txt3 = new JTextField(10);
        txt3.setEnabled(false);


        label1 = new JLabel("vize");
        label2 = new JLabel("fianl");
        label3 = new JLabel("ortalama");
        
        buton1 = new JButton("hesapla");
        buton2 = new JButton("temizle");

        pencere.setLayout(new GridLayout(4,2));
        pencere.add(label1);
        pencere.add(txt1);
         pencere.add(label2);
        pencere.add(txt2);
         pencere.add(label3);
        pencere.add(txt3);

        pencere.add(buton1);
        buton1.setEnabled(false);
        pencere.add(buton2);
        buton2.setEnabled(false);

        
        pencere.setSize(300,300);
        pencere.setVisible(true);



        //ch1.a
    }
    public static void main(String [] args){
        foo2 o1 = new foo2();
    }

}