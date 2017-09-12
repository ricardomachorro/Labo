/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidormain;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Convertidor extends JFrame implements ActionListener{
    
    
    private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btp,btce,btconv;
    private JTextField txa;
    private JPanel pn1,pn2;
    
    
    public Convertidor(){
        VentanaConstruccion();
        Contenido();
    }
    
    private void VentanaConstruccion(){
        setSize(500,600);
        setTitle("Convertidor");
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(new Color(220, 216,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    private void Contenido(){
       
       txa=new JTextField();
       txa.setBounds(0,0,500,100);
       txa.setVisible(true);
	add(txa);
	   pn1=new JPanel();
           pn1.setBounds(0, 200, 200, 100);
	   pn1.setLayout(new GridLayout(3,4,0,0));
	   pn2=new JPanel();
	   pn2.setLayout(new GridLayout(1,2,0,0));
	   
	   bt1=new JButton("1");
	   bt1.setVisible(true);
	   bt1.addActionListener(this);
	   bt2=new JButton("2");
	   bt2.setVisible(true);
	   bt2.addActionListener(this);
       bt3=new JButton("3");
	   bt3.setVisible(true);
	   bt3.addActionListener(this);
       bt4=new JButton("4");
	   bt4.setVisible(true);
	   bt4.addActionListener(this);
	   bt5=new JButton("5");
	   bt5.setVisible(true);
	   bt5.addActionListener(this);
	   bt6=new JButton("6");
	   bt6.setVisible(true);
	   bt6.addActionListener(this);
	   bt7=new JButton("7");
	   bt7.setVisible(true);
	   bt7.addActionListener(this);
	   bt8=new JButton("8");
	   bt8.setVisible(true);
	   bt8.addActionListener(this);
	   bt9=new JButton("9");
	   bt9.setVisible(true);
	   bt9.addActionListener(this);
	   bt0=new JButton("0");
	   bt0.setVisible(true);
	   bt0.addActionListener(this);
	   btp=new JButton(".");
	   btp.setVisible(true);
	   btp.addActionListener(this);
	   btce=new JButton("ce");
	   btce.setVisible(true);
	   btce.addActionListener(this);
	   btconv=new JButton("convertir");
	   btconv.setVisible(true);
	   btconv.addActionListener(this);
	   pn1.add(bt1);
	   pn1.add(bt2);
	   pn1.add(bt3);
	   pn1.add(bt4);
	   pn1.add(bt5);
	   pn1.add(bt6);
	   pn1.add(bt7);
	   pn1.add(bt8);
	   pn1.add(bt9);
	   pn1.add(bt0);
	   pn1.add(btp);
           pn1.setVisible(true);
	   pn2.setBounds(0, 400, 200, 100);
	   add (pn1);
	   pn2.add(btce);
	   pn2.add(btconv);
           pn2.setVisible(true);
	   add(pn2);
	}
	
	public double Conversion(){
       double n1=Double.parseDouble(txa.getText());
	   double n2=n1/19;
	   return n2;
	}
    

   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
		   txa.setText(txa.getText()+"1");
    }else if(e.getSource()==bt2){
		txa.setText(txa.getText()+"2");
	}else if(e.getSource()==bt3){
		txa.setText(txa.getText()+"3");
	}else if(e.getSource()==bt4){
		txa.setText(txa.getText()+"4");
	}else if(e.getSource()==bt5){
		txa.setText(txa.getText()+"5");
	}else if(e.getSource()==bt6){
		txa.setText(txa.getText()+"6");
	}else if(e.getSource()==bt7){
		txa.setText(txa.getText()+"7");
	}else if(e.getSource()==bt8){
		txa.setText(txa.getText()+"8");
	}else if(e.getSource()==bt9){
		txa.setText(txa.getText()+"9");
	}else if(e.getSource()==btp){
		txa.setText(txa.getText()+".");
	}else if(e.getSource()==btce){
		txa.setText("");
	}else if(e.getSource()==btconv){
		txa.setText(String.valueOf(Conversion()));
	}
    }
 }