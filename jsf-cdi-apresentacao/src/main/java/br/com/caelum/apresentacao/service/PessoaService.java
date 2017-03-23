package br.com.caelum.apresentacao.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import br.com.caelum.apresentacao.mock.PessoaMock;
import br.com.caelum.apresentacao.modelo.Pessoa;

@RequestScoped
public class PessoaService implements Serializable {

	private static final long serialVersionUID = 4748721756281257335L;

	public TreeNode getPessoasParaTreeTable() {
		TreeNode root = new DefaultTreeNode(new Pessoa(1, "Arvore genealogica", 1), null);
		
		TreeNode voIguinho = new DefaultTreeNode(new Pessoa(2, "Vo Iguinho", 6), root);
		TreeNode voLobato = new DefaultTreeNode(new Pessoa(3, "Vo Lobato", 7), root);
		TreeNode vohMaria = new DefaultTreeNode(new Pessoa(4, "Voh Maria", 8), root);

		TreeNode paiPaulo = new DefaultTreeNode(new Pessoa(5, "Pai Paulo", 46), voIguinho);
		TreeNode paiGalo = new DefaultTreeNode(new Pessoa(6, "Pai Galo", 77), voLobato);
		TreeNode paiJose = new DefaultTreeNode(new Pessoa(7, "Pai Joseh", 77), vohMaria);
		 
		new DefaultTreeNode(new Pessoa(8, "Filho Morato", 46), paiPaulo);
		new DefaultTreeNode(new Pessoa(9, "Filho Carlos", 46), paiGalo);
		new DefaultTreeNode(new Pessoa(10, "Filho Zezinho", 46), paiJose);
		
		return root;
	}

	public List<Pessoa> buscaPessoasPor(int first, int pageSize) {
		return PessoaMock.getPessoas().subList(first, pageSize + first);
	}

	public List<Pessoa> filtraPorIdade(List<Pessoa> pessoas, Integer idadeMinimaSelecionada) {
		List<Pessoa> pessoasFiltradas = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() >= idadeMinimaSelecionada) {
				pessoasFiltradas.add(pessoa);
			}
		}
		
		return pessoasFiltradas;
	}

	public int contaPessoasPor(int idade) {
		int countPessoas = 0;
		
		for (Pessoa pessoa : PessoaMock.getPessoas()) {
			if (pessoa.getIdade() >= idade) {
				countPessoas++;
			}
		}
		return countPessoas;
	}

	public int contaTodasPessoas() {
		return PessoaMock.getPessoas().size();
	}
}
