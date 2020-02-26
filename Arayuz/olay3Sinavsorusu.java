import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class olay3Sinavsorusu{

    JFrame pencere = new JFrame("NOT hespalma");
    JTextField txt1,txt2,txt3;
    JLabel label1,label2,label3;
    JButton buton1,buton2;
    public olay3Sinavsorusu(){
        
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        txt3 = new JTextField(10);

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
        pencere.add(buton2);
        buton2.setEnabled(false);

        pencere.setVisible(true);
        pencere.setSize(300,300);



        dinleyici1 handler = new dinleyici1();
        buton1.addActionListener(handler);
        dinleyici2 handler2 = new dinleyici2();
        buton2.addActionListener(handler2);
        //ch1.a
    }
    public static void main(String [] args){
        olay3Sinavsorusu o1 = new olay3Sinavsorusu();
    }
    class dinleyici1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                txt3.setEditable(true);
                double sonuc = 0;
                sonuc = 0.6 *(double)(Double.parseDouble(txt2.getText())) + 0.4 *(double)(Double.parseDouble(txt1.getText()));
                txt3.setText(Double.toString(sonuc));
                
                buton2.setEnabled(true);
                buton1.setEnabled(false);
            }catch(NumberFormatException ex){
                txt3.setText("uygun format giriniz");
            }finally {
                 buton1.setEnabled(false);
                buton2.setEnabled(true);
            }
                

        }
    
    }
    class dinleyici2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            txt1.setText(null);
            txt2.setText(null);
            txt3.setText(null);
            buton1.setEnabled(true);
            buton2.setEnabled(false);
        }
    }
}