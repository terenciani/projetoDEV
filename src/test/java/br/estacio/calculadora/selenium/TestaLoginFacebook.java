/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.calculadora.selenium;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author aluno
 */
public class TestaLoginFacebook {

    public static WebDriver driver;

    @BeforeClass
    public static void configuracao() {
        //https://chromedriver.storage.googleapis.com/index.html?path=2.38/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aluno\\Documents\\NetBeansProjects\\projetoDEV\\webdriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.devmedia.com.br/login/login.asp?topo=login");
    }

    @Test
    public void testeLoginInexistente() {
        WebElement input = driver.findElement(By.name("usuario"));
        input.sendKeys("12345");
        
        
        input = driver.findElement(By.name("senha"));
        input.sendKeys("12345");
        
    }
}
