package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcavel;

public class ItemOrcamento implements Orcavel{
	
	private BigDecimal valor;

	public ItemOrcamento(BigDecimal valor) {
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

}
