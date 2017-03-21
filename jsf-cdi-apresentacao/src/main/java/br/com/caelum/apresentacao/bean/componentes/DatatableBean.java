package br.com.caelum.apresentacao.bean.componentes;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.caelum.apresentacao.mock.PessoaMock;
import br.com.caelum.apresentacao.modelo.Pessoa;

@Named
@ViewScoped
public class DatatableBean implements Serializable {

	private static final long serialVersionUID = 3175400441700981365L;
	
	public List<Pessoa> getPessoas() {
		return PessoaMock.getPessoas();
	}

}
