package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class LogeDePedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido foi gerado :" +pedido);
		
	}

}
