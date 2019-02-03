
package com.strategy.impostos;

import com.strategy.interfaces.Strategy;

public class Impostos {
   public double  calcular (Strategy objeto){
      return objeto.calcular();
   } 
}
