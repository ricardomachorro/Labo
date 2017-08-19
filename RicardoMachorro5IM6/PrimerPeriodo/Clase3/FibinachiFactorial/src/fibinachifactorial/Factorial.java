/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibinachifactorial;

import java.util.ArrayList;


public class Factorial {
     
     public int Fact(int num){
         int num1=1;
        if(num!=0){
           for(int i=2;i<=num;i++){
            num1*=i;
           } 
      }
     return num1; 
   }
}
