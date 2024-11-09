package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {



        public static void main(String[] args)
        {

            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.automationpractice.pl/index.php?");

            By signInLocator = By.cssSelector("a.login");
            WebElement signInLinkWebElement = driver.findElement(signInLocator);
            signInLinkWebElement.click();

            //suxoquqe@cyclelove.cc
            //button#SubmitCreate

		/*By enterEmailAddressLocator= By.cssSelector("input#email_create");
		WebElement enterEmailAddressElement = driver.findElement(enterEmailAddressLocator);
		enterEmailAddressElement.sendKeys("suxoquqe@cyclelove.cc");


		By createAccountLocator= By.cssSelector("button#SubmitCreate");
		WebElement createAccountElement = driver.findElement(createAccountLocator);
		createAccountElement.click();*/


            By emailTextBoxLocator = By.id("email");
            WebElement emailTextElement = driver.findElement(emailTextBoxLocator);
            emailTextElement.sendKeys("suxoquqe@cyclelove.cc");


            By passwordTextBoxLocator = By.id("passwd");
            WebElement passwordTextElement = driver.findElement(passwordTextBoxLocator);
            passwordTextElement.sendKeys("password");

            By submitLoginLocator = By.id("SubmitLogin");
            WebElement submitLoginElement = driver.findElement(submitLoginLocator);
            submitLoginElement.click();



        }



}
