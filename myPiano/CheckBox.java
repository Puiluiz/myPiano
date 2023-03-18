package myPiano;
import javax.swing.*;
import java.awt.event.*;  

public class CheckBox extends JFrame implements ActionListener{
    private JLabel label;
    private JCheckBox C, D, E, F, G, A, B, Db, Eb, Gb, Ab, Bb;
    private JButton random;
    private JPanel panel;

    CheckBox(){  
        panel = new JPanel();
        label = new JLabel("Random Keys");  
        label.setBounds(50,0,300,20);  

        C = new JCheckBox("C");  
        D = new JCheckBox("D");   
        E = new JCheckBox("E");
        F = new JCheckBox("F");
        G = new JCheckBox("G");
        A = new JCheckBox("A");
        B = new JCheckBox("B");
        Db = new JCheckBox("Db");
        Eb = new JCheckBox("Eb");
        Gb = new JCheckBox("Gb");
        Ab = new JCheckBox("Ab");
        Bb = new JCheckBox("Bb");

        C.setBounds(100,50,150,20);
        D.setBounds(100,100,150,20);
        E.setBounds(100,150,150,20);
        F.setBounds(100,200,150,20);
        G.setBounds(100,250,150,20);
        A.setBounds(100,300,150,20);
        B.setBounds(100,350,150,20);
        Db.setBounds(100,400,150,20);
        Eb.setBounds(100,450,150,20);
        Gb.setBounds(100,500,150,20);
        Ab.setBounds(100,550,150,20);
        Bb.setBounds(100,600,150,20);
        
        
        random = new JButton("random");  
        random.setBounds(100,650,80,30);  
        random.addActionListener(this); 

        panel.setBounds(0, 0, 700, 700);
        panel.setVisible(true);
        panel.setLayout(null);
        add(panel);

        panel.add(label);
        panel.add(random);
        panel.add(C);
        panel.add(D);
        panel.add(E);
        panel.add(F);
        panel.add(G);
        panel.add(A);
        panel.add(B);
        panel.add(Db);
        panel.add(Eb);
        panel.add(Gb);
        panel.add(Ab);
        panel.add(Bb);
        
        setSize(700,700);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public static void main(String[] args) {  
        new CheckBox();  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }  
}  

