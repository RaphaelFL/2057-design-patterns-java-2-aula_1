package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.http.ApacheHttpAdapter;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroOrcamento;
import br.com.alura.loja.orcamento.situacao.ItemOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamento registro = new RegistroOrcamento(new ApacheHttpAdapter());
		registro.registrar(orcamento);
	}

}
