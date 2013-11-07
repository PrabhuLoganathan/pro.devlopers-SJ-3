package br.org.cesar.test;


import org.junit.Test;

import br.org.cesar.common.HomePage;


/**
 * Classe de testes com cenários relacionados a página inicial
 */
public class HomePageValidation extends BaseTestcase{



	/**
	 *  Verifica o título da página
	 */
	@Test
	public void assertHomeScreenTitle() {
		HomePage.clickCompanyLogo();
		HomePage.assertTitle("C.E.S.A.R - Centro de Estudos e Sistemas Avançados do Recife");	
	}
	
	/**
	 *  Realiza busca por um determinado termo de busca e verifica o resultado exibido
	 */
	@Test
	public void performSimpleSearch() {
		HomePage.assertTitle("C.E.S.A.R - Centro de Estudos e Sistemas Avançados do Recife");	
		HomePage.performSearch("testes de software");
		HomePage.clickSearchButton();
		HomePage.isSearchResultsDisplayed();
	}
}
