

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class sinavSorusu extends JFrame {
    public JLabel label1, label2, label3;
    public JTextField txt1, text2, text3;
    public JButton btn1, btn2;
    public sinavSorusu(){
        this.setTitle("Not Hesapla");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLocation(300, 300);
        this.setLayout(new GridLayout(4,2));
        label1 = new JLabel("vize");
        this.add(label1);
        txt1=new JTextField(10);
        this.add(txt1);
        
        label2= new JLabel("final");
        this.add(label2);
        text2 = new JTextField(10);
        this.add(text2);
        label3= new JLabel("ortalama");
        this.add(label3);
        text3= new JTextField(10);
        this.add(text3);
        text3.setEditable(false);
        btn1= new JButton("Hesapla");
        this.add(btn1);
        btn2 = new JButton("Temizle");
        btn2.setEnabled(false);
        this.add(btn2);
        btn bt= new btn();
        btn2 bt2= new btn2();
        btn1.addActionListener(bt);
        btn2.addActionListener(bt2);
    }
    public static void main(String[] args) {
        sinavSorusu g= new sinavSorusu();
        g.setVisible(true);
    }
class btn implements ActionListener{    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            text3.setEditable(true);
            double sonuc = 0;
            sonuc = 0.6*(double)(Double.parseDouble(text2.getText()))+0.4*(double)(Double.parseDouble(txt1.getText()));
            text3.setText(Double.toString(sonuc));
            btn2.setEnabled(true);
            btn1.setEnabled(false);
            
        }
        catch(NumberFormatException AT){
            text3.setText("uygun format giriniz");
            
        }
        finally
        {
            btn2.setEnabled(true);
            btn1.setEnabled(false);
        }
    }    
}
class btn2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        txt1.setText(null);
        text2.setText(null);
        text3.setText(null);
        text3.setEditable(false);
        btn1.setEnabled(true);
        btn2.setEnabled(false);
    }
    
}
}



