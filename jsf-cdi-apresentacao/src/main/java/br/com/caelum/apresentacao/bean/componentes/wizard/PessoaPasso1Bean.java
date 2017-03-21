package br.com.caelum.apresentacao.bean.componentes.wizard;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.caelum.apresentacao.modelo.Pessoa;

@Named
@ViewScoped
public class PessoaPasso1Bean implements Serializable {
	
	private static final long serialVersionUID = 3037552486029677923L;

	@Inject
	private WizardPessoaBean wizardBean;

	public Pessoa getPessoa() {
		return wizardBean.getModel().getPessoa();
	}

}
