package br.com.caelum.apresentacao.bean.componentes.wizard;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.caelum.apresentacao.modelo.Pessoa;
import br.com.caelum.apresentacao.util.FacesUtil;

@Named
@ViewScoped
public class PessoaPasso3Bean implements Serializable {

	private static final long serialVersionUID = -1915401082082663303L;

	@Inject
	private WizardPessoaBean wizardBean;

	public void salva() {
		FacesUtil.addInfoMessage(
				"Bem vindo pessoa com o nome:" + getPessoa().getNome() + " e idade:" + getPessoa().getIdade());
	}

	public Pessoa getPessoa() {
		return wizardBean.getModel().getPessoa();
	}

}
