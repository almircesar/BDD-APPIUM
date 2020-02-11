package ScreenObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {
	
	WebDriver driver;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]\\r\\n")
	private WebElement btnOpcoes;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]\\r\\n")
	private WebElement btnLogin;
	

	public void clicaOpcoes() {
		btnOpcoes.click();
	}
	public void clicaLogin() {
		btnLogin.click();
		
	}


}

