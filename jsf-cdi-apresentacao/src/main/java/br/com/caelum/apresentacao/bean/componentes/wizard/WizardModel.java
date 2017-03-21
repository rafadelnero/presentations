package br.com.caelum.apresentacao.bean.componentes.wizard;

import br.com.caelum.apresentacao.modelo.Pessoa;

public class WizardModel {
	
	private Pessoa pessoa = new Pessoa();

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
