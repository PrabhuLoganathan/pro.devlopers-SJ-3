package br.org.cesar.common;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * P�gina que disponibiliza os servi�os (a��es) presentes na home page do CESAR.ORG.BR
 * @author jcan
 *
 */
public class HomePage {

	/**
	 * Instancia privada do webDriver que vir� da suite de teste
	 */
	private static final WebDriver driver;
	private static final WebDriverWait wait;

	/**
	 * Construtor que ira adicionar a instancia do WebDriver para utilizacao dos metodos
	 */
	static {
		driver = Selenium.getDriver();
		wait = new WebDriverWait(driver, 10);
	}
	
	/**
	 * Defini��o �nica dos locators utilizados na p�gina
	 */
    static By companyLogoLocator = By.cssSelector("a.block.indent");
    static By searchFieldLocator = By.id("s");
    static By searchButtonLocator = By.id("searchsubmit");
    static By searchTitleLocator = By.id("title-search-result");
    
	public HomePage() {
	}

	/**
	 * Clica no logo da empresa 
	 */
	public static void clickCompanyLogo(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(companyLogoLocator));
		driver.findElement(companyLogoLocator).click();
	}	
	
	/**
	 * Digita o texto passado no campo de busca
	 */
	public static void performSearch(String searchText) { 
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldLocator));
		driver.findElement(searchFieldLocator).sendKeys(searchText);
	}
	
	/**
	 * Clicar no bot�o buscar
	 */
	public static void clickSearchButton() { 
		driver.findElement(searchButtonLocator).click(); 
	}
	
	/**
	 * Checa se o t�tulo da p�gina � o esperado
	 */
	public static void isSearchResultsDisplayed(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchTitleLocator));
		String title = driver.findElement(searchTitleLocator).getText();
		Assert.assertEquals("Resultado da Busca", title);
	}
	
	/**
	 * Checar se o t�tulo da p�gina � o esperado
	 * @param texto
	 */
	public static void assertTitle(String texto){
		wait.until(ExpectedConditions.visibilityOfElementLocated(companyLogoLocator));
		Assert.assertEquals(texto, driver.getTitle());
	}
	

}