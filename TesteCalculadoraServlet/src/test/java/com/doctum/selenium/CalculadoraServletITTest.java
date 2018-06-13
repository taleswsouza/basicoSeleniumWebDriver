/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doctum.selenium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Tales <tales.wallace at gmail.com>
 */
public class CalculadoraServletITTest {

    @Test
    public void testSoma() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\AppSW\\Selenium\\webdrivers\\ChromeDriver\\2.37\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("http://localhost:8080/calculadoraServlet/");

        driver.findElement(By.id("valorA")).sendKeys("9");
        driver.findElement(By.id("valorB")).sendKeys("6");
        new Select(driver.findElement(By.id("operacao"))).selectByVisibleText("Soma");

        driver.findElement(By.id("enviar")).submit();

        assertEquals("Resultado: 15.0", driver.findElement(By.id("resultado")).getText());

        driver.close();
    }

    @Test
    public void testSubtracao() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\AppSW\\Selenium\\webdrivers\\ChromeDriver\\2.37\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("http://localhost:8080/calculadoraServlet/");

        driver.findElement(By.id("valorA")).sendKeys("9");
        driver.findElement(By.id("valorB")).sendKeys("6");
        new Select(driver.findElement(By.id("operacao"))).selectByVisibleText("Subtração");

        driver.findElement(By.id("enviar")).submit();

        assertEquals("Resultado: 3.0", driver.findElement(By.id("resultado")).getText());

        driver.close();
    }

}
