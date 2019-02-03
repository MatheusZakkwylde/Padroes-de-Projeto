
package com.facade.interfaces;

import com.facade.computador.CPU;
import com.facade.computador.HardDrive;
import com.facade.computador.Memoria;

public class Facade {
    private CPU cpu = null;
    private Memoria memoria = null;
    private HardDrive haddrive = null;

    public Facade(CPU cpu, Memoria memoria,HardDrive harddrive) {
        this.cpu=cpu;
        this.haddrive=harddrive;
        this.memoria= memoria;
    }
    
    public void ligarComputador (){
        cpu.start();
        haddrive.read();
        memoria.load();
        cpu.execute();
        memoria.free();
    }
    
}
