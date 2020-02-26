import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class olay2{

    JFrame pencere = new JFrame("ornek");
    JTextField txt;
    JLabel label;
    JButton buton;
    public olay2(){
        
        txt = new JTextField(10);
        label = new JLabel("Tanimsiz");
        buton = new JButton("tamam");
        pencere.setLayout(new FlowLayout());
        pencere.add(label);
        pencere.add(txt);
        pencere.add(buton);
        pencere.setVisible(true);
        pencere.setSize(100,152);



        dinleyici handler = new dinleyici();
        buton.addActionListener(handler);
        //ch1.a
    }
    public static void main(String [] args){
        olay2 o1 = new olay2();
    }
    class dinleyici implements ActionListener{
        public void actionPerformed(ActionEvent e){
            label.setText(txt.getText());
            txt.setText(null);
            txt.setEnabled(false);
            buton.setText("bitt");
            buton.setEnabled(false);
        }
    }
}