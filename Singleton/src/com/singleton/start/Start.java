/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singleton.start;

import com.singleton.unique.FabricaDeCarro;

/**
 *
 * @author linuxlite-anonymous
 */
public class Start {
    public static void main(String[] args) {
    FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
    System.out.println(fabrica.criarCarroFiat());
    System.out.println(fabrica.criarCarroFord());
    System.out.println(fabrica.criarCarroVolks());
    System.out.println(fabrica.gerarRelatorio());
    }
}
