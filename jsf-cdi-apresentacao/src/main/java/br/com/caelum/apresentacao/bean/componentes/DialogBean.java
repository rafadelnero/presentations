package br.com.caelum.apresentacao.bean.componentes;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.caelum.apresentacao.util.DialogUtil;

@Named
@ViewScoped
public class DialogBean implements Serializable {
	
	private static final long serialVersionUID = 6355552676036865477L;
	
	private String descricaoDialog = "Dialog com seu valor inicial!";
	
	public void invocaDialog() {
		setDescricaoDialog("Dialog invocada do Bean!");
		
		DialogUtil.show("dlgBasic");
	}

	public String getDescricaoDialog() {
		return descricaoDialog;
	}

	public void setDescricaoDialog(String descricaoDialog) {
		this.descricaoDialog = descricaoDialog;
	}
	
}
