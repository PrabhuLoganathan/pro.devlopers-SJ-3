package br.org.cesar.common;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.org.cesar.util.Utils;



/**
 * P�gina que representa os servi�os dispon�veis no sub-menu sobre o CESAR
 * @author jcan
 *
 */
public class SobreOCESARPage {

	/**
	 * Instancia privada do webDriver
	 */
	private static final WebDriver driver;
	private static final WebDriverWait wait;

	/**
	 * 
	 * Construtor que ira adicionar a instancia do WebDriver para utilizacao dos metodos
	 */
	static {
		driver = Selenium.getDriver();
		wait = new WebDriverWait(driver, 10);
	}
	
	/**
	 * Defini��o �nica dos locators utilizados na p�gina
	 */
	static By sobreOCesarMenuLocator = By.linkText("SOBRE O C.E.S.A.R");
	static By organizacaoMenuLocator = By.linkText("Organiza��o");
	static By pageSubTitleLocator = By.cssSelector("h2");
	
	public SobreOCESARPage() {
	}

	/**
	 * Clicar no menu Sobre o CESAR
	 */
	public static void clickSobreOCESARMenu(){
		driver.findElement(sobreOCesarMenuLocator).click();
	}	
	
	/**
	 * Clicar no sub-menu Organiza��o
	 */
	public static void clickOrganizacaoSubMenu() { 
		Utils.isVisible(organizacaoMenuLocator);
		driver.findElement(organizacaoMenuLocator).click(); 
	}

	
	/**
	 * Checa se o sub-titulo da p�gina � o esperado
	 * @param texto
	 */
	public static void assertSubTitle(String texto){
		wait.until(ExpectedConditions.visibilityOfElementLocated(pageSubTitleLocator));
		Assert.assertEquals(texto, driver.findElement(pageSubTitleLocator).getText());
	}


}