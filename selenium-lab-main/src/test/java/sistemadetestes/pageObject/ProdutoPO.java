package sistemadetestes.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {

	@FindBy(id = "btn-adicionar")
	public WebElement buttonCriar;
	
	@FindBy(id = "btn-salvar")
	public WebElement buttonSalvar;
	
	@FindBy(id = "btn-sair")
	public WebElement buttonSair;
	
	@FindBy(css = "button.btn.btn-link")
	public WebElement buttonEditar;
	
	@FindBy(className = "close")
	public WebElement buttonFechar;

	@FindBy(id = "codigo")
	public WebElement inputCodigo;

	@FindBy(id = "nome")
	public WebElement inputNome;

	@FindBy(id = "quantidade")
	public WebElement inputQuantidade;

	@FindBy(id = "valor")
	public WebElement inputValor;

	@FindBy(id = "data")
	public WebElement inputData;

	// document.querySelector('form>div.alert>span')
	// document.querySelector('form.form-login>div.alert>span').textContent
	@FindBy(css = "modal-dialog.modal-content.modal-body>div.alert-danger>span")
	public WebElement spanMensagem;
	// capturar a mensagem funciona por id também

	/**
	 * Construtor padrão para criação de uma nova instância da página de login
	 * 
	 * @param driver Driver da página de login
	 */
	public ProdutoPO(WebDriver driver) {
		super(driver);
	}

	public String obterMensagem() {
		return this.spanMensagem.getText();
	}

	public void escrever(WebElement input, String texto) {
		input.clear();
		input.sendKeys(texto + Keys.TAB);
	}
	
	public String obterTituloPagina() {
		return driver.getTitle();
	}
	/**
	 * Método que tenta executar a ação no sistema
	 * 
	 * @param email Email para tentativa de login
	 * @param senha Senha para tentativa de login
	 */
	public void executarAcaoDeCriar(String codigo, String nome, String quantidade, String valor, String data) {
		escrever(inputCodigo, codigo);
		escrever(inputNome, nome);
		escrever(inputQuantidade, quantidade);
		escrever(inputValor, valor);
		escrever(inputData, data);
		buttonSalvar.click();
	}
	


}
