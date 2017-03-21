package br.com.caelum.apresentacao.bean.componentes;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.TreeNode;

import br.com.caelum.apresentacao.service.PessoaService;

@Named
@ViewScoped
public class TreeTableBean implements Serializable {

	private static final long serialVersionUID = 1316786037220440187L;

	private TreeNode root;

	@Inject
	private PessoaService service;


	@PostConstruct
	public void init() {
		root = service.getPessoasParaTreeTable();
	}

	public TreeNode getRoot() {
		return root;
	}
}
