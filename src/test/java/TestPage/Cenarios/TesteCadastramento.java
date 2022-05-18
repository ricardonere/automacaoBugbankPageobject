package TestPage.Cenarios;

import TestPage.Pages.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TesteCadastramento {
    WebDriver driver;
    HomePage homePage;
    @Before
    public void setup(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:3000/");
    }
    @Test
    public void testePositivoCadastro(){
        homePage.preencherEmail();
        homePage.preencherNome();
        homePage.preencherSenha();
        homePage.preencheConfirmaSenha();
        homePage.criarConta();
        homePage.cadastrar();
        homePage.registrar();
    }
    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
