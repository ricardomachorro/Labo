/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

public class Calculadora {
    private float resultado;
    private float numero1;
    private float numero2;
    private int opcion;
    
    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
     String resp="Si";
     while(resp.equalsIgnoreCase("si")){
          System.out.println("Teclear opciones");
     System.out.println("Teclear 1 para suma");
     System.out.println("Teclear 2 para resta");
     System.out.println("Teclear 3 para multiplicacion");
     System.out.println("Teclear 4 para division");
     Calculadora cal= new Calculadora();
     cal.opcion=leer.nextInt();
     switch(cal.opcion){
         case 1:
             System.out.println("Teclar primer numero");
             cal.numero1=leer.nextInt();
             System.out.println("Teclar segundo numero");
             cal.numero2=leer.nextInt();
             System.out.println("el resultado es " + cal.suma(cal.numero1,cal.numero2));
             
         break;
         case 2:
             System.out.println("Teclar primer numero");
             cal.numero1=leer.nextInt();
             System.out.println("Teclar segundo numero");
             cal.numero2=leer.nextInt();
             System.out.println("el resultado es " + cal.resta(cal.numero1,cal.numero2));
         break;
         case 3:
             System.out.println("Teclar primer numero");
             cal.numero1=leer.nextInt();
             System.out.println("Teclar segundo numero");
             cal.numero2=leer.nextInt();
             System.out.println("el resultado es " + cal.multi(cal.numero1,cal.numero2));
         break;
         case 4:
             int n1;
             int n2;
             System.out.println("Teclar primer numero");
             n1=leer.nextInt();
             System.out.println("Teclar segundo numero");
             n2=leer.nextInt();
             if(n2!=0){
               cal.numero1=n1;
               cal.numero2=n2;
               System.out.println("el resultado es " + cal.div(cal.numero1,cal.numero2));
             }else{
                 System.out.println("No existe la division entre cero"); 
             }
             
            
         break;
         default:
             System.out.println("Eliga una opcion de verdad");
         break;
     }
          System.out.println("Quiere hacer otra operacion Si o NO");
          resp=leer.next();
     }
     
      
      
    }
    public static float suma(float n1,float n2){
        float n=n1+n2;
       return n;
    }
   public static float resta(float n1,float n2){
        float n=n1-n2;
       return n;
    }
    public static float multi(float n1,float n2){
        float n=n1*n2;
       return n;
    }
     public static float div(float n1,float n2){
        float n=n1/n2;
       return n;
    }
    
}
