package TestPage.Cenarios;

import TestPage.Pages.HomePage;
import TestPage.Pages.LoginPage.LoginPageJava;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TesteLogin {
    WebDriver driver;
    HomePage homePage;
    LoginPageJava loginPageJava;
    String email = "teste@gmail.com";
    String senha = "teste";

    @Before
    public void setup() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPageJava = new LoginPageJava(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:3000/");

    }

    @Test
    public void testeLoginComSucesso() {
        loginPageJava.preencherEmail(email);
        loginPageJava.preencherSenha(senha);
        loginPageJava.clicarAcessar();
        validarCriacaoUsuario();
        CadastrarUsuario();
    }

    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void validarCriacaoUsuario() {
        Assert.assertTrue(driver.getPageSource().contains("foi criada com sucesso"));

    }

    public void validarMensagem(String msg) {
        Assert.assertTrue(driver.getPageSource().contains(msg));

    }
    public void CadastrarUsuario() {
        homePage.registrar();
        homePage.preencherEmail("teste@gmail.com");
        homePage.preencherNome("Ricardo");
        homePage.preencherSenha("Teste");
        homePage.preencheConfirmaSenha("Teste");
        homePage.criarConta();
        homePage.cadastrar();
        System.out.println();

    }
}
