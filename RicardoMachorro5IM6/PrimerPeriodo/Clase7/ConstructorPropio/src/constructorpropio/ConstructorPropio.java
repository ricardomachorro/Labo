/**@author:  Ricardo Alberto Machorro Vences
 * @version:  1.0 
 * @date: 03-09-2017
 */
package constructorpropio;


public class ConstructorPropio {

    
    public static void main(String[] args) {
       double peso=300;
       boolean n=true;
       try{
       Animal nuevoanimal= new Animal();
       Animal ave=new Animal("aire");
       Animal perro=new Animal("tierra");
       Animal pez= new Animal("mar");
       Animal ballean=new Animal(peso);
       Animal prueba=new Animal(n);
       }catch(Exception error){
           System.out.println(error.toString());
       }
    }
    
}
