package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HeaderNavPage {

   public WebDriver myDriver;   
   
   public HeaderNavPage(WebDriver driver)
   {
	   myDriver = driver;
   }
   public WebElement GetSearchTextBox()
   {
	   WebElement elem = myDriver.findElement(By.id("twotabsearchtextbox"));
	   return elem;
   }
   
   public WebElement GetSearchButton()
   {
	   WebElement elem = myDriver.findElement(By.className("nav-input"));
	   return elem;
   }
   
   public WebElement ShowCart()
   {
	   WebElement elm = myDriver.findElement(By.id("nav-cart-count"));
	   return elm;
   }
   
}
