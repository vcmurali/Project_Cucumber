package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ColorCheckPage {

	WebDriver driver; 
	 public ColorCheckPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//button[@type='button' and @onclick='myFunctionSky()']")
	public WebElement SkyBlueBackground;
	 @FindBy(how = How.XPATH, using = "//button[@type='button' and @onclick='myFunctionWhite()']")
	 WebElement WhiteBackground;

//---------------------------------------------------------------
// Set Sky blue background color
	 
	 public void setSkyBlueBackground() throws InterruptedException {
		 Thread.sleep(3000);
		 SkyBlueBackground.click();
	  try {
	   Thread.sleep(3000);
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	 }

//---------------------------------------------------------------//
// Set White background color
	 
	 public void setWhiteBackground() throws InterruptedException {
		 Thread.sleep(3000);
		 WhiteBackground.click();
	  try {
	   Thread.sleep(3000);
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	 }

}
