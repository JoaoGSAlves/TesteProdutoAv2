package sistemadetestes.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import sistemadetestes.pageObject.ProdutoPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutoTest extends BaseTest {

	private static ProdutoPO criarPage;

	@BeforeClass
	public static void prepararTestes() {
		criarPage = new ProdutoPO(driver);
	}

	@Test
	
	
	public void TC001_deveAbrirTelaDeCadastroAoClicarDuasVezesNoCriar() {
		criarPage.buttonCriar.click();
		criarPage.buttonCriar.click();
		criarPage.buttonFechar.click();
	}

	@Test
	public void TC002_deveCriarCamposEmBrancoNoModal() {
		criarPage.buttonCriar.click();
		criarPage.executarAcaoDeCriar(" ", " ", " ", " ", "01/01/2001");
		criarPage.buttonSalvar.click();
		criarPage.buttonSair.click();
	}
	

	@Test
	public void TC003_deveEditarUmProdutoAoClicarEmEditarOuExcluir() {
		criarPage.buttonEditar.click();
		criarPage.buttonEditar.click();
		
	}

}