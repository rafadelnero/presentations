package br.com.caelum.apresentacao.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.apresentacao.modelo.Pessoa;

public final class PessoaMock {

	public static final int IDADE_PARA_SOMAR = 18;

	private PessoaMock() {
		super();
	}

	public static List<Pessoa> getPessoas() {
		List<Pessoa> pessoas = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			Pessoa pessoa = new Pessoa();

			pessoa.setId(i);
			pessoa.setNome("Pessoa" + i);
			pessoa.setIdade(i + IDADE_PARA_SOMAR);

			pessoas.add(pessoa);
		}

		return pessoas;
	}
}
