import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class olay1{

    JFrame pencere = new JFrame("ornek");
    JCheckBox ch1,ch2,ch3;
    public olay1(){
        
        ch1 = new JCheckBox("kirmizi");
        ch2 = new JCheckBox("sari");
        ch3 = new JCheckBox("lacivert");
        pencere.setLayout(new FlowLayout());
        pencere.add(ch1);
        pencere.add(ch2);
        pencere.add(ch3);
        pencere.setVisible(true);
        pencere.setSize(100,152);



        dinleyici handler = new dinleyici();
        ch1.addActionListener(handler);
        ch2.addActionListener(handler);
        ch3.addActionListener(handler);
        //ch1.a
    }
    public static void main(String [] args){
        olay1 o1 = new olay1();
    }
    class dinleyici implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(ch1.isSelected() == true & ch2.isSelected() == true  & ch2.isSelected() == false )
                System.out.println("Galatasaray");
            else if(ch1.isSelected() == false & ch2.isSelected() == true  & ch2.isSelected() == true )
                System.out.println("Fenerbahce");
            else
                System.out.println("bilinmeyen");
        }
    }
}