package br.com.caelum.apresentacao.bean.componentes;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class RadioButtonBean implements Serializable {
	
	private static final long serialVersionUID = 4205201638526711374L;
	private String console;
	
	public void mostraValorDoRadio() {
		System.out.println(console);
	}
	
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}

}
