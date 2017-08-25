
package tcpjava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ventana extends JFrame implements ActionListener{
    
    private JLabel titulo,lbA,lbB,lbC,lbresult;
    private JButton btTCP;
    private JTextField txa,txb,txc;
    
    
    public Ventana(){
        VentanaConstruccion();
        Contenido();
    }
    
    private void VentanaConstruccion(){
        setSize(500,600);
        setTitle("TCP y CP");
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(new Color(220, 216,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    private void Contenido(){
       titulo=new JLabel("TCP Y CP");
       titulo.setBounds(100,0,350,68);
       titulo.setFont(new Font("TimesRoman",Font.BOLD,68));
       add(titulo);
       titulo.setVisible(true);
     
       lbA=new JLabel("A");
       lbA.setBounds(190,140,100,38);
       lbA.setFont(new Font("TimesRoman",Font.BOLD,38));
       lbA.setVisible(true);
       add(lbA);
       txa=new JTextField();
       txa.setBounds(230,150,200,30);
       txa.setVisible(true);
       add(txa);
       lbB=new JLabel("B");
       lbB.setBounds(190,220,100,38);
       lbB.setFont(new Font("TimesRoman",Font.BOLD,38));
       lbB.setVisible(true);
       add(lbB);
       txb=new JTextField();
       txb.setBounds(230,230,200,30);
       txb.setVisible(true);
       add(txb);
       lbC=new JLabel("C");
       lbC.setBounds(190,290,100,38);
       lbC.setFont(new Font("TimesRoman",Font.BOLD,38));
       lbC.setVisible(true);
       add(lbC);
       txc=new JTextField();
       txc.setBounds(230,300,200,30);
       txc.setVisible(true);
       add(txc);
       
       btTCP=new JButton("Comprobar");
       btTCP.setBounds(180,360,200,30);
       btTCP.setVisible(true);
       btTCP.addActionListener(this);
       add(btTCP);
       
       lbresult=new JLabel();
       lbresult.setBounds(100,400,400,38);
       lbresult.setFont(new Font("TimesRoman",Font.BOLD,38));
       lbresult.setVisible(true);
       add(lbresult);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btTCP){
            if(!txa.getText().isEmpty()||!txb.getText().isEmpty()||!txc.getText().isEmpty()){
                try{
                    TCP nt= new TCP();
                    int n1=Integer.parseInt(txa.getText());
                    int n2=Integer.parseInt(txb.getText());
                    int n3=Integer.parseInt(txc.getText());
                    lbresult.setText(nt.Tri(n1, n2, n3));
                }catch(NumberFormatException nfe){
                     JOptionPane.showMessageDialog(null,"Ponga numeros");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Llene todos los apartados");
            }
        }
    }
}
