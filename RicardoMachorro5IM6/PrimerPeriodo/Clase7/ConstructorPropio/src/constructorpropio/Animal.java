/**@author:  Ricardo Alberto Machorro Vences
 * @version:  1.0 
 * @date: 03-09-2017
 */

package constructorpropio;


public class Animal {
    public Animal(){
        System.out.println("Hay un animal");
    }
    
    public Animal(String nombre){
        if(nombre.equalsIgnoreCase("tierra")){
            System.out.println("Corre");
        }else if(nombre.equalsIgnoreCase("mar")){
            System.out.println("Nada");
        }else if(nombre.equalsIgnoreCase("aire")){
            System.out.println("vuela");
        }else{
            System.out.println("Eliga un medio de desplazamiento");
        }
    }
    
    public Animal(double peso){
        if(peso>30){
            System.out.println("Esta en forma");
        }else{
            System.out.println("Esta gordo");
        }
    }
}
