
package com.strategy.impostos;

import com.strategy.interfaces.Strategy;

public class IPI implements Strategy {
    private double valor;

    public IPI(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double calcular() {
        return valor * 0.20;
    }
    
}
