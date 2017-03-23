package br.com.caelum.apresentacao.bean.componentes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.caelum.apresentacao.mock.IdadeMock;
import br.com.caelum.apresentacao.mock.PessoaMock;
import br.com.caelum.apresentacao.modelo.Pessoa;
import br.com.caelum.apresentacao.service.PessoaService;

@Named
@ViewScoped
public class ComboboxBean implements Serializable {

	private static final long serialVersionUID = -7318847189794096642L;
	
	private PessoaService pessoaService = new PessoaService();
	
	private long idPessoaSelecionada;

	private List<Pessoa> todasPessoas;
	private List<Pessoa> pessoasFiltradas = new ArrayList<>();
	
	private List<Integer> idadesMinimasDasPessoas = new ArrayList<>();
	
	private Integer idadeMinimaSelecionada;
	
	@PostConstruct
	public void inicia() {
		todasPessoas = PessoaMock.getPessoas();
		idadesMinimasDasPessoas = IdadeMock.getIdadesMinimas();
	}
	
	public void filtraPessoasComIdadeMaioresQueEssa(AjaxBehaviorEvent event) {
		pessoasFiltradas = pessoaService.filtraPorIdade(todasPessoas, idadeMinimaSelecionada);
	}
	
	public List<Pessoa> getPessoasFiltradas() {
		return pessoasFiltradas;
	}
	
	public List<Pessoa> getTodasPessoas() {
		return todasPessoas;
	}
	
	public List<Integer> getIdadesMinimasDasPessoas() {
		return idadesMinimasDasPessoas;
	}

	public Integer getIdadeMinimaSelecionada() {
		return idadeMinimaSelecionada;
	}

	public void setIdadeMinimaSelecionada(Integer idadeMinimaSelecionada) {
		this.idadeMinimaSelecionada = idadeMinimaSelecionada;
	}

	public long getIdPessoaSelecionada() {
		return idPessoaSelecionada;
	}

	public void setIdPessoaSelecionada(long idPessoaSelecionada) {
		this.idPessoaSelecionada = idPessoaSelecionada;
	}

}
