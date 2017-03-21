package br.com.caelum.apresentacao.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ExemploHtml5Bean implements Serializable {
	private static final long serialVersionUID = 6895599338081487342L;

	private String email;

	public String getEmail() {
		System.out.println(email);
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
