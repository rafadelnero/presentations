package br.com.caelum.apresentacao.bean.escopo;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class TesteApplicationScopedBean implements Serializable {

	private static final long serialVersionUID = 4432365549527738382L;
	
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
