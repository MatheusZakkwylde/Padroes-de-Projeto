package br.padroes.bridge;

public abstract class JanelaAbstracao {

    protected Implementador janela;

    public JanelaAbstracao(Implementador janela) {
        this.janela = janela;
    }

    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }

    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }

    public abstract void desenhar();
}
