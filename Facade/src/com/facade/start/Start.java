
package com.facade.start;

import com.facade.computador.CPU;
import com.facade.computador.HardDrive;
import com.facade.computador.Memoria;
import com.facade.interfaces.Facade;

public class Start {
    public static void main(String[] args) {
    CPU cpu = new CPU();
    Memoria memoria = new Memoria ();
    HardDrive haddrive = new HardDrive();
        Facade facade = new Facade (cpu,memoria,haddrive);
        facade.ligarComputador();
    }
}
