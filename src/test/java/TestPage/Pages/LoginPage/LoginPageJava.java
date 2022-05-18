package TestPage.Pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageJava {
    WebDriver driver;
    String EMAIL= "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]";
    String SENHA= "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]";
    String ACESSAR= "//button[contains(text(),'Acessar')]";
    public LoginPageJava(WebDriver driverVindoDoTeste){
this.driver= driverVindoDoTeste;
    }
    public void preencherEmail(String email){
    driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }
    public void preencherSenha(String senha){
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);
    }
    public void clicarAcessar() {
        driver.findElement(By.xpath(ACESSAR)).click();
    }
}
