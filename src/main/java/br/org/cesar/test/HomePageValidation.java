package br.org.cesar.test;


import org.junit.Test;

import br.org.cesar.common.HomePage;


/**
 * Classe de testes com cen�rios relacionados a p�gina inicial
 */
public class HomePageValidation extends BaseTestcase{



	/**
	 *  Verifica o t�tulo da p�gina
	 */
	@Test
	public void assertHomeScreenTitle() {
		HomePage.clickCompanyLogo();
		HomePage.assertTitle("C.E.S.A.R - Centro de Estudos e Sistemas Avan�ados do Recife");	
	}
	
	/**
	 *  Realiza busca por um determinado termo de busca e verifica o resultado exibido
	 */
	@Test
	public void performSimpleSearch() {
		HomePage.assertTitle("C.E.S.A.R - Centro de Estudos e Sistemas Avan�ados do Recife");	
		HomePage.performSearch("testes de software");
		HomePage.clickSearchButton();
		HomePage.isSearchResultsDisplayed();
	}
}
