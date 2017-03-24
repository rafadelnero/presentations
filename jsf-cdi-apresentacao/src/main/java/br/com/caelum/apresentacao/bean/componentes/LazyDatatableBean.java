package br.com.caelum.apresentacao.bean.componentes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import br.com.caelum.apresentacao.modelo.Pessoa;
import br.com.caelum.apresentacao.service.PessoaService;

@Named
@ViewScoped
public class LazyDatatableBean implements Serializable {

	private static final long serialVersionUID = 4006702234316294584L;
	
	private PessoaService pessoaService = new PessoaService();
	private LazyDataModel<Pessoa> pessoaLazyModel;
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	private int idade;
	
	@PostConstruct
	public void inicia() {
		pessoas = new ArrayList<>();
	}

	public void buscaPessoasLazy() {
		pessoaLazyModel = new LazyDataModel<Pessoa>() {
			private static final long serialVersionUID = 1323423432L;

			@Override
			public List<Pessoa> load(int first, int pageSize, String sortField, SortOrder sortOrder,
					Map<String, Object> filters) {
				pessoas = pessoaService.buscaPessoasPor(first, pageSize);
				
				setRowCount(pessoaService.contaTodasPessoas());
				
				return pessoas;
			}
		};
	}

	public LazyDataModel<Pessoa> getPessoaLazyModel() {
		return pessoaLazyModel;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
