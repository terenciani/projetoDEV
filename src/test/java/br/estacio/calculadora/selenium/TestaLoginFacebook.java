/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.calculadora.selenium;

import org.junit.Assert;
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
        //https://github.com/mozilla/geckodriver/releases - FIREFOX
        //https://chromedriver.storage.googleapis.com/index.html?path=2.38/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aluno\\Documents\\NetBeansProjects\\projetoDEV\\webdriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://gitlab.com/users/sign_in");
    }

    @Test
    public void testeLoginInexistente() {
        WebElement input = driver.findElement(By.name("user[login]"));
        input.sendKeys("12345");
        
        
        input = driver.findElement(By.name("user[password]"));
        input.sendKeys("12345");
        
        driver.findElement(By.name("commit")).click();
        Assert.assertEquals("Sign in · GitLab", driver.getTitle());
    }
}
