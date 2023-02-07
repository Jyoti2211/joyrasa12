package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric_scripts.Framework_constant;

public class Genric_pom{

	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement logbtn;
	
	public  Genric_pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void username(String un)
	{
		user.sendKeys(un);
	}
	public void pssword(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void loginn()
	{
		logbtn.click();
	}
}
