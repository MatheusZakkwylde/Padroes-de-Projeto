package br.padroes.bridge;

public class JanelaLinuxConcreto implements Implementador {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " - Janela Linux");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Linux");
	}

}
