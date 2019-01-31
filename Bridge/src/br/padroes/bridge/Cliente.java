package br.padroes.bridge;

public class Cliente {
	public static void main(String[] args) {
		JanelaAbstracao janela = new JanelaDialogoAbstracaoConcreta(new JanelaLinuxConcreto());
		janela.desenhar();

		janela = new JanelaDialogoAbstracaoConcreta(new JanelaWindowsConcreto());
		janela.desenhar();
	}
}
