package br.com.caelum.apresentacao.bean.escopo;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TesteSessionScopedBean implements Serializable {

	private static final long serialVersionUID = 44323527738382L;
	
	private int numero;
	
	public void soma() {
		numero++;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
