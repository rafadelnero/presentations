package br.com.caelum.apresentacao.bean.escopo;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TesteRequestScopedBean implements Serializable {

	private static final long serialVersionUID = 5459898303560429365L;
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
