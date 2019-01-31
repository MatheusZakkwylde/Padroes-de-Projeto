package br.padroes.bridge;

public class JanelaDialogoAbstracaoConcreta extends JanelaAbstracao {

	public JanelaDialogoAbstracaoConcreta(Implementador janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Diálogo");
		desenharBotao("Botão Sim");
		desenharBotao("Botão Não");
		desenharBotao("Botão Cancelar");
	}

}
