package br.com.caelum.apresentacao.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {

	public static boolean isPostBack() {
		return FacesContext.getCurrentInstance().isPostback();
	}

	public static boolean isNotPostBack() {
		return !isPostBack();
	}

	public static void addErrorMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));
	}

	public static void addInfoMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, message, message));
	}
	
	public static String getParam(String nomeDoParametro) {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(nomeDoParametro);  
	}
}
