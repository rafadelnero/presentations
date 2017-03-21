package br.com.caelum.apresentacao.bean.componentes;

import java.io.Serializable;

import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.caelum.apresentacao.util.DialogUtil;

@Named
@ViewScoped
public class CheckboxBean implements Serializable {
	
	private static final long serialVersionUID = -1406035237654667385L;
	private boolean checkboxChecado;
	
	public void mostraDialogComValorDoCheckbox(AjaxBehaviorEvent event) {
		DialogUtil.show("dlgValorCheckbox");
	}

	public boolean isCheckboxChecado() {
		return checkboxChecado;
	}

	public void setCheckboxChecado(boolean checkboxChecado) {
		this.checkboxChecado = checkboxChecado;
	}

}
