package br.com.caelum.apresentacao.util;

import org.primefaces.context.RequestContext;

public final class DialogUtil {
	
	private DialogUtil() {
		super();
	}
	
	public static void show(String nomeDaDialog) {
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('" + nomeDaDialog + "').show();");
	}

}
