package TestPage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    WebDriver driver ;
    String REGISTRAR = "//button[contains(text(),'Registrar')]";
    String EMAIL = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]";

    String NOME = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]";
    String SENHA = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";
    String CONFIRM_SENHA = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]";
    String CRIAR_CONTA = "//label[@id='toggleAddBalance']";
    String CADASTRAR = "//button[contains(text(),'Cadastrar')]";


    public void registrar() {
        driver.findElement(By.xpath(REGISTRAR)).click();
    }
    public HomePage(WebDriver driverParametro) {
        this.driver = driverParametro;

    }

    public void preencherEmail(String email) {
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void preencherNome(String nome) {
        driver.findElement(By.xpath(NOME)).sendKeys(nome);
    }

    public void preencherSenha(String senha) {
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);
    }

    public void preencheConfirmaSenha(String confirmaSenha) {
        driver.findElement(By.xpath(CONFIRM_SENHA)).sendKeys(confirmaSenha);
    }

    public void criarConta() {
        driver.findElement(By.xpath(CRIAR_CONTA)).click();
    }

    public void cadastrar() {
        driver.findElement(By.xpath(CADASTRAR)).click();
    }


    }
