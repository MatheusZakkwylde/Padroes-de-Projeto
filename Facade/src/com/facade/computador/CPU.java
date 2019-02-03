package com.facade.computador;

public class CPU {

    public void start() {
        System.out.println("Inicializaçao inicial");
    }

    public void execute() {
        System.out.println("Executa algo o Processador");
    }

    public void load() {
        System.out.println("Carregar Registrador");
    }

    public void free() {
        System.out.println("liberar Registrador");
    }
}
