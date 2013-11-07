package br.org.cesar.test;

import org.junit.Test;

import br.org.cesar.common.SobreOCESARPage;



/**
 * Classes com testes relacionados ao menu Sobre o CESAR
 */
public class SobreOCESARValidation extends BaseTestcase{



	/**
	 *  Abre o link "organiza��o" e verifica seu conte�do 
	 */
	@Test
	public void openOrganizacaoSubItem() {
		SobreOCESARPage.clickSobreOCESARMenu();
		SobreOCESARPage.clickOrganizacaoSubMenu();
		SobreOCESARPage.assertSubTitle("Organiza��o");
	}

}
