/**@author:  Ricardo Alberto Machorro Vences
 * @version:  1.0 
 * @date: 03-09-2017
 */
package ejemploconstructor;

public class EjemploConstructor {

  
    public static void main(String[] args) {
        double n=2.34;
        String nom="ferrari";
        boolean opccion=true;
       try{
       Coche munstang=new Coche(n);
       Coche ferrari=new Coche(nom);
       Coche bocho=new Coche();
       //Construcotr mal hecho
        Coche taxi=new Coche(opccion);
       
           
       }catch(Exception error){
           System.out.println("Error de Constructor:");
           System.out.println(error.toString());
       }
       
    }
    
}
