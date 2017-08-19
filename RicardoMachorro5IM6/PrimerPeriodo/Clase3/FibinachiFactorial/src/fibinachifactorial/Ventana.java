/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibinachifactorial;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ricardo
 */
public class Ventana extends JFrame implements ActionListener {
    private JLabel titulo;
    private JLabel lbnumero,lbconvertir,lbfin,lbtifn;
    private JTextField txnumero;
    private JComboBox opcombo;
    private JButton btcon;
    
    public Ventana(){
        CrearVentana();
        Contenido();
    }
    
    private void CrearVentana(){
        setSize(750,610);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Fibonachi-Factoial");
        setBackground(new Color(220, 216,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    private void Contenido(){
        titulo=new JLabel("Fibonachi-Decimal");
        titulo.setBounds(250,5,200,25);
        titulo.setFont(new Font("TimesRoman",Font.BOLD,18));
        add(titulo);
        titulo.setVisible(true);
        
       lbnumero=new JLabel("Numero");
       lbnumero.setBounds(50,90,80,25);
       lbnumero.setFont(new Font("TimesRoman",Font.BOLD,18));
       lbnumero.setVisible(true);
       add(lbnumero);
       
       txnumero= new JTextField();
       txnumero.setBounds(150,90,400,25);
       add(txnumero);
       txnumero.setVisible(true);
       
       opcombo=new JComboBox();
       opcombo.setBounds(180,140,300,25);
       opcombo.addItem("Fibonachi");
       opcombo.addItem("Factorial");
       add(opcombo);
       opcombo.setVisible(true);
       
       btcon=new JButton("Convertir");
       btcon.setBounds(190,230,300,25);
       btcon.addActionListener(this);
       add(btcon);
       btcon.setVisible(true);
       
       lbtifn=new JLabel("");
       lbtifn.setBounds(250,300,400,25);
       lbtifn.setFont(new Font("TimesRoman",Font.BOLD,18));
       add(lbtifn);
       lbtifn.setVisible(true);
       
       lbfin=new JLabel("");
       lbfin.setBounds(260,340,400,25);
       lbfin.setFont(new Font("TimesRoman",Font.BOLD,18));
       add(lbfin);
       lbfin.setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btcon){
         if(txnumero.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Llene el apartado");
         }else{
             if(txnumero.getText().matches("[0-9]*")){
                 if(opcombo.getSelectedIndex()==0){
                   Fibonachi fb=new Fibonachi();
                   lbtifn.setText("Lista de numeros del 0 al " + txnumero.getText());
                   lbfin.setText(String.valueOf(fb.Fib(Integer.parseInt(txnumero.getText()))));
                 }else{
                     if(opcombo.getSelectedIndex()==1){
                         Factorial fct=new Factorial();
                         lbtifn.setText("Fctorial de " +  txnumero.getText());
                         lbfin.setText(String.valueOf(fct.Fact(Integer.parseInt(txnumero.getText()))));
                     }
                 }
                   
             }else{
                 JOptionPane.showMessageDialog(null, "Ponga un numero entero positvo");
             }
         }
       }
    }
    
}
