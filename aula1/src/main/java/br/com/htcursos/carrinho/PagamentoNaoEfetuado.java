package br.com.htcursos.carrinho;

public class PagamentoNaoEfetuado extends Exception {

	public PagamentoNaoEfetuado() {
		super("O pagamento n�o foi efetuado");
	}
}
