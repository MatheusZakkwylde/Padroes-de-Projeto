
package com.strategy.impostos;

import com.strategy.interfaces.Strategy;

public class ICMS implements Strategy {
    private double valor;

    public ICMS(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double calcular() {
        return valor * 0.10;
    }
    
}
