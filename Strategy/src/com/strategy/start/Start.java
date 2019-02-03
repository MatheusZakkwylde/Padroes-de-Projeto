
package com.strategy.start;

import com.strategy.impostos.ICMS;
import com.strategy.impostos.IPI;
import com.strategy.impostos.Impostos;

public class Start {
    public static void main(String[] args) {
        Impostos calculadora = new Impostos();
        
        
        ICMS icms = new ICMS(100.00);
        IPI ipi = new IPI (200);
        
        System.out.println(calculadora.calcular(icms));
        System.out.println(calculadora.calcular(ipi));
    }
 
}
