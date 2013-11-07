package br.org.cesar.test;

import org.junit.Test;

import br.org.cesar.common.SobreOCESARPage;



/**
 * Classes com testes relacionados ao menu Sobre o CESAR
 */
public class SobreOCESARValidation extends BaseTestcase{



	/**
	 *  Abre o link "organização" e verifica seu conteúdo 
	 */
	@Test
	public void openOrganizacaoSubItem() {
		SobreOCESARPage.clickSobreOCESARMenu();
		SobreOCESARPage.clickOrganizacaoSubMenu();
		SobreOCESARPage.assertSubTitle("Organização");
	}

}
