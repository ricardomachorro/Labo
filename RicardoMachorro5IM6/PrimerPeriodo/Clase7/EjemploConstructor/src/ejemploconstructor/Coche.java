/**@author:  Ricardo Alberto Machorro Vences
 * @version:  1.0 
 * @date: 03-09-2017
 */
package ejemploconstructor;


public class Coche {
    
    private double  gasolina;
    public String nombre;
    
    //Constructores diferentes para diferentes poarametros d eerntrada
    public Coche(double gasolina){
            this.gasolina=gasolina;
            arrancar();
    }
        
    public Coche(String nombre){
            this.nombre=nombre;
            opccion();
    }
    
    public Coche(){
            existencia();
    }
    
    private void arrancar(){
        if(gasolina>0){
            System.out.println("Arranca");  
        }else{
            System.out.println("No se puyede");
        }
    }
    
    private void opccion(){
        System.out.println("Buena eleccion");
    }
    
    private void existencia(){
        System.out.println("Ya tienes auto");
    }
}
