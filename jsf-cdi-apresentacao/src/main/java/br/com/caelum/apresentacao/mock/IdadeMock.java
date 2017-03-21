package br.com.caelum.apresentacao.mock;

import java.util.ArrayList;
import java.util.List;

public final class IdadeMock {
	
	public static final int MINIMO_DE_IDADES = 18;
	public static final int MAXIMO_DE_IDADES = 28;
	
	private IdadeMock() {
		super();
	}
	
	public static List<Integer> getIdadesMinimas() {
		List<Integer> idadesMinimas = new ArrayList<>();
		
		for (int i = MINIMO_DE_IDADES; i < MAXIMO_DE_IDADES; i++) {
			idadesMinimas.add(i);
		}
		
		return idadesMinimas;
	}
}
