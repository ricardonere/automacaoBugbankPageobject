package TestPage.Cenarios;

import TestPage.Pages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TesteCadastramento {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:3000/");
    }

    @Test
    public void testePositivoCadastro() {
        homePage.registrar();
        homePage.preencherEmail("teste@gmail.com");
        homePage.preencherNome("Ricardo");
        homePage.preencherSenha("Teste");
        homePage.preencheConfirmaSenha("Teste");
        homePage.criarConta();
        homePage.cadastrar();
        System.out.println();
        validarCriacaoUsuario();
    }

    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void validarCriacaoUsuario() {
        Assert.assertTrue(driver.getPageSource().contains("foi criada com sucesso"));

    }

    @Test
    public void testeCadastroVazio() {
        homePage.registrar();
        homePage.cadastrar();
        validarMensagem("Nome não pode ser vazio");
    }

    public void validarMensagem(String msg) {
        Assert.assertTrue(driver.getPageSource().contains(msg));

    }
}
