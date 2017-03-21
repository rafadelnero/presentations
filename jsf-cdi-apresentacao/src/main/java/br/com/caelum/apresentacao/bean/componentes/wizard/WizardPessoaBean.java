package br.com.caelum.apresentacao.bean.componentes.wizard;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.FlowEvent;

@Named
@ViewScoped
public class WizardPessoaBean implements Serializable {
	
	public static final String TAB_PESSOA_PASSO_1 = "tabPessoaPasso1";
	public static final String TAB_PESSOA_PASSO_2 = "tabPessoaPasso2";
	public static final String TAB_PESSOA_PASSO_3 = "tabPessoaPasso3";

	private static final long serialVersionUID = 1938135494496484160L;
	
	private WizardModel model = new WizardModel();

	public String onFlowProcess(FlowEvent event) {
		executaAcoesDoPasso1ParaPasso2(event);
		executaAcoesDoPasso2ParaPasso3(event);
		
		return event.getNewStep();
	}

	private void executaAcoesDoPasso1ParaPasso2(FlowEvent event) {
		boolean ehFluxoDePasso1 = event.getOldStep().equals(TAB_PESSOA_PASSO_1);
		boolean ehFluxoParaPasso2 = event.getNewStep().equals(TAB_PESSOA_PASSO_2);
	
		if (ehFluxoDePasso1 && ehFluxoParaPasso2) {
			System.out.println("Passo 1 para o passo 2!");
		}
	}

	private void executaAcoesDoPasso2ParaPasso3(FlowEvent event) {
		boolean ehFluxoDePasso2 = event.getOldStep().equals(TAB_PESSOA_PASSO_2);
		boolean ehFluxoParaPasso3 = event.getNewStep().equals(TAB_PESSOA_PASSO_3);
	
		if (ehFluxoDePasso2 && ehFluxoParaPasso3) {
			System.out.println("Passo 2 para o passo 3!" + getModel().getPessoa().getIdade());
		}
	}

	public WizardModel getModel() {
		return model;
	}

}
