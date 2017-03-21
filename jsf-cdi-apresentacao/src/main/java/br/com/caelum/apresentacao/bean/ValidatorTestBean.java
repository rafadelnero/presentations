package br.com.caelum.apresentacao.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.caelum.apresentacao.util.FacesUtil;

@Named
@ViewScoped
public class ValidatorTestBean implements Serializable {
	
	private static final long serialVersionUID = -2766592551501054172L;
	private String name;
	
	public void validate() {
		FacesUtil.addInfoMessage(name + " está válido!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
