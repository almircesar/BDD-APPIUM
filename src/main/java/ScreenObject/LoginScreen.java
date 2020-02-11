package ScreenObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginScreen {
	public WebElement element;
	public WebDriver driver;

	public LoginScreen(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout\\r\\n")
	private WebElement btnEntrarNoRegistrar;
	

	public void clicaEmRegistrar() {
		btnEntrarNoRegistrar.click();
	}

}
