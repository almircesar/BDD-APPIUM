package Managers;

import org.openqa.selenium.WebDriver;

import ScreenObject.HomeScreen;
import ScreenObject.LoginScreen;
import ScreenObject.RegisterScreen;

public class ScreenObjectManager {

	private WebDriver driver;

	private HomeScreen homescreen;

	private RegisterScreen registerscreen;
	
	private LoginScreen loginScreen;
	


	public ScreenObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomeScreen getHome_Screen() {

		return (homescreen == null) ? homescreen = new HomeScreen(driver) : homescreen;

	}

	public RegisterScreen getRegisterScreen() {

		return (registerscreen == null) ? registerscreen = new RegisterScreen(driver) : registerscreen;

	}
	
	public LoginScreen getProductPage() {

		return (loginScreen == null) ? loginScreen = new LoginScreen(driver) : loginScreen;

	}
}

