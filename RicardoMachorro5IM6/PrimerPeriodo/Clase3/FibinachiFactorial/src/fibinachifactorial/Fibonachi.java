/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibinachifactorial;

import java.util.*;

/**
 *
 * @author Ricardo
 */
public class Fibonachi {
    
    public String Fib(int num){
        Integer[] colnum= new Integer[2];
        ArrayList<String> lst=new ArrayList<String>();
        colnum[0]=0;//Antes |1|-|1|-|2|-|3|-|5|
        colnum[1]=1;//Actual |0|-|1|-|1|-|2|-|3|
         lst.add("0");
        if(num!=0){
           for(int i=1;i<=num;i++){
               int numfi=colnum[0];
               colnum[0]=colnum[0]+colnum[1];
               lst.add(String.valueOf(colnum[0]));
               colnum[1]=numfi;
           }
        }
        return lst.toString();
    }
    
}
